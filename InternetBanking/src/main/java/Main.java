import connect.ConnectJDBC;
import model.Transaction;
import model.User;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random rd = new Random();
        int num = rd.nextInt(10000);

        Scanner sc = new Scanner(System.in);

        ArrayList<User> list = new ArrayList<>();
        ArrayList<Transaction> list1 = new ArrayList<>();

        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection conn = connectJDBC.connect();

        String query = "SELECT * FROM `User`";
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {
                String id_user = rs.getString("id_user");
                String phoneNumber = rs.getString("phoneNumber");
                String password = rs.getString("password");
                String account = rs.getString("account");
                int balance = rs.getInt("balance");

                list.add(new User(id_user, phoneNumber, password, account, balance));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        for (User u : list) {
            System.out.println(u);
        }

        System.out.println("Đăng nhập");
        System.out.println();
        System.out.println("Nhập số điện thoại: ");
        String phone = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String pw = sc.nextLine();

        for (User u : list) {
            if (Objects.equals(phone, u.getPhoneNumber()) && Objects.equals(pw, u.getPassword())) {
                System.out.println("Đăng nhập thành công. Xin chào " + u.getAccount());
                System.out.println();
                System.out.println("1. Xem số dư");
                System.out.println("2. Chuyển tiền");
                System.out.println("3. Xem lịch sử giao dịch");
                System.out.println();
                System.out.println("Nhập lựa chọn của bạn: ");

                int number = sc.nextInt();
                sc.nextLine();

                switch (number) {
                    case 1:
                        System.out.println("Số dư tài khoản của bạn là: " + u.getBalance());
                        break;
                    case 2:
                        System.out.println("Nhập số tài khoản muốn chuyển tiền: ");
                        String account_banking = sc.nextLine();

                        if (!Objects.equals(u.getAccount(), account_banking)) {
                            System.out.println("Nhập số tiền muốn chuyển: ");
                            int money_banking = sc.nextInt();
                            int surplus = u.getBalance() - money_banking;

                            if (surplus < 50000) {
                                System.out.println("Số dư tài khoản phải lớn hơn 50000");
                            } else if (money_banking < 50000) {
                                System.out.println("Số tiền chuyển phải lớn hơn 50000");
                            } else {
                                System.out.println("Nhập nội dung chuyển tiền: ");
                                sc.nextLine();
                                String content_banking = sc.nextLine();
                                System.out.println("Chuyển khoản thành công, số dư còn lại là: " + surplus);

                                String query2 = "UPDATE User SET balance = ? WHERE id_user = ?";
                                PreparedStatement preStatement = null;
                                try {
                                    preStatement = conn.prepareStatement(query2);
                                    preStatement.setString(1, String.valueOf(surplus));
                                    preStatement.setString(2, u.getAccount());
                                    int row1 = preStatement.executeUpdate();
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }

                                String query3 = "UPDATE User SET balance = balance + ? WHERE id_user = ?";
                                PreparedStatement preparedStatement1 = null;
                                try {
                                    preparedStatement1 = conn.prepareStatement(query3);
                                    preparedStatement1.setInt(1, money_banking);
                                    preparedStatement1.setString(2, account_banking);
                                    int row2 = preparedStatement1.executeUpdate();
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }

                                String query4 = "INSERT INTO TransactionHistory(id, id_user, content, date, account, money)" + "VALUES (?, ?, ?, ?, ?, ?)";
                                PreparedStatement pstm = null;
                                try {
                                    pstm = conn.prepareStatement(query4);

                                    pstm.setInt(1, num);
                                    pstm.setString(2, u.getId_user());
                                    pstm.setString(3, content_banking);
                                    pstm.setString(4, String.valueOf(java.time.LocalDate.now()));
                                    pstm.setString(5, account_banking);
                                    pstm.setString(6, String.valueOf(money_banking));

                                    int row = pstm.executeUpdate();
                                    conn.close();
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                            }
                        } else {
                            System.out.println("Tài khoản không hợp lệ");
                        }
                        break;
                    case 3:
                        System.out.println("Lịch sử giao dịch: ");

                        String query1 = "SELECT * FROM `TransactionHistory`";
                        try {
                            Statement stm = conn.createStatement();
                            ResultSet rs = stm.executeQuery(query1);

                            while (rs.next()) {
                                String id = rs.getString("id");
                                String id_user = rs.getString("id_user");
                                String content = rs.getString("content");
                                Date date = rs.getDate("date");
                                String account = rs.getString("account");
                                int money = rs.getInt("money");

                                list1.add(new Transaction(id, id_user, content, date, account, money));
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }

                        for (Transaction s : list1) {
                            if (Objects.equals(s.getUser_id(), u.getId_user())) {
                                System.out.println(s);
                            }
                        }
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ");
                }
            } else {
                System.out.println();
            }
        }
    }
}

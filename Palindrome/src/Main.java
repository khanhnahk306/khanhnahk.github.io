import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello every one", str2;
        int dem = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'e') {
                dem++;
                System.out.println("Vị trí của ký tự e: " + i);
            }
        }
        System.out.println("Ký tự e xuất hiện: " + dem + " lần");

        System.out.println("Nhập vào 1 chuỗi bất kỳ: ");
        str2 = sc.nextLine();
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == str2.charAt(str2.length() - i - 1)){
                System.out.println("Chuỗi vừa nhập là chuỗi palindrome");
                break;
            }else {
                System.out.println("Chuỗi vừa nhập không là chuỗi palindrome");
                break;
            }
        }
    }
}

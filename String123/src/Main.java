import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b;
        int c;
        String str1, str2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi thứ nhất: ");
        str1 = sc.nextLine();
        System.out.println("Nhập vào chuỗi thứ hai: ");
        str2 = sc.nextLine();

        System.out.println(str1.equals(str2));
        System.out.println(str1.length() == str2.length());
        System.out.println(str1.contains(str2));

        System.out.println("Nhập vào 2 cạnh góc vuông: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        double result1 = Triangle.hypotenuse(a, b);
        System.out.printf("Độ dài cạnh huyền là:%.2f ", result1);

        System.out.println("\nNhập vào bàn phím 1 số bất kì: ");
        c = sc.nextInt();
        Random random = new Random();
        int randomNum = random.nextInt();
        System.out.println(randomNum);
        String ss = c == randomNum ? "Hai số bằng nhau" : "Hai số khác nhau";
        System.out.println(ss);
    }
}

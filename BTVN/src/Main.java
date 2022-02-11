import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập bán kính hình tròn: ");
        r = sc.nextDouble();
        double result1 = Circle.chuVi(r);
        System.out.println("Chu vi: " + result1);
        double result2 = Circle.dienTich(r);
        System.out.println("Diện tích: " + result2);

        System.out.println("Nhập độ dài 3 cạnh hình tam giác: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double result3 = Triangle.chuVi(a, b, c);
        System.out.println("Chu vi: " + result3);
        double result4 = Triangle.dienTich(a, b, c);
        System.out.println("Diện tích: " + result4);

        System.out.println("Nhập độ dài 2 cạnh hình chữ nhật: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        double result5 = Rectangle.chuVi(a, b);
        System.out.println("Chu vi: " + result5);
        double result6 = Rectangle.dienTich(a, b);
        System.out.println("Diện tích: " + result6);
    }
}

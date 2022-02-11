import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        float c, f;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập 2 số a và b: ");
        a = sc.nextInt();
        b = sc.nextInt();
        int result1 = Calculator.sum(a, b);
        System.out.println("Tổng 2 số là: " + result1);
        int result2 = Calculator.sub(a, b);
        System.out.println("Hiệu 2 số là: " + result2);
        int result3 = Calculator.mul(a, b);
        System.out.println("Tích 2 số là: " + result3);
        double result4 = Calculator.div(a, b);
        System.out.println("Thương 2 số là: " + result4);
        double result5 = Calculator.pow(a, b);
        System.out.println("Lũy thừa 2 số là: " + result5);

        System.out.println("Nhập độ C: ");
        c = sc.nextFloat();
        float result7 = Temperature.CtoF(c);
        System.out.println( c + " độ C chuyển qua độ F là: " + result7 + " độ F");

        System.out.println("Nhập độ F: ");
        f = sc.nextFloat();
        float result8 = Temperature.FtoC(f);
        System.out.println( f + " độ F chuyển qua độ C là: " + result8 + " độ C");
    }
}

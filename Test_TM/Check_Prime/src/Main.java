import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số n: ");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n < 2) {
            System.out.println("Nhập lại");
        } else {

            for (int i = 2; i <= (n / 2); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n + " là số nguyên tố");
            } else {
                System.out.println(n + " không là số nguyên tố");
            }
        }
    }

}

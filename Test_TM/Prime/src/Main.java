import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0, i = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số n: ");
        int n = sc.nextInt();
        System.out.printf("", n);
        while (count < n) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }

    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


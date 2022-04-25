public class Main {
    public static void main(String[] args) {
        System.out.println(myPow(2, 3));
    }

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * myPow(x, n - 1);
        }

    }
}

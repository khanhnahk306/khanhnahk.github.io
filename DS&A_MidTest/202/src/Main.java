public class Main {
    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }

    public static boolean isHappy(int n) {
        int S = 0, num = 0;
        while (n > 6) {
            while (n > 0) {
                num = n % 10;
                S += num * num;
                n = n / 10;

            }
            n = S;
            S = 0;
        }
        if (n == 1) {
            return true;
        } else return false;
    }
}

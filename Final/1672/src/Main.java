public class Main {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int row = accounts.length;
        int col = accounts[0].length;
        int temp = 0;

        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum += accounts[i][j];
            }
            if (temp < sum) {
                temp = sum;
            }
        }
        return temp;
    }
}

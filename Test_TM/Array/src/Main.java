import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mang2chieu();
    }
    public static int[][] Mang2chieu() {
        System.out.println("Nhập số hàng và cột của mảng: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] a = new int[row][column];

        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Các phần tử của mảng là: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("Các phần tử ở đường chéo chính là: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == j){
                    System.out.print(a[i][j] + "\t");
                }
            }
            System.out.print("\t");
        }
        return a;
    }
}

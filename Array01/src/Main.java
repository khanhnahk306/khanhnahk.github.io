import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Standardize();
        Array();
    }

    public static String[] Standardize() {
        //Nhập chuỗi
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên của ban: ");
        String str1 = sc.nextLine();

        //Chuẩn hóa chuỗi
        str1 = str1.trim().toLowerCase();
        str1 = str1.replaceAll("\\s+", " ");
        String[] str2 = str1.split(" ");
        System.out.println("Chuỗi sau khi chuẩn hóa: ");
        for (int i = 0; i < str2.length; i++) {
            str1 = String.valueOf(str2[i].charAt(0)).toUpperCase() + str2[i].substring(1);
            if (i < str2.length - 1) {
                str1 += " ";
            }
            System.out.print(str1);
        }
        return str2;
    }

    public static int[] Array() {
        //Nhập mảng, in ra màn hình
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] number = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }
        System.out.println("Các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print(number[i] + "\t");
        }

        //Thay đổi phần tử chẵn thành lẻ
        for (int i = 0; i < n; i++) {
            if (number[i] % 2 == 0) {
                number[i] = number[i] + 1;
            }
        }
        System.out.println("\nMảng sau khi cập nhật: ");
        for (int i = 0; i < n; i++) {
            System.out.print(number[i] + "\t");
        }
        return number;
    }
}

public class Main {
    public static void main(String[] args) {
        String str1 = "You only live once, but if you do it right, once is enough";
        String[] str2 = str1.split(" ");
        int count = 0, count1 = 0;

        for (int i = 0; i < str2.length; i++) {
            count++;
        }
        System.out.println("Số từ của chuỗi là: " + count);

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'o') {
                count1++;
                System.out.println("Vị trí của ký tự o: " + i);
            }
        }
        System.out.println("Ký tự o xuất hiện: " + count1 + " lần");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(minOperations(new String[]{"d1/", "d2/", "../", "d21/", "./"}));
    }

    public static int minOperations(String[] logs) {
        int count = 0;
        for (String log : logs) {
            if (log.equals("../")) {
                if (count != 0) {
                    count--;
                }
            } else if (!log.equals("./")) {
                count++;
            }
        }
        return count;
    }
}

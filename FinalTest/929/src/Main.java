import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet();
        for (String s : emails) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char charAt = s.charAt(i);
                if (charAt == '+' || charAt == '@') {
                    stringBuilder.append('@');
                    i = s.indexOf("@") + 1;
                    stringBuilder.append(s.substring(i));
                    break;
                } else if (charAt != '.') {
                    stringBuilder.append(charAt);
                }
            }
            set.add(stringBuilder.toString());
        }
        return set.size();
    }
}

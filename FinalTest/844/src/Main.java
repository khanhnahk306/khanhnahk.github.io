import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab##", "c#d#"));
    }

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (charAt != '#')
                st1.push(charAt);
            else if (!st1.isEmpty())
                st1.pop();
        }
        for (int i = 0; i < t.length(); i++) {
            char charAt = t.charAt(i);
            if (charAt != '#')
                st2.push(charAt);
            else if (!st2.isEmpty())
                st2.pop();
        }
        while (!st1.isEmpty() && !st2.isEmpty()) {
            if (st1.pop() != st2.pop())
                return false;
        }
        return st1.isEmpty() && st2.isEmpty();
    }
}

import java.util.Scanner;

public class LowercaseCompare {
    static String toLowerCaseCustom(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result += ch;
        }
        return result;
    }

    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String custom = toLowerCaseCustom(text);
        String builtin = text.toLowerCase();

        System.out.println("Custom Lowercase: " + custom);
        System.out.println("Built-in Lowercase: " + builtin);
        System.out.println("Both equal? " + compareStrings(custom, builtin));
    }
}

import java.util.Scanner;

public class ToCharArrayCompare {
    static char[] customToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] arr1 = customToCharArray(text);
        char[] arr2 = text.toCharArray();

        System.out.println("Custom method result: " + new String(arr1));
        System.out.println("Built-in method result: " + new String(arr2));
        System.out.println("Both results equal? " + compareArrays(arr1, arr2));
    }
}

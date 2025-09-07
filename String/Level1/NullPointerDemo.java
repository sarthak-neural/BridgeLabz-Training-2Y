public class NullPointerDemo {
    static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Uncomment next line to see program crash
        // generateException();

        handleException();
    }
}

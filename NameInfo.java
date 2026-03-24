public class NameInfo {
    public static void main(String[] args) {
        String name = "Benji"; // Example name, you can change this value to test with different names.

        if (name.length() <= 5) {
            System.out.println("Your name is short.");
        } else if (name.length() <= 10) {
            System.out.println("Your name is medium length.");
        } else if (name.length() >= 11) {
            System.out.println("Your name is long.");
        }
    }
}
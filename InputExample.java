// This program checks movie rating eligibility.

public class InputExample {
    public static void main(String[] args) {

        int age = 14; // Example age, you can change this value to test with different ages.

        if (age >= 17) {
            System.out.println("You can watch R-rated movies.");
        } else if (age >= 13) {
            System.out.println("You can watch PG-13 movies.");
        } else if (age >= 7) {
            System.out.println("You can watch PG movies.");
        } else {
            System.out.println("You can watch G-rated movies.");
        }
    }
}

import java.util.Scanner;

public class NameInfo2 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter your first name: ");
String name = input.nextLine();
System.out.println("Hello, " + name + "!");
System.out.println("Your name has " + name.length() + " characters");
}
}
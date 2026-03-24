// This program demonstrates substring() with inclusive/exclusive indices.
public class SubstringBasic {
public static void main(String[] args) {
String word = "Banana";
System.out.println(word.substring(0, 3)); // "Ban"
System.out.println(word.substring(3)); // "ana"
System.out.println(word.substring(1, 4)); // "ana"
}
}
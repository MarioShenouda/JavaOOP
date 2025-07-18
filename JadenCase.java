import java.util.Scanner;

public class JadenCase {
    public static String toJadenCase(String quote) {
        if (quote == null || quote.isEmpty()) {
            return null;
        }
        // Split the string into words using a space as the delimiter.
        String[] words = quote.split(" ");
        StringBuilder jadenCased = new StringBuilder();

        // Process each word.
        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize the first character and make the rest lowercase.
                jadenCased.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    jadenCased.append(word.substring(1).toLowerCase());
                }
                // Append a space after each word.
                jadenCased.append(" ");
            }
        }
        // Remove the extra space at the end and return the result.
        return jadenCased.toString().trim();
    }

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Insert the Sentenze you want to change: ");
        String quote = scanner.nextLine();
        String jadenCasedQuote = toJadenCase(quote);
        System.out.println(jadenCasedQuote);
        // Output: "How Can Mirrors Be Real If Our Eyes Aren't Real"
    }
}

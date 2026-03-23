import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String word = "sunshine";
    // Find the length of the string
    System.out.println(word.length());  // 8
    // Concatenate (add) two strings together and reassign the result
    word = word + " today";
    System.out.println(word);  // sunshine today
    // Find the value of the character at index 3
    System.out.println(word.charAt(3));  // s
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(word.contains("shine"));  // true
    System.out.println(word.contains("rain"));   // false
    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < word.length(); i++) {
      System.out.println(word.charAt(i));
    }
    // Create an ArrayList of Strings and assign it to a variable
    List<String> words = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    words.add("cats");
    words.add("dogs");
    words.add("birds");
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joined = String.join(", ", words);
    System.out.println(joined);  // cats, dogs, birds
    // Check whether two strings are equal
    String a = "hello";
    String b = "hello";
    System.out.println(a.equals(b));  // true
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}

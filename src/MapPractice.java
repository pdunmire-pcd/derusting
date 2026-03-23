import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> scores = new HashMap<>();
    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    scores.put("Alice", 95);
    scores.put("Bob", 82);
    scores.put("Carol", 78);
    // Get the value associated with a given key in the Map
    System.out.println(scores.get("Bob"));  // 82
    // Find the size (number of key/value pairs) of the Map
    System.out.println(scores.size());  // 3
    // Replace the value associated with a given key (the size of the Map shoukld not change)
    scores.put("Bob", 90);
    // Check whether the Map contains a given key
    System.out.println(scores.containsKey("Alice"));   // true
    System.out.println(scores.containsKey("David"));   // false
    // Check whether the Map contains a given value
    System.out.println(scores.containsValue(95));   // true
    System.out.println(scores.containsValue(50));   // false
    // Iterate over the keys of the Map, printing each key
    for (String name : scores.keySet()) {
      System.out.println(name);
    }
    // Iterate over the values of the map, printing each value
    for (int score : scores.values()) {
      System.out.println(score);
    }
    // Iterate over the entries in the map, printing each key and value
    for (Map.Entry<String, Integer> entry : scores.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}

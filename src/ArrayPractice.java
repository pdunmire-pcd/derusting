public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] colors = new String[4];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    colors[0] = "Red";
    colors[1] = "Blue";
    colors[2] = "Green";
    colors[3] = "Yellow";
    // Get the value of the array at index 2
    System.out.println(colors[2]);  // Green
    // Get the length of the array
    System.out.println(colors.length);  // 4
    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < colors.length; i++) {
      System.out.println(colors[i]);
    }
    // Iterate over the array using a for-each loop and print out each item
    for (String color : colors) {
      System.out.println(color);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}

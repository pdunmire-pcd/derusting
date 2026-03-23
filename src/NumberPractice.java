public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float myFloat = -3.14f;
    // Create an int with a positive value and assign it to a variable
    int myInt = 17;
    // Use the modulo % operator to find the remainder when the int is divided by 3
    int remainder = myInt % 3;
    System.out.println("Remainder when divided by 3: " + remainder);
    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
    if (myInt % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
    // Divide the number by another number using integer division
    int divided = myInt / 3;
    System.out.println("17 / 3 = " + divided);
    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}

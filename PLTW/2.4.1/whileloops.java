/*
 * Activity 2.4.1
 */
import java.util.Scanner;

/*
 * Collects a user value between 1 and 12 inclusive and prints 
 * the corresponding month of the year
 */
public class Main
{
  public static void main(String[] args)
  {
    String month = getInput();
    // Display the end result before program termination
    System.out.println("The month you chose was: " + month);
  }
  
  /**
   * Determine whether a given String can be parsed as an integer.
   * @param str a String with unknown contents
   * @return true if str can be parsed as an integer, false otherwise.
   */
  public static boolean isInteger(String str) 
  {
    // null references are not integers.
    if (str == null) 
    {
      return false;
    }
    
    // an intermediary variable storing the length of str
    // because we will be reusing that value.
    int length = str.length();
    
    // empty strings cannot be parsed as integers
    if (length == 0) 
    {
        return false;
    }
    
    // this will count the current position in str
    // begins at index 0
    int i = 0;
    
    // Check for a negative symbol at the beginning of str
    if (str.substring(0, 1).equals("-")) 
    {
        // a String that contains just the negative symbol is not an int.
        if (length == 1) 
        {
            return false;
        }
        // advance to the first potential digit given a leading negative symbol
        i = 1;
    }
    
    // This loop will terminate if i becomes equal to or greater than length
    while (i < length)
    {
      // characterAtIndex stores the single element substring at position i within str
      String characterAtIndex = str.substring(i, i+1);
      // if any character in str (after a potential leading negative symbol)
      // precedes 0 or exceeds 9, it will be a letter or symbol that cannot
      // represent a digit. These letters or symbols will lead to an str value
      // that cannot be parsed as an int.
      if (characterAtIndex.compareTo("0") < 0 || 
        characterAtIndex.compareTo("9") > 0)
      {
        return false;
      }
      // incrementing the value of i each iteration by one ensures
      // that the loop will terminate when i == length
      i += 1;
    }
    // Having made it past all the conditions that could possibly lead
    // to a value of str that could not be parsed as an int, 
    return true;
  }
  
  /**
   * Uses a String containing the months of the year separated by spaces to 
   * retreive the month represented by monthNumber
   * @param monthNumber Precondition: monthNumber is an int between 1 and 12 inclusive
   * @return the month corresponding to monthNumber
   */
  public static String getMonth(int monthNumber)
  {
    String months = "January February March April May June July August September October November December";

    int numberOfSpaces = 0;

    String monthBuilder = months;

    while (numberOfSpaces < monthNumber - 1)
    {
      monthBuilder = monthBuilder.substring(monthBuilder.indexOf(" ") + 1);
      numberOfSpaces += 1;
    }

    if (monthBuilder.indexOf(" ") == -1)
    {
      return monthBuilder;
    }

    monthBuilder = monthBuilder.substring(0, monthBuilder.indexOf(" "));

    return monthBuilder;
  }
  
  /**
   * Collects user input and calls helper methods to process it.
   * @return
   */
  public static String getInput()
  {
    // Instantiate a Scanner using the standard input (terminal/command line)
    Scanner sc = new Scanner(System.in);
    // Prompt the user for input
    System.out.println("Enter an integer between 1 and 12 inclusive: ");
    // The next line typed by a user (terminiating with the enter/return key) is stored as input.
    String input = sc.nextLine();
    
    // The termination condition for this loop is user input that can be parsed as an integer
    // with value between 1 and 12 inclusive.
    while (!isInteger(input) || Integer.parseInt(input) > 12 || Integer.parseInt(input) < 1)
    {
      // re-prompt the user ot provide the specified kind of input.
      System.out.println("Please enter an integer between 1 and 12 inclusive: ");
      // Store a new value for input.
      input = sc.nextLine();
    }
    // Display the user's input
    System.out.println("Your integer was: " + input);
    // returns the value produced by the getMonth method, as determined by the parameter
    // resulting from parsing the user's String input as an Integer.  
    return getMonth(Integer.parseInt(input));
  }
  
}
/*
 * Activity 2.4.1
 * Use the starter code below and your prior experience to write an algorithm 
 * that determines the maximum and minimum values in a set of user-provided integers 
 * without using any String methods.
 */
import java.util.Scanner;
import java.util.*;

public class MinAndMax
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    List <Integer> listOfInts = new ArrayList<Integer>();
    while (true){
    System.out.println("Would you like to add a number? Enter a 0 for no, or a 1 for yes.");
     int inputAnswer = sc.nextInt();
     if (inputAnswer == 0){
      // This is where I will call my code for finding the max and min
      int tempValue = listOfInts.get(0);
      int maxVal;
      int minVal;
      for (int x: listOfInts){
        //Finding Max
        if (x > tempValue){
          maxVal = x;
        }
        
      }

      for (int x: listOfInts){
        // Finding min value
        if (x < tempValue){
          minVal = x;
          
        }
      }

      System.out.println("The max value is " + maxVal + " and the min value is " + minVal + ".");
      break;
     }

     else if (inputAnswer == 1){
      System.out.println("Please input a number");
      int userInput = sc.nextInt();
      listOfInts.add(userInput);
     }
      


    }
  }
  
}


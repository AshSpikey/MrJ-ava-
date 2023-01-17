package APCompSci.PLTW.Sort376Sort;

/**
 * Avticity 3.7.6
 */
import java.util.ArrayList;

public class SortingAlgorithms
{
  /**
   * Perform a selection sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> selectionSortInt(ArrayList<Integer> intList)
  {
    int i = 0;
    while(i < intList.size()){
      int smallestValue = intList.get(i);
      int smallestValueIndex = i;
      
      
      for(int o = i; o < intList.size(); o ++){ // Finds the smallest value in the list 
        if(intList.get(o) < smallestValue){
          smallestValue = intList.get(o);
          smallestValueIndex = o;
        }
      }


      int tempValue = intList.get(i);
      intList.set(i, smallestValue);
      intList.set(smallestValueIndex, tempValue);
      i ++;
    }
    
    return intList;
  }

  /**
   * Perform an insertion sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> insertionSortInt(ArrayList<Integer> intList)
  {
    ArrayList<Integer> sorted = new ArrayList<Integer>();
    int i = 0;
    // copying the inital value 
    int checkValue = intList.get(i);
    
    // removing the value from the list 
    intList.remove(i);
    
    // adding the value to the sorted list 
    sorted.add(checkValue);

    while(intList.size() > 0){
      //System.out.println("Int list is : " + intList);
      //System.out.println("Sorted list is: " + sorted);
      
      int lowestValue = intList.get(0);
      int lowestValueIndex = 0;

      // getting the lowest value in the arraylist
      for(int x = 0; x < intList.size(); x ++){
        if(lowestValue > intList.get(x)){
          lowestValue = intList.get(x);
          lowestValueIndex = x;
          
        }
      }

      intList.remove(lowestValueIndex);

      // check where the value should go in the sorted list, and then insert it 
      for(int index = 0; index < sorted.size(); index ++){
        System.out.println("Lowest Value is " + lowestValue);
        System.out.println("Sorted get index is : " + sorted.get(index));
        if(lowestValue < sorted.get(index)){
          sorted.add(index, lowestValue);
          //System.out.println(sorted);
          break;
        } else if(lowestValue > sorted.get(index) && index == sorted.size() - 1){
          sorted.add(index + 1, lowestValue);
        }
      }
      
      
      
      
    }


    return sorted;
  }

  /**
   * Perform a selection sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */ 
  public static ArrayList<Double> selectionSortDouble(ArrayList<Double> doubleList)
  {
    int i = 0;
    while(i < doubleList.size()){
      double smallestValue = doubleList.get(i);
      int smallestValueIndex = i;
      
      
      for(int o = i; o < doubleList.size(); o ++){ // Finds the smallest value in the list 
        if(doubleList.get(o) < smallestValue){
          smallestValue = doubleList.get(o);
          smallestValueIndex = o;
        }
      }


      double tempValue = doubleList.get(i);
      doubleList.set(i, smallestValue);
      doubleList.set(smallestValueIndex, tempValue);
      i ++;
    }
    
    return doubleList;
  }

  /**
   * Perform an insertion sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */
  public static ArrayList<Double> insertionSortDouble(ArrayList<Double> doubleList)
  {
    ArrayList<Double> sorted = new ArrayList<Double>();
    int i = 0;
    // copying the inital value 
    double checkValue = doubleList.get(i);
    
    // removing the value from the list 
    doubleList.remove(i);
    
    // adding the value to the sorted list 
    sorted.add(checkValue);

    while(doubleList.size() > 0){
      //System.out.println("Int list is : " + intList);
      //System.out.println("Sorted list is: " + sorted);
      
      double lowestValue = doubleList.get(0);
      int lowestValueIndex = 0;

      // getting the lowest value in the arraylist
      for(int x = 0; x < doubleList.size(); x ++){
        if(lowestValue > doubleList.get(x)){
          lowestValue = doubleList.get(x);
          lowestValueIndex = x;
          
        }
      }

      doubleList.remove(lowestValueIndex);

      // check where the value should go in the sorted list, and then insert it 
      for(int index = 0; index < sorted.size(); index ++){
        //System.out.println("Lowest Value is " + lowestValue);
        //System.out.println("Sorted get index is : " + sorted.get(index));
        if(lowestValue < sorted.get(index)){
          sorted.add(index, lowestValue);
          //System.out.println(sorted);
          break;
        } else if(lowestValue > sorted.get(index) && index == sorted.size() - 1){
          sorted.add(index + 1, lowestValue);
        }
      }
      
      
      
      
    }


    return sorted;
    
  }

}

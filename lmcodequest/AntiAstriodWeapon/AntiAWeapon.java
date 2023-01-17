import java.util.Scanner;
import java.util.ArrayList;

public class AntiAWeapon {  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int testCases = Integer.parseInt(sc.nextLine());

        // the for loop for the overall number of test cases 
        for(int i = 0; i < testCases; i ++){
            // grabbing the secondary test case and creating my arraylist
            int secondaryTestCases = Integer.parseInt(sc.nextLine());
            ArrayList<String> astroids = new ArrayList<String>();
            
            // add the items to my list
            for(int o = 0; o < secondaryTestCases; o ++){
                astroids.add(sc.nextLine());
            }
            // calculate the distances and sort the list 
            for(int l = 0; l < secondaryTestCases - 1; l ++){
                // first number is the x value, second is the y value 
                
                // finding the index of the space
                int indexOfSpace = astroids.get(l).indexOf(" ");
                
                // of first number
                int xValue = Integer.parseInt(astroids.get(l).substring(0, indexOfSpace));
                int yValue = Integer.parseInt(astroids.get(l).substring(indexOfSpace + 1));
                
                double firstDistance = Math.sqrt((xValue * xValue) + (yValue * yValue));

                // of second number
                indexOfSpace = astroids.get(l + 1).indexOf(" ");
                xValue = Integer.parseInt(astroids.get(l + 1).substring(0, indexOfSpace));
                yValue = Integer.parseInt(astroids.get(l + 1).substring(indexOfSpace + 1));

                double secondDistance = Math.sqrt((xValue * xValue) + (yValue * yValue));

                if(firstDistance > secondDistance){
                    String tempHolder = astroids.get(l + 1);
                    astroids.set(l + 1, astroids.get(l));
                    astroids.set(l, tempHolder);
                    l = -1;
                }

            }

            // printing the values 
            for(String x: astroids){
                System.out.println(x);
            }
        }

    }


    
}

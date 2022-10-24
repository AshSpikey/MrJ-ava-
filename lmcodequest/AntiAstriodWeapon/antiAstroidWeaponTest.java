import java.util.*;
public class antiAstroidWeaponTest {
    


// I need to think of a way to compare the different items to one another. Perhaps multiple vars? Perhaps a list?


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int testCases = Integer.parseInt(sc.nextLine());

        for(int iterations = 0; iterations < testCases; iterations++){
            // First step, essetially grab the next line whic holds the int value, make another loop that runs that number so of times
            int numberOfLines = Integer.parseInt(sc.nextLine());

            // create a local list that will store the distance values and a list to store the corrosponding astriod 

            List<Integer> distanceValues = new ArrayList<Integer>();
            List<String> corrospondingAstroid = new ArrayList<String>();
            List<String> astroidPrintList = new ArrayList<String>();

            for(int lineCount = 0; lineCount < numberOfLines; lineCount++){
                String currentLine = sc.nextLine();
                corrospondingAstroid.add(currentLine);

                int indexOfSpace = currentLine.indexOf(" ");
                int xValue = Integer.parseInt(currentLine.substring(0, indexOfSpace));
                int yValue = Integer.parseInt(currentLine.substring(indexOfSpace + 1));

                //calculate distance



                int distance = (int)Math.sqrt((Math.pow(xValue, 2))+(Math.pow(yValue,2)));

                distanceValues.add(distance);


            } // CURRENT AREA OF WORK :: I am a little confused with where I am comparing the values and how I can do it, currently adding too many things which will end up causing more issues, need a fresh mind to look at it and think about it later

                //This area will compare the values in the list to find the one that is the highest, second highest, and then lowest
                
                //int indexOfFurthestDistance = 0;
                
                for(int overallLoop = 0; overallLoop < numberOfLines; overallLoop++){
                    int smallestValue = distanceValues.get(0);
                    for(int index = 0; index < numberOfLines; index++){
                        int comparisonValue = distanceValues.get(index);

                        if(comparisonValue <= smallestValue){
                            smallestValue = comparisonValue;
                        }
                    }
                    System.out.println
                }

             // Then Inside of the for loop, the values are collected, and distance is calculated and printed out 
        }


    }
}


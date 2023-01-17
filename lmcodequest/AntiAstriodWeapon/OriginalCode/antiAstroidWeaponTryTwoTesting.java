package OriginalCode;
import java.util.*;

public class antiAstroidWeaponTryTwoTesting {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);

        int testCases = 1;

        List<String> secondaryTestCases = new ArrayList<String>();
        secondaryTestCases.add("4");
        secondaryTestCases.add("4");

        List<String> firstTestCase = new ArrayList<String>();
        firstTestCase.add("2 1");
        firstTestCase.add("1 1");
        firstTestCase.add("5 5");

        List<String> secondTestCase = new ArrayList<String>();
        secondTestCase.add("2 2");
        secondTestCase.add("1 7");
        secondTestCase.add("-1 0");
        secondTestCase.add("1 1");

        for(int iterations = 0; iterations < testCases; iterations++){
            // First step, essetially grab the next line whic holds the int value, make another loop that runs that number so of times
            int numberOfLines = Integer.parseInt(secondaryTestCases.get(iterations));
            List<String> allValues = new ArrayList<String>();
            //List<String> sortedValues = new ArrayList<String>();
            
            for(int i = 0; i < numberOfLines; i++){
                allValues.add(secondTestCase.get(i));
            }
            int index = 0;
            while(true){
                if(index + 1 == allValues.size()){
                    break;
                }

                int indexOfSpaceCurrentVal = allValues.get(index).indexOf(" ");
                int currentValueXVal = Integer.parseInt(allValues.get(index).substring(0, indexOfSpaceCurrentVal));
                int currentValueYVal = Integer.parseInt(allValues.get(index).substring(indexOfSpaceCurrentVal + 1));
                double currentValueDistance =  Math.sqrt((currentValueXVal * currentValueXVal)+(currentValueYVal * currentValueYVal));

                //System.out.println(currentValueDistance);

                int indexOfSpaceComparisonVal = allValues.get(index + 1).indexOf(" ");
                int comparisonValueXVal = Integer.parseInt(allValues.get(index + 1).substring(0, indexOfSpaceComparisonVal));
                int comparisonValueYVal = Integer.parseInt(allValues.get(index + 1).substring(indexOfSpaceComparisonVal + 1));
                double comparisonValueDistance = Math.sqrt((comparisonValueXVal * comparisonValueXVal) + (comparisonValueYVal * comparisonValueYVal));

                //System.out.println("current value distance is " + currentValueDistance + " and comparison value distance is " + comparisonValueDistance);
                //System.out.println(allValues);

                if(currentValueDistance > comparisonValueDistance){
                    //System.out.println("Index inside of the comparison statement is " + index);
                    String currentFirstVal = allValues.get(index);
                    //System.out.println(" current first val is " + currentFirstVal);
                    String currentSecondVal = allValues.get(index + 1);
                    //System.out.println("current second val is " + currentSecondVal);
                    
                    allValues.set(index + 1, currentFirstVal);
                    allValues.set(index, currentSecondVal);
                    index = -1;

                }
                
                
                //System.out.println("Index is currently " + index);

                index ++;
                
                //System.out.println("List currently is " + allValues);
            }
            for(String x: allValues ){
                System.out.println(x);
            }
        }
    }
}


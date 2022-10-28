import java.util.*;

public class antiAstroidWeaponTryTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int testCases = Integer.parseInt(sc.nextLine());

        for(int iterations = 0; iterations < testCases; iterations++){
            // First step, essetially grab the next line whic holds the int value, make another loop that runs that number so of times
            int numberOfLines = Integer.parseInt(sc.nextLine());
            List<String> allValues = new ArrayList<String>();
            //List<String> sortedValues = new ArrayList<String>();
            for(int i = 0; i < numberOfLines; i++){
                allValues.add(sc.nextLine());
            } 
            int index = 0;
            while(true){
                int currentValue = Integer.parseInt(allValues.get(index));
                int comparisonValue = Integer.parseInt(allValues.get(index + 1));
                if(currentValue > comparisonValue){
                    allValues.set(index + 1, Integer.toString(currentValue));
                    allValues.set(index, Integer.toString(comparisonValue));
                    index = 0;

                }
                if(index +1 == allValues.size()){
                    break;
                }
                
                index ++;
            }
            for(String x: allValues ){
                System.out.println(x);
            }
        }
    }
}

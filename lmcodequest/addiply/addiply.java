import java.util.Scanner;

public class addiply {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in); // Creating Scanner
    int testCases = Integer.parseInt(sc.nextLine()); // Pulling test cases 

    for(int loopVal =0; loopVal < testCases; loopVal++){
        String line = sc.nextLine();
        
        String space = " ";
        int indexOfSpace = line.indexOf(space);
        
        
        
        int firstNum = Integer.parseInt(line.substring(0,indexOfSpace));
        int secondNum = Integer.parseInt(line.substring(indexOfSpace + 1));

        int twoNumsAdded = (firstNum+secondNum);
        int twoNumsMultiplied = (firstNum*secondNum);

        System.out.println(twoNumsAdded + " " + twoNumsMultiplied);
    }


}
}
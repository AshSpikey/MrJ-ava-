// Look on replit for info regarding the buffered reader
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        for (int loopVal = 0; loopVal < testCases; loopVal++ ){

            String currentLine = sc.nextLine();
            String colon = ":";
            int indexOfColon = currentLine.indexOf(colon); // This should return the index of where the colon is located


            String speed = currentLine.substring(0, indexOfColon);
            String distance = currentLine.substring((indexOfColon + 1));

            d


            if (distanceOverSpeed > 1.0){
                System.out.println("SWERVE");
            }
            else if (distanceOverSpeed > 5.0){
                System.out.println("BRAKE");
            }
            else{
                System.out.println("SAFE");
            }
        }
    }
}
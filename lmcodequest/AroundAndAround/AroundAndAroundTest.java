package lmcodequest.AroundAndAround;
import java.util.Scanner;

public class AroundAndAroundTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] values = {160, 200, 265};

        int testCases = 3;
        for(int i = 0; i < testCases; i ++){
            //Maths!
            int nextNumber = values[i];
            double distanceTraveled = ((12756.2687 + (2*nextNumber)) * Math.PI);
            String printValue = String.format("%.1f", distanceTraveled);
            System.out.println(printValue);
        }
    }
}

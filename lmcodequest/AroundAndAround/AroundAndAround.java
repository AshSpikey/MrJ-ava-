package lmcodequest.AroundAndAround;
import java.util.Scanner;

public class AroundAndAround {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int testCases = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < testCases; i ++){
            //Maths!
            int nextNumber = Integer.parseInt(sc.nextLine());
            double distanceTraveled = ((12756.2687 + (2*nextNumber)) * Math.PI);
            String printValue = String.format("%.1f", distanceTraveled);
            System.out.println(printValue);
        }
    }
}

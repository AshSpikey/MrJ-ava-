import java.util.*;
public class testingWithoutStupid {
    public static void main(String[] args){
        List <String> list = new ArrayList<String>();
        list.add("23.15:98.34");
        list.add("2.40:17.33");
        list.add("6.79:5.01");
        list.add("0.00:1.53");
        list.add("113.56:113.56");
            for(int index = 0; index < 5; index++){
            String currentLine = list.get(index);


            String colon = ":";
            int indexOfColon = currentLine.indexOf(colon); // This should return the index of where the colon is located


            String speed = currentLine.substring(0, indexOfColon);
            String distance = currentLine.substring((indexOfColon + 1));

            Float speedFloat = Float.parseFloat(speed);
            Float distanceFloat = Float.parseFloat(distance);

            Float distanceOverSpeed = (distanceFloat/speedFloat);

            System.out.println(distanceOverSpeed);
            if (distanceOverSpeed <= 1.0){
                System.out.println("SWERVE");
            }
            else if (distanceOverSpeed <= 5.0){
                System.out.println("BRAKE");
            }
            else{
                System.out.println("SAFE");
            }
    
        }
    }
}

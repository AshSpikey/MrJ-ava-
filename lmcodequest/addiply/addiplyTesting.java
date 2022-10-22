import java.util.*;

public class addiplyTesting {
    public static void main(String[] args){
        List <String> list = new ArrayList<String>();
        list.add("2 2");
        list.add("5 4");
        list.add("3 8");

        for (String x: list){
            String line = x;
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


package lmcodequest.AnimalFarm;

import java.util.*;

public class legCounterTesting {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);

        int testCases = 3;

        List<String> testValues = new ArrayList<String>();
        testValues.add("2 3 5");
        testValues.add("2 2 2");
        testValues.add("3 2 4");

        for(int iterations = 0; iterations < testCases; iterations++){
            String currentLine = testValues.get(iterations);

            int indexOfFirstSpace = currentLine.indexOf(" "); //Finds the index of the first space using idexOf

            int indexOfSecondSpace = currentLine.indexOf(" ", indexOfFirstSpace + 1); //Finds the index of the second space, because it does not looking for a space until after the other space

            int numberOfTurkeys = Integer.parseInt(currentLine.substring(0, indexOfFirstSpace));
            int numberOfGoats = Integer.parseInt(currentLine.substring(indexOfFirstSpace + 1, indexOfSecondSpace));
            int numberOfHorses = Integer.parseInt(currentLine.substring(indexOfSecondSpace + 1));

            int legsOfTurkeys = (numberOfTurkeys * 2);
            int legsOfGoats = (numberOfGoats * 4);
            int legsOfHorses = (numberOfHorses * 4);

            int totalLegs = (legsOfTurkeys + legsOfGoats + legsOfHorses);
            System.out.println(totalLegs);
        }
    }
}

import java.util.*;

public class legCounter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int testCases = Integer.parseInt(sc.nextLine());


        for(int iterations = 0; iterations < testCases; iterations++){
            String currentLine = sc.nextLine();

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

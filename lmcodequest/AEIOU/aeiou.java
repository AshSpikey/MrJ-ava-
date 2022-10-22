import java.util.*;

public class aeiou{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Creating Scanner
        int testCases = Integer.parseInt(sc.nextLine()); // Pulling test cases

        for(int countTestCases = 0; countTestCases < testCases; countTestCases++){
            String currentLine = sc.nextLine();
            int lengthOfLine = currentLine.length();

            int vowelCount = 0;

            for(int countAgainstLength = 0; countAgainstLength < lengthOfLine ; countAgainstLength++){
                String currentLetter = currentLine.substring(countAgainstLength, countAgainstLength + 1);

                if (currentLetter.equals("a")||currentLetter.equals("e")||currentLetter.equals("i")||currentLetter.equals("o")||currentLetter.equals("u")){
                    vowelCount++;
                }
                
            }
            System.out.println(vowelCount);

        }
    }
}

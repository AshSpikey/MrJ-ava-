package lmcodequest.Autocorrect;
import java.util.Scanner;
import java.util.ArrayList;


public class AutoCorrect {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        for(int i = 0; i < testCases; i ++){
            String nextLine = sc.nextLine();
            int indexOfSpace = nextLine.indexOf(" ");
            int dictonaryWords = Integer.parseInt(nextLine.substring(0, indexOfSpace));
            int mispelledWords = Integer.parseInt(nextLine.substring(indexOfSpace + 1));
            
            // array list with correctly spelled words
            ArrayList<String> dictWords = new ArrayList<String>();
            ArrayList<Integer> hammingValues = new ArrayList<Integer>();
            for(int q = 0; q < dictonaryWords; q ++){
                dictWords.add(sc.nextLine());
                hammingValues.add(0);
            }

            for(int p = 0; p < mispelledWords; p ++){
                // resetting my hamming list values arraylist
                for(int x = 0; x < hammingValues.size(); x ++){
                    hammingValues.set(x, 0);
                }
                // calculating the hammer distance for each word
                String word = sc.nextLine();

                // calculating the length of each word 
                
                for(int m = 0; m < word.length(); m ++){
                    for(String x: dictWords){
                        String currentLetter = x.substring(m, m + 1);
                    }
                }
            }

        }
    }
}

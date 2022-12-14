import java.util.*;

public class AnnagramChecker  {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        for (int iterations = 0; iterations < testCases; iterations++){
            String currentLine = sc.nextLine();
            String pipeChar = "|";

            int indexOfPipeChar = currentLine.indexOf(pipeChar);

            //This will be where I create the substrings of the two seperate words
            String firstWord = currentLine.substring(0, indexOfPipeChar);
            String secondWord = currentLine.substring(indexOfPipeChar + 1);



            // This is where I will compare the two substrings based on what letters they have
            boolean isAnagram = true;
            
            String alphabetString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            List<Integer> wordOneLetters = new ArrayList<Integer>();
            for(int index = 0; index < 26; index++){
                
                int numberOfCertainLetter = 0; //integer varaible gets reset each iteration of the bigger loop to reset the particular value for given letter
                String currentAlphabetLetter = alphabetString.substring(index, index + 1); //grabs current letter of alphabet

                for(int nestedIndex = 0; nestedIndex < firstWord.length(); nestedIndex++){ //this loop runs for the entirety of the word, running each letter of the alphabet against the word to find that number of that partivular letter in the alphatbet in the given word
                    
                    String currentLetter = firstWord.substring(nestedIndex, nestedIndex + 1);
                    
                    if(currentLetter.equals(currentAlphabetLetter)){
                        numberOfCertainLetter++;
                    }
                }

                wordOneLetters.add(numberOfCertainLetter); //This line adds the value of the particular letter to the list 
                
            }

            List<Integer> wordTwoLetters = new ArrayList<Integer>();
            for(int index = 0; index < 26; index++){
                
                int numberOfCertainLetter = 0; //integer varaible gets reset each iteration of the bigger loop to reset the particular value for given letter
                String currentAlphabetLetter = alphabetString.substring(index, index + 1); //grabs current letter of alphabet

                for(int nestedIndex = 0; nestedIndex < secondWord.length(); nestedIndex++){ //this loop runs for the entirety of the word, running each letter of the alphabet against the word to find that number of that partivular letter in the alphatbet in the given word
                    
                    String currentLetter = secondWord.substring(nestedIndex, nestedIndex + 1);
                    
                    if(currentLetter.equals(currentAlphabetLetter)){
                        numberOfCertainLetter++;
                    }
                }

                wordTwoLetters.add(numberOfCertainLetter); //This line adds the value of the particular letter to the list 
                
            }

            



            for(int index = 0; index < 26; index++){
                if(wordOneLetters.get(index) != wordTwoLetters.get(index)){
                    isAnagram = false;
                }
            } // Checks the indexes against each other, and if they do not match up, returns that it is not an anagram, otherwise, stays true,



            // This will be where I make sure the two words are not the same words
                if(isAnagram){ //This is an if statement, because technically if they are not an anagram, they might not be the same length and that would break my code
                    int lengthValue = 0; //This value will count how many of the same letters are the same, and if this value is equal to the length of the word, then it is the same word and therefore not an anagram
                    
                    for(int index = 0; index < firstWord.length(); index++){
                        String currentLetterFirstWord = firstWord.substring(index, index + 1);
                        String currentLetterSecondWord = secondWord.substring(index, index + 1);

                        if(currentLetterFirstWord.equals(currentLetterSecondWord)){
                            lengthValue ++;
                        }

                    }
                    if (lengthValue == firstWord.length()){
                        isAnagram = false;
                    }
                }


            // This will be where I print my final string answer
            if(isAnagram){
                System.out.println(currentLine + " = ANAGRAM");
            }
            if(!isAnagram){
                System.out.println(currentLine + " = NOT AN ANAGRAM");
            }
        }
    }
}

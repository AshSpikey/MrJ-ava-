/*
 * Activity 2.4.4
 * 
 * Instructions:
 * Your task is to write a program, LetterFrequencies, 
 * that prints each letter of the alphabet and the number of times that 
 * letter occurs in the phrase. To complete this task, you will need to 
 * incorporate the following constructs.
 *  Loop to iterate through the alphabet (the outer loop
 * Loop to iterate through all the letters of a phrase (the inner loop)
 * Counter variable to count the number of times a letter is in the phrase
 * Print statement to display the frequencies
 * 
 * 
 */
public class LetterFrequencies
{
	public static void main(String[] args)
	{
		String letters = "abcdefghijklmnopqrstuvwxyz"; 
		String phrase = "This is a phrase!";

		System.out.println("The following shows the letter frequencies for the phrase");

    for (int index = 0; index < letters.length(); index ++){
		String alphabetSubString = letters.substring(index, index+ 1);
		int value = 0;
		for (int phraseLength = 0; phraseLength < phrase.length(); phraseLength++){
			String intermediatePhrase = phrase.substring(phraseLength, phraseLength + 1).toLowerCase();
			if(intermediatePhrase.equals(alphabetSubString)){
				value++;
			}
			
		}
		System.out.println(alphabetSubString + ": " + value);
			
		
	}
	}
}

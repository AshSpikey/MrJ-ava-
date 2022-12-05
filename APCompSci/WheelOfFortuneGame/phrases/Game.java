public class Game { // this is the game class 
    Board phraseLoader = new Board(); 
    private String untouchedPhrase; // this is the phrase 
    private String phrase;
    private String underScorePhrase = ""; // this is the phrase with the letters replaced by underscores 
    
    
    public Game(){ // empty constructor because I dont need anything to be initalized
        
    }

    public String getUnderScorePhrase(){ // this is just to get the underscore phrase when I want it 
        return underScorePhrase;
    }

    public void createUnderScorePhrase(){ // this creates the underscore phrase 
        phrase = phraseLoader.loadPhrase();
        untouchedPhrase = phrase;
            for(int i = 0; i< phrase.length(); i ++){
                String currentChar = phrase.substring(i, i + 1);
                if(currentChar.equals(" ")){
                   underScorePhrase += (" ");
                }else{
                    underScorePhrase += ("_");
                }
            }
    }

    public boolean checkForCorrect(String letter){ // this checks if the inputted guess was correct 
        boolean retBool = false;
        String guess = letter;
        for(int i = 0; i < phrase.length(); i ++){
            if(phrase.substring(i, i + 1).equals(guess)){
                String firstPart = underScorePhrase.substring(0, i);
                String lastPart = underScorePhrase.substring(i + 1);
                underScorePhrase = (firstPart + guess + lastPart);
                phrase = phrase.replaceFirst(letter, "0");
                //.out.println("Phrase is : " + phrase);
                retBool = true;
            }
        }
        return retBool;
    }

    public boolean winCheck(){ // checks to see if the underscore phrase has any underscores left or not 
        boolean gameOver = false;
        for(int i = 0; i < underScorePhrase.length(); i ++){
            if(underScorePhrase.substring(i, i + 1).equals("_")){
                gameOver = false;
                break;
            }else{
                gameOver = true;
            }
        }
        return gameOver;
    }

    public void getGameText(String p1Name, String p2Name, int p1Score, int p2Score){ // this is the game text that is printed to the terminal for each time a turn goes 
        System.out.println("----------------------------------------------------------------");
        System.out.println("Your current phrase is: ");
        System.out.println(underScorePhrase);
        System.out.println(p1Name + "'s score: " + p1Score);
        System.out.println(p2Name + "'s score: " + p2Score);
        System.out.println("----------------------------------------------------------------");
    }

    public void whoWins(String p1Name, String p2Name, int p1Score, int p2Score){ // this is to check who wins the game and prints the person who wins 
        if(p1Score > p2Score){
            System.out.println(p1Name + " wins! The final phrase was " + untouchedPhrase);
        }else if(p2Score > p1Score){
            System.out.println(p2Name + " wins! The final phrase was " + untouchedPhrase);
        }else if(p1Score == p2Score){
            System.out.println("It was a tie! The final phrase was " + untouchedPhrase);
        }
    }
}

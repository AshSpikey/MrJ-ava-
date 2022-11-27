public class Game {
    Board phraseLoader = new Board();
    private String phrase;
    private String underScorePhrase;
    
    
    public Game(){
        
    }

    public String getUnderScorePhrase(){
        return underScorePhrase;
    }

    public void createUnderScorePhrase(){
        phrase = phraseLoader.loadPhrase();
            for(int i = 0; i< phrase.length(); i ++){
                String currentChar = phrase.substring(i, i + 1);
                if(currentChar.equals(" ")){
                   underScorePhrase += (" ");
                }else{
                    underScorePhrase += ("_");
                }
            }
    }

    public void checkForCorrect(String letter){
        String guess = letter;
        for(int i = 0; i < phrase.length(); i ++){
            if(phrase.substring(i, i + 1).equals(guess)){
                String firstPart = underScorePhrase.substring(i - 1, i);
                String lastPart = underScorePhrase.substring(i + 1);
                underScorePhrase = (firstPart + guess + lastPart);
            }
        }
    }

    public boolean winCheck(){
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

    public void getGameText(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("Your current phrase is: ");
        System.out.println(underScorePhrase);
        System.out.println("----------------------------------------------------------------");
    }
}

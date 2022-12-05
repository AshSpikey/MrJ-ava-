import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        String underScorePhrase = "___ ___ ____";
        Board phraseLoader = new Board();
        String phrase = "toa the line";
            /*for(int i = 0; i< phrase.length(); i ++){
                String currentChar = phrase.substring(i, i + 1);
                if(currentChar.equals(" ")){
                   underScorePhrase += (" ");
                }else{
                    underScorePhrase += ("_");
                }
            }
            System.out.println(phrase);
            System.out.println(underScorePhrase);*/
            /*String guess = "e";
            
            for(int i = 0; i < phrase.length(); i ++){
                System.out.println("Length of phrase is " + phrase.length());
                System.out.println(phrase);
                System.out.println("i is currently " + i );
                
                if(phrase.substring(i, i + 1).equals(guess)){
                    System.out.println("Did I get here");
                    System.out.println(underScorePhrase);
                    String firstPart = underScorePhrase.substring(0, i);
                    System.out.println("First part is " + firstPart);
                    String lastPart = underScorePhrase.substring(i + 1);
                    System.out.println("Second part is " + lastPart);
                    underScorePhrase = (firstPart + guess + lastPart);
                    System.out.println("Underscore phrase is " + underScorePhrase);
                    phrase = phrase.replaceFirst("e", "0");
                    System.out.println("Phrase is : " + phrase);
                }
            }*/
            phraseloader.loadPhrase();
    }
}

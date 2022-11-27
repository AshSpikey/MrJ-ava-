import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        
        //Setting up scanner and game
        Scanner sc = new Scanner(System.in);
        Game game = new Game();
        
        // current player check var
        int currentPlayer = 0;
        
        
        
        // Setting up the two players
        System.out.println("What is player 1's name?");
        Player playerOne = new Player(sc.nextLine());
        
        System.out.println("What is player 2's name?");
        Player playerTwo = new Player(sc.nextLine());

        game.createUnderScorePhrase();
        while(true){
            
            game.getGameText();
            if(currentPlayer == 0){
                System.out.println(playerOne.getPlayerName() + " is up. What is your guess?");
                currentPlayer = 1;
            }else{
                System.out.println(playerTwo.getPlayerName() + " is up. What is your guess?");
                currentPlayer = 0;
            }
            String guess = sc.nextLine();
            game.checkForCorrect(guess);
            if(currentPlayer == 0){
                playerOne.editPlayerScore();
                currentPlayer = 1;
            }else{
                playerTwo.editPlayerScore();
                currentPlayer = 0;
            }
            

            if(game.winCheck()){
                System.out.println("Please reset the code to play again!");
                break;
            }
            
            
        }
    }



}

import java.util.Scanner;

// Below is the main method
public class Main {
    public static void main(String[] args){
        //Setting up scanner and game
        Scanner sc = new Scanner(System.in); // This is the scanner Mrj
        Game game = new Game(); //this creates the game variable 
        String usedLetters = ""; // this sting allows me to keep track of what letters have been used so far in the code and then print at the end
        
        // current player check var
        int currentPlayer = 0; //This variable can either be 1 or 0 and allows me to check which player's turn it is and easily change the variable
        
        
        
        // Setting up the two players
        System.out.println("What is player 1's name?"); 
        Player playerOne = new Player(sc.nextLine()); //creates the player 1 object, based on the input of name from the standard input chanel 
        
        System.out.println("What is player 2's name?");
        Player playerTwo = new Player(sc.nextLine()); //creates the player 2 object, based on the input of name from the standard input chanel 

        game.createUnderScorePhrase(); // this line creates the underscore phrase 
        while(true){ // this while loop is esseitally while the game is going on, only broken when the game ends.
            
            boolean continuation = false; // this varibale essetially adds an additonal esseital layer of complexity of making sure the game does not continue when it is the wrong player's turn or give points to the wrong player
            String player1Name = playerOne.getPlayerName(); // gets the name of player 1 
            String player2Name = playerTwo.getPlayerName(); //gets the name of player 2
            int player1Score = playerOne.getScore(); //gets the score of player 1
            int player2Score = playerTwo.getScore(); //gets the score of player 2
            
            

            game.getGameText(player1Name, player2Name, player1Score, player2Score); //this gets the inital game text
            
            if(currentPlayer == 0){ //this is self explanatory, but basically prints the player's name and asks for their guess
                System.out.println(playerOne.getPlayerName() + " is up. What is your guess?");
                
            }else{
                System.out.println(playerTwo.getPlayerName() + " is up. What is your guess?");
                
            }
            String guess = sc.nextLine(); // this line recieves the guess from the standard input channel
            
            // so both of these booleans here are needed to make sure that players are not continuing into the game loop when typing the same letter
            boolean canWeContinue = false;
            boolean lookHere = false;
            
            for(int i = 0; i < usedLetters.length(); i++){ // this for loop and what is inside makes sure players do not enter the game loop with invalid inputs
                if(guess.equals(usedLetters.substring(i, i + 1))){
                    System.out.println("You already guessed that letter, guess a different one!");
                    canWeContinue = false;
                    lookHere = true;
                }else if(!lookHere){
                    canWeContinue = true;
                    //usedLetters += guess;
                }
                
            }

            if(usedLetters.length() == 0){ //this is for the first round when the length of the string is none 
                canWeContinue = true;
                //usedLetters += guess;
            }

            if(canWeContinue){ // this is the real game loop consisiting of the game and the points and everything 
                usedLetters += guess;

                boolean checkCorrect = game.checkForCorrect(guess); // this checks if the guess is in the underscorephrase 
                
                if(checkCorrect){ // checks which player's turn it is, and then if the answer was correct adds a point to their score 
                    if(currentPlayer == 0){
                        playerOne.editPlayerScore();
                        continuation = true;
                        
                    }else{
                        playerTwo.editPlayerScore();
                        continuation = true;
                    }
                }
                

                if(game.winCheck()){ //this checks if the game is over and prints the game ending text 
                    System.out.println("\033[H\033[2J");
                    System.out.println("\n" + playerOne.getPlayerName() + " had " + playerOne.getScore() + " points.");
                    System.out.println(playerTwo.getPlayerName() + " had " + playerTwo.getScore() + " points. \n");


                    game.whoWins(playerOne.getPlayerName(), playerTwo.getPlayerName(), playerOne.getScore(), playerTwo.getScore());
                    System.out.println("Please reset the code to play again!");
                    break;
                }
                

                

                if(currentPlayer == 0 && !continuation){ // this statement switches over to who's turn it is supposed be. 
                    currentPlayer = 1;
                    continuation = false;
                }else if(currentPlayer == 1 && !continuation){
                    currentPlayer = 0;
                    continuation = false;
                }
                System.out.println("\033[H\033[2J"); // this clears the text and displays the stuff I want it to 
                System.out.println("Your guess was " + guess);
                System.out.println("Letters guessed so far are: " + usedLetters + "\n");
                
            }
        }
    }



}

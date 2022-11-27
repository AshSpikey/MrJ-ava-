 public class Player {
    
    private String playerName;
    private int playerScore = 0;
    
    public Player(){

    }

    public Player(String name){
        playerName = name;

    }
    
    public String getPlayerName(){
        return playerName;
    }

    public int getScore(){
        return playerScore;
    }

    public String returnPlayerName(){
        return playerName;
    }

    public void editPlayerScore(){
        playerScore += 1;
    }



    
}



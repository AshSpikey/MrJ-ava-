package APCompSci.Sem1Final;   

public class Player {
    private boolean items[] = {false, false, false, false, false, false};
    private String characterAssingment;
    private int repair;
    private int health;
    private int charisma;
    
    public Player(){
        // This is an empty constructor 
        // A constructor is the blueprints for creating a new object of this particular type
        // This constructor has no parameters, and thus I will never really call it, however it shows you can have
        // multiple constructors as long as they have different parameters.
        // 
        // The way to create a constructor is just to type: public *name of the file*(){}
    }

    public Player(String role){
        characterAssingment = role;
    }

    public String getCharacterAssingment(){
        return characterAssingment;
    }

    public void CreateStats(){
        if(characterAssingment.equals("soldier")){
            repair = 5;
            health = 10;
            charisma = 0;
        }else if(characterAssingment.equals("diplomat")){
            repair = 0;
            health = 5;
            charisma = 10;
        }else if(characterAssingment.equals("mechanic")){
            repair = 10;
            health = 5;
            charisma = 0;
        }

    }


    public void setHealth(int i){
        health += i;
    }

    public void setRepair(int i){
        repair += i;
    }

    public void setCharisma(int i){
        charisma += 1;
    }

    public int getHealth(){
        return health;
    }

    public int getRepair(){
        return repair;
    }

    public int getCharisma(){
        return charisma;
    }







    public boolean[] getItemList(){
        return items;
    }

    public void MutateItemsList(int i, boolean b){
        items[i] = b;
    }
}

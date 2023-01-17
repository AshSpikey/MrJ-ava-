package APCompSci.Sem1Final;   

import java.util.ArrayList;

public class Monster {
    private ArrayList<Integer> stats = new ArrayList<Integer>();

    public Monster(){
    }


    public ArrayList<Integer> WeakMonster(){
        RemoveStats(); // clearing the list
        int health = 5;
        int attack = 2;
        stats.add(health);
        stats.add(attack);
        return stats;
    }

    public ArrayList<Integer> StandardMonster(){
        RemoveStats(); // clearing the list
        int health = 10;
        int attack = 5;
        stats.add(health);
        stats.add(attack);
        return stats;
    }

    public ArrayList<Integer> StrongMonster(){
        RemoveStats(); // clearing the list
        int health = 15;
        int attack = 10;
        stats.add(health);
        stats.add(attack);
        return stats;
    }

    public ArrayList<Integer> BossMonster(){
        RemoveStats(); // clearing the list
        int health = 200;
        int attack = 150;
        stats.add(health);
        stats.add(attack);
        return stats;
    }

    public void RemoveStats(){ 
        while(stats.size() != 0){
            stats.remove(0);
        }
    }
}

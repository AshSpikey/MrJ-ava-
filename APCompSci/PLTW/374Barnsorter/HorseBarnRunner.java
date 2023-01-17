
/*
 * Activity 3.7.3
 */
import java.util.ArrayList;
public class HorseBarnRunner
{
  public static void main(String[] args)
  {
    HorseBarn barn = new HorseBarn(); // creating the horsebarn object
    ArrayList<Horse> barnSpaces = new ArrayList<Horse>(); // creating an arraylist on the outside of the horsebarn class
    
    barnSpaces = barn.getSpaces(); // making the two arraylists the same 
    
    
    /*int i = 0;
    while(i < barnSpaces.size() - 1){
      Horse h = barnSpaces.get(i);
        if (h.getName().equals("Patches")){
            System.out.println("Bye bye " +  barnSpaces.remove(i));
        } else if (h.getName().equals("Lady")) {
            System.out.println("Bye bye " + barnSpaces.remove(i));
            i --;
        }
        i ++;
    }*/
            
    
    
    
    /* 
    // STEP 2
    // Display average weight. 
    int weight = 0;
    for( Horse h: barnSpaces){
        //System.out.println(h + "'s weight is " + h.getWeight());
        weight += h.getWeight();
    }
    weight = weight / barnSpaces.size();
    System.out.println("The average horse weight is " + weight);
    
    // displaying those horses who weigh more than average
    for(Horse q: barnSpaces){
        if(q.getWeight() > weight){
            System.out.println(q + " weighs more than average, coming in at a grand total of " + q.getWeight());
        }
    }


    // heaviest and lightest horse
    Horse light = null;
    int lightest = 9999;
    Horse heavy = null;
    int heaviest = 0;
    
    for(Horse p: barnSpaces){
        if(p.getWeight() < lightest){
            lightest = p.getWeight();
            light = p;
        }
        if(p.getWeight() > heaviest){
            heaviest = p.getWeight();
            heavy = p;
        }
    }
    System.out.println("The heaviest horse is " + heavy.getName());
    System.out.println("The lightest horse is " + light.getName());
    
    
    // STEP 3
    for(int i = 0; i < barnSpaces.size() - 1; i ++){
        Horse currentHorse = barnSpaces.get(i);
        if(currentHorse.getName().equals("Duke")){
            barnSpaces.remove(i);
            barnSpaces.add(i, (new Horse("Princess", 1445)));
        }
        if(currentHorse.getName().equals("Silver")){
            barnSpaces.add(i + 1, new Horse("Chief", 1505));
        }
        if(currentHorse.getName().equals("Buddy")){
            barnSpaces.add(i, new Horse("Gypsy", 1335));
            barnSpaces.add(i + 2, new Horse("Magic", 1425));
            i ++;
        }

    }
    */


    /* 
    // heaviest and lightest horse
    Horse light = null;
    int lightest = 9999;
    Horse heavy = null;
    int heaviest = 0;
    
    for(Horse p: barnSpaces){
        if(p.getWeight() < lightest){
            lightest = p.getWeight();
            light = p;
        }
        if(p.getWeight() > heaviest){
            heaviest = p.getWeight();
            heavy = p;
        }
    }
    System.out.println("The heaviest horse is " + heavy.getName());
    System.out.println("The lightest horse is " + light.getName());


    // Display average weight. 
    int weight = 0;
    for( Horse h: barnSpaces){
        //System.out.println(h + "'s weight is " + h.getWeight());
        weight += h.getWeight();
    }
    weight = weight / barnSpaces.size();
    System.out.println("The average horse weight is " + weight);
    
    // displaying those horses who weigh more than average
    for(Horse q: barnSpaces){
        if(q.getWeight() > weight){
            System.out.println(q + " weighs more than average, coming in at a grand total of " + q.getWeight());
        }
    }

    */


    // MrJ Step 1
    int[] randomList = RandomPermutation.next(barnSpaces.size());
    ArrayList<Horse> randomHorseList = new ArrayList<Horse>();

    for(int i: randomList){
        i --;
        randomHorseList.add(barnSpaces.get(i));
    }
    System.out.println(barnSpaces);
    System.out.println(randomHorseList);

    
    // MrJ Step 2
    int i = 0;
    while(i < barnSpaces.size()){
        Horse currentHorse = barnSpaces.get(i);
        if(barnSpaces.size() == 1){
            System.out.println(currentHorse + " is a lonely horse without a partner. Much sadness.");
            barnSpaces.remove(currentHorse);
        }else{
            int randomPartner = (int) (Math.random() * (barnSpaces.size() - 1)) + 1;
            Horse randomHorse = barnSpaces.get(randomPartner);
            System.out.println(currentHorse + " is paired with " + randomHorse);
            barnSpaces.remove(currentHorse);
            barnSpaces.remove(randomHorse);
            //System.out.println(barnSpaces);
            i = 0;
        }
    }


  }
} 
package APCompSci.Sem1Final;   

import java.util.Scanner;
import java.util.ArrayList;

public class Event {
    private Scanner sc = new Scanner(System.in);
    private Player player;
    private Monster m = new Monster();

    public Event(Player p){
        // this is the constructor 
        // the only parameter we have is the player 
        player = p;

    }
    
    public void FirstEvent(boolean[] bolList) throws InterruptedException{
        if((!bolList[0])&&(!bolList[1])&&(!bolList[2])&&(!bolList[3])&&(!bolList[5])) {
            String string1 = ("You tap your pockets, looking for your belongings but come up empty except for your mag boots. You unstrap yourself from the med-bed, taking in your surroundings.");
            slowText(string1);
            
            string1 = ("SUDDENLY! A scream from down the hall! What will you do? The med-bay looks a little ravaged, but perhaps something is salvageable, or should you go investigate the scream? Someone may need saving! (Salvage or go save)");
            slowText(string1);
            
            String answer = sc.nextLine().toLowerCase();

            if(answer.equals("salvage")){
                string1 = ("You scrap around the med-bay, acutely aware of more screams sounding, and whimpering sounds. You force it out of your head and focus on your task. At last, you find some emergency rations and water. Taking a bite out of a nutrient stick, you prepare to find the person in distress.");
                player.MutateItemsList(4, true);
                bolList = player.getItemList();
                slowText(string1);
            }

            string1 = ("You have to manually crank open the door as the lack of power is clearly affecting this area of the ship. The whimpering, and almost crying, sounds from just up ahead. You creep as quietly as you can, but your mag boots clink and clank on the floor with every step. Because the reactor is offline, there is no gravity. Do you disable your mag boots and float down the hall, or continue the way you are? (Disable, float)");
            slowText(string1);

            answer = sc.nextLine().toLowerCase();

            if(answer.equals("float")){
                string1 = ("You float down the halls with all of the many handholds that every person spending a decent amount of time in space becomes accustomed to. Just as you are about to turn the corner another shriek screams out. You stop yourself and peer around the corner and see some sort of huge hulking spider! It turns to you and launches at you!");
                slowText(string1);
                player.setHealth(-10);
                deathText();

            }else if(answer.equals("disable")){
                string1 = ("You continue to clank around the hall, when suddenly appearing around a corner is some sort of huge hulking spider! It launches at you, you try to run, but are too slow!");
                slowText(string1);
                player.setHealth(-10);
                deathText();

            }
        }else if((bolList[0])&&(!bolList[1])&&(!bolList[2])&&(!bolList[3])&&(!bolList[5])){
            String string1 = ("You tap your pockets, looking for your belongings but come up empty except for your mag boots. You unstrap yourself from the med-bed, taking in your surroundings. As you look next to the med-bed, you notice a Martian Service Rifle and a few extra clips.");
            slowText(string1);

            string1 = ("SUDDENLY! A scream from down the hall! What will you do? The med-bay looks a little ravaged, but perhaps something is salvageable, or should you go investigate the scream? Someone may need saving! (Salvage or go save)");
            slowText(string1);
            
            String answer = sc.nextLine().toLowerCase();

            if(answer.equals("salvage")){
                string1 = ("You scrap around the med-bay, acutely aware of more screams sounding, and whimpering sounds. You force it out of your head and focus on your task. At last, you find some emergency rations and water. Taking a bite out of a nutrient stick, you prepare to find the person in distress.");
                player.MutateItemsList(4, true);
                bolList = player.getItemList();
                slowText(string1);
            }

            string1 = ("You have to manually crank open the door as the lack of power is clearly affecting this area of the ship. The whimpering, and almost crying, sounds from just up ahead. You creep as quietly as you can, but your mag boots clink and clank on the floor with every step. Because the reactor is offline, there is no gravity. Do you disable your mag boots and float down the hall, or continue the way you are? (Disable, float)");
            slowText(string1);

            answer = sc.nextLine().toLowerCase();

            if(answer.equals("float")){
                string1 = ("You float down the halls with all of the many handholds that every person spending a decent amount of time in space becomes accustomed to. Just as you are about to turn the corner another shriek screams out. You stop yourself and peer around the corner and see some sort of huge hulking spider! It turns to you and launches at you!");
            }else if(answer.equals("disable")){
                string1 = ("You continue to clank around the hall, when suddenly appearing around a corner is some sort of huge hulking spider! It turns and launches at you!");
            }
            if(player.getCharacterAssingment().equals("soldier")){
                string1 += (" Remembering you training, and your insticts kicking in, you raise your recoiless rifle and shoot off a short burst into spider, between the eyes.");
            }else if(player.getCharacterAssingment().equals("diplomat")){
                string1 += (" Being a diplomat, you never really much used a rifle before, but with the adrenaline pumping through your veins you raise it a fire wildly at the beast, managing to strike it many times, killing it!");
            }else if(player.getCharacterAssingment().equals("mechanic")){
                string1 += (" As you are a mechanic, the last time you used a rifle was boot camp, but you still got it, easily killing the beast.");
            }
            slowText(string1);
            waitForSixSeconds();
            ClearTerminal();

            string1 = ("After the inital battle craze washes off, you rush to the side of the injured person. You recognize her as Captain Theresa Yao");
            slowText(string1);
            string1 = ("\t\t You! You! *cough cough* Come here. Quickly! I do not have long! \n You bend down to hear what she has to say, as blood burbles from her mouth due to her numerous wounds all over her body. \n\n\t\t She says: We have been boarded by some sort of unknown alien race. They have taken all over the ship. You must... you must... \n She breaks out into another coughing fit. \n\n I must what? You ask, shaking her a little bit. \n\n \t\t You must make it to the bridge.... and then... you must activate Protocol 0. \n\n Confusion fills your mind. What is that? You ask her, Ma'am, what is Protocol 0? Ma'am? \n But it's too late. She is already gone. But that is your mission from the Captain. Make it to the bridge and activate Protocol 0.");
            slowText(string1);

            string1 = ("STOP! Go back to the document and come back here when ready! Do not reset the code! Once you are ready type: ready.");
            slowText(string1);
            
            answer = sc.nextLine().toLowerCase();
            while(true){
            if(answer.equals("ready")){
                ClearTerminal();
                break;
            }
        }
        
        string1 = ("Gathering yourself, you brush off some dirt and blood from your basic clothes and determine to get yourself up to the bridge and save your ship.");
        slowText(string1);

        // These three boolean values are values referring to whether you have explored the room or not. 
        boolean storage = false; 
        boolean mess = false;
        boolean brig = false;

        while(true){
            string1 = ("You find yourself in the hall. There are multiple rooms around you, but without a map or much light, its hard to tell exactly which deck you are on. You can: explore 4 rooms; A storage room looking room, a mess hall, a brig, and an elevator to the next floor. (storage, mess, brig, elevator)");
            slowText(string1);

            answer = sc.nextLine().toLowerCase();

            if(answer.equals("storage")&&(!storage)){
                // if you have a flashlight in the storage room, you will find a keycard
                // flashlight is located in bolList[5]
                string1 = ("You enter what you think is a storage room. But it is absolutely pitch black.");
                slowText(string1);
                if(bolList[5]){
                    string1 = ("Quickly thinking, you pull out your flashlight and click it on. The room for the most part just has a bunch of spare mechanical parts. But sticking out from under a shelf! A keycard!");
                    slowText(string1);
                    player.MutateItemsList(5, true);
                    bolList = player.getItemList();
                }else if(!bolList[5]){
                    string1 = ("You fumble around in dark for a few minutes, succeeding in only stubbing every single toe you have. You move on.");
                    slowText(string1);
                }
                storage = true;
            }else if(answer.equals("storage")&&(storage)){
                string1 = ("You have already explored the storage room, and decide you cannot waste anymore time.");
                slowText(string1);
            }else if(answer.equals("mess")&&(!mess)){
                // explore the mess hall to find some food
                // food is located in bolList[4]
                string1 = ("You carefull creep into the mess hall, wary of every single creak and groan the ship makes. The hall is littered with mutilated bodies of sailors, mechanics, and more. You creep into the kitchen area and raid a few nutrient paste cabinents.");
                slowText(string1);
                player.MutateItemsList(4, true);
                bolList = player.getItemList();
                mess = true;
            }else if(answer.equals("mess")&&(mess)){
                string1 = ("You have already explored the mess hall, and there is nothing else of worth inside.");
                slowText(string1);
            }else if(answer.equals("brig")&&(!brig)){
                // if you give the prisoner some food, he will give you a flashlight
                string1 = ("You enter the room that you think is a little brig.");
                slowText(string1);
                string1 = ("\n\t\t Hey, hey, is someone there? Or is that another one of those damn bug things?");
                slowText(string1);
                string1 = ("\n I am human, you say, who are you?");
                slowText(string1);
                string1 = ("\n\t\t Hey man, my name is Brock. Man I just had a little too much homemmade moonshine man, it wasnt even that much, and the XO threw me in here, says I was a danger or some bull like that.");
                slowText(string1);
                string1 = ("\n So just a little drunk and disorderly then huh? Your sober now?");
                slowText(string1);
                string1 = ("\n\t\t Woah woah woah, hold up man, I am not going out there, there are way to many bugs. We got hundreds of hardened marines on his ship, they will take care of them, I will just wait it out. But man I am so hungry, I have been starving. If you got some food man, that would be great");
                slowText(string1);
                if(bolList[4]){
                    string1 = ("* You have some food, do you want to give him some? (give/ keep) *");
                    slowText(string1);
                    answer = sc.nextLine().toLowerCase();
                    if(answer.equals("give")){
                        string1 = ("You give the man some food, he is starving after all. \n\t\t Hey thanks man, this is great. And here man, I got this flashlight, it'll probably do you more good than it could for me.");
                        slowText(string1);
                        player.MutateItemsList(5, true);
                        bolList = player.getItemList();
                    }else{
                        string1 = ("\n Sorry, you say, I got no food. You turn and leave.");
                        slowText(string1);
                    }
                }else if(!bolList[4]){
                    string1 = ("* You do not have any food *");
                    slowText(string1);
                    string1 = ("\n Sorry, you say, I got no food. You turn and leave.");
                    slowText(string1);
                }
                brig = true;
            }else if(answer.equals("brig")&&(brig)){
                string1 = ("You peek inside the brig but only find the corpse of the prisoner inside, ravished and torn apart by bugs. Disappointed, you move on."); 
                slowText(string1);
            }else if(answer.equals("elevator")){
                // move onto the next floor, strongly recommended to have a keycard. (Youll die eventually otherwise)
                string1 = ("You decide the time is right to move on, and you pry open the elevator doors and climb up the dark shaft.");
                break;
            }
        }
        for(boolean x: bolList){
            System.out.println(x);
        }
        SecondEvent(bolList);
        }
    }

    public void SecondEvent(boolean[] bolList) throws InterruptedException{
        String string1 = ("You climbed as high as you could and pry open the doors, and step out onto the next deck.");
        slowText(string1);
        string1 = ("You reconginze the color pattern as the command deck! This is the bridge, and you need to get to the command console to activate Protocol 0!");
        slowText(string1);
        string1 = ("But as you are catching your breathe, you hear some clicking nearby... BUGS!");
        slowText(string1);

        // COMBAT 
        Combat(m.WeakMonster(), player, bolList);

        string1 = ("You feel your chest thumping after the thrilling victory. But you must move on. The bridge is just up ahead.");
        slowText(string1);
       

        boolean medbay = false;
        boolean security = false;
        while(true){
        string1 = ("Up ahead there is a MedBay and a Security Station! You can go into either room, or just move forward into the Control Center. (MedBay, Security, Onward");
        slowText(string1);

        String answer = sc.nextLine().toLowerCase();

        if(answer.equals("medbay")){
            if(!medbay){
                string1 = ("You enter a medbay, and get a pump of adrenals, healing whatever injuries you had and giving you a little boost.");
                slowText(string1);
                player.setHealth(10);
                medbay = true;
            }else{
                string1 = ("You have already explored the medbay and there is nothing else of use within.");
                slowText(string1);
            }
        }else if(answer.equals("security")){
            if(!security&&bolList[1]){
                string1 = ("You come up to the door but it is locked. Fortunenetly you have a keycard! You slide it through, and the door opens. This area of the ship still has power.");
                slowText(string1);
                string1 = ("You look around the station, for the most part it is picked clean. However, lying on one wall is a wall of dangerous looking assault rifles, you take one.");
                player.MutateItemsList(3, true);
                bolList = player.getItemList();
                security = true;
            }else if(!security&&!bolList[1]){
                string1 = ("You try the security door, but find it locked. Knowing that an alarm will sound if you continue, you move on.");
                slowText(string1);
                security = true;
            }else if(security){
                string1 = ("The time is running short, the security station is no longer important!");
                slowText(string1);
            }
        }else if(answer.equals("onward")){
            string1 = ("Gathering yourself, you move forward into the Control Center, ready to iniate Protocol 0.");
            slowText(string1);
            ThirdEvent(bolList);
        }
    }
        
    }

    public void ThirdEvent(boolean[] bolList) throws InterruptedException{
        String string1 = ("You enter the Control Center, the emergency lights flaring, differnet consols flashing and sending sparks into the air. You spot the Central Control console. You start to move towards it, but suddenly a bug leaps in front of you!");
        slowText(string1);
        
        

        Combat(m.StandardMonster(), player, bolList);

        string1 = ("You defeat the monster, and continue to move forward.");
        slowText(string1);

        string1 = ("You make it to the command console, and start booting it up. In big red letters it says \n\t\tACTIVATE PROTOCOL 0? \nYou slam your finger into the 'yes' button as fast as you can. \n\t\t PLEASE WAIT \nPlease wait?? You ask yourself. Then from coming down the hall... \n\tBOOM\tBOOM\tBOOM\nThe biggest bug you have ever seen in your life...");
        slowText(string1);

        Combat(m.BossMonster(), player, bolList);

        string1 = ("You pant, proud of yourself for defeating the monster. You return to the command console. \n\t\t CONFIRM? \nYou laugh, hit the yes button. All around you, Kiler Robots desecnd from numerous doors in the ship. You hear the shrieks of bugs coming from down the halls.");
        slowText(string1);

        string1 = ("\nCongrats you win!");
        slowText(string1);
        while(true){
        }
    }






    public void Combat(ArrayList<Integer> i, Player p, boolean[] bolList) throws InterruptedException{
        int attack = 0;
        int health = 0;
        
        System.out.println("Hello: ");
        for(int x: i){
            System.out.println(x);
        }


        // Printing stats  
        System.out.println("\n----------------------------------------------");
        String string1 = ("You are a " + p.getCharacterAssingment());
        slowText(string1);
        health += p.getHealth();
        if(bolList[2]){
            health += 15;
            // armor
        }
        string1 = ("Your current health is " + health);
        slowText(string1);
        if(bolList[3]){
            // superior weapon
            attack += 8;
        }else if(bolList[0]){
            // simple weapon
            attack += 3;
        }
        string1 = ("Your attack is " + attack);
        slowText(string1);
        System.out.println("\n----------------------------------------------");
        string1 = ("You are facing a big ugly monster, pinchers chomping towards you!");
        slowText(string1);
        System.out.println("\n----------------------------------------------\n");
        string1 = ("The monster has " + i.get(0) + " attack.");
        slowText(string1);
        string1 = ("The monster has " + i.get(1) + " health");
        slowText(string1);
        System.out.println("\n----------------------------------------------\n");

        // combat
        while(true){
            string1 = ("You strike!");
            slowText(string1);
            string1 = ("\tYou do: " + attack + " damage.");
            slowText(string1);
            i.set(1, (i.get(1)-attack));
            
            // checking if the monster is dead, and if so then exiting the loop
            
            System.out.println("The monster has " + i.get(1) + " health remaining.");
            
            if(i.get(1) <= 0){
                string1 = ("The monster perishes!");
                slowText(string1);
                break;
            }

            // print remaining monster health
            
            string1 = ("The monster has " + i.get(1) + " health remaining.\n");
            slowText(string1);

            string1 = ("\tThe monster strikes back at you! It deals " + i.get(0) + " damage!");
            slowText(string1);
            health -= i.get(0);
            player.setHealth(-(i.get(0)));

            // checking if player is dead
            deathText();

            // if player is not dead
            string1 = ("You have " + health + " health remaining.");
            slowText(string1);

        }
            
    }





















    

    public void deathText() throws InterruptedException{
        // this method will print the death text. But I do not want to print it if the player is not dead, so first it checks to see whether or not
        // the player is actually dead or not.
        if(player.getHealth() <= 0){
            String string1 = ("Immense pain blossoms from all over your body and the world goes black.");
            slowText(string1);
            string1 = ("You are dead. Reset the code to play again!");
            slowText(string1);
            while(true){
            }
        }

    }


    public void slowText(String string) throws InterruptedException{
        // What this method does is allows the text to print out one letter at a time, giving it the cool slowed effect
        //
        // It is able to do this because I use a for loop which iterates for the length of the string that is inputted into the method
        // Then it creats a substring of the string, which is a single letter, then prints that letter
        // Then it uses the Thread class with the sleep(x) method, where x is an integer value for the number of seconds
        System.out.println();
        for(int i = 0; i < string.length(); i ++){
            System.out.print(string.substring(i, i + 1));
            Thread.sleep(40);
        }
    }

    public void waitForSixSeconds() throws InterruptedException{
        // This method does exactly what it is named. It waits 6000 milliseconds, or 6 seconds.
        Thread.sleep(6000);
    }

    public void ClearTerminal(){
        // This method uses the escape key to clear the terminal so it can clear of all the past text so it does not get too crowded.
        System.out.println("\033[H\033[2J");
    }
    
}



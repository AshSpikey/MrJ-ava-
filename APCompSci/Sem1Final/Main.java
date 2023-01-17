package APCompSci.Sem1Final;   

// Imports
import java.util.Scanner;


public class Main{
    public static void main(String[] args) throws InterruptedException{
        // creating the scaner object
        Scanner sc = new Scanner(System.in);
        
        
        // /* this is the start of a multi line comment
        // intro text
        String string1 = ("You awake into a small med-bay, nothing but the occasionally flaring emergency lights illuminating your surroundings.");
        for(int i = 0; i < string1.length(); i ++){
            String letter = string1.substring(i, i +1);
            System.out.print(letter);
            Thread.sleep(40);
        }
        String string2 = ("Strapped into a small med-bed, you try to remember what happened. You can recall the Class Two emergency klaxon sounding, indicating that there had been a hull breach, and a short time later the Captain's voice coming shakily onto the shipwide intercom, indicating that you had been boarded. But after that it's all black.");
        System.out.println();
        for(int i = 0; i < string2.length(); i ++){
            String letter = string2.substring(i, i +1);
            System.out.print(letter);
            Thread.sleep(40);
        }

        // */ // this is the end of a multi line comment

        String string3 = ("You try and remember who you are, you are a… (Diplomat, Soldier, Mechanic)");
        System.out.println();
        for(int i = 0; i < string3.length(); i ++){
            String letter = string3.substring(i, i +1);
            System.out.print(letter);
            Thread.sleep(40);
        }
        

        // USE SUBSTRING AND THREAD.SLEEP(1000) TO HAVE IT TYPE OUT 1 CHAR AT A TIME
        
        // right here we need an input from the user! to do this we use a command from the scanner we just created
        // But first, in order to actually hold onto the answer the user gives, we must store it as a variable
        String answer = sc.nextLine().toLowerCase();

        // The user's answer is stored inside of our 'answer' variable, and the 'toLowerCase' method at the end turns
        // all of the characters to lower case.

        // Next we need to create our Player object. It is done like this: datatype name = new constructorname(parameters)
        Player user = new Player(answer);

        // Cool, so we have created our player, but they have no stats, so now we must use 
        // our newly created player, to create stats for them using our CreateStats method
        user.CreateStats();

        // So now we are ready to progress, but first we must create an object for the Event class 
        // in order to progress within the story, look up above where we created objects to see it!

        Event story = new Event(user);

        // Now we progress!
        story.FirstEvent(user.getItemList());

        
    }

    
}
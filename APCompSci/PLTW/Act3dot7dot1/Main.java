package APCompSci.PLTW.Act3dot7dot1;
import java.util.*;
public class Main {
    public static void main(String[] args){
        ArrayList<Person> myBestFriends = new ArrayList<Person>();
        myBestFriends.add(new Person(7, "Miley", false));
        myBestFriends.add(new Person(14, "Jeff", false));
        myBestFriends.add(new Person(101, "Bob", true));

        System.out.println(myBestFriends);
    }
}

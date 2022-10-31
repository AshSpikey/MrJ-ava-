import java.util.*;
public class Totally242 {
    public static void main(String[] args){
        // The goal of this program is to have a list of students, and use a for loop to randomly assing them a particular trait

        // initalzin list and items within the list 
        List <Student> students = new ArrayList<Student>();
        List <String> classes = new ArrayList<String>();

        // Creating student objects
        Student Joe = new Student("", 0.0, "Joe");
        Student Franklin = new Student("", 0.0, "Franklin");
        Student Martha = new Student("", 0.0, "Martha");
        Student Kyle = new Student("", 0.0, "Kyle");
        Student Bethia = new Student("", 0.0, "Bethia");

        // Creating possible classes to assing to students
        classes.add("Math");
        classes.add("Science");
        classes.add("History");
        
        students.add(Joe);
        students.add(Franklin);
        students.add(Martha);
        students.add(Kyle);
        students.add(Bethia);

        for(Student x: students){
            // setting the class
            int randomClass = (int) (Math.random()* 3);
            x.modifyFavoriteClass(classes.get(randomClass));

            // setting the happiness
            int randomHappinessInt = (int) (Math.random()*100);
            Double randomHappinessTenth = (Double) (Math.random());
            Double randomHappinessHundreth = (Double) (Math.pow(Math.random(), -1));
            Double actualHappiness = randomHappinessInt + randomHappinessTenth + randomHappinessHundreth;
            x.modifyHappinessLevel(actualHappiness);

            // Printing out the students and their values
            System.out.println(x);
            System.out.println("Favorite class is " + x.getFavoriteClass());
            System.out.println("Happiness level is " + x.getHappinessLevel() + "%.");
        }

        //creating the for loop to assing 

    }
}

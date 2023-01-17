package APCompSci.PLTW.Act3dot7dot1;

public class Person {
    private int age;
    private String name;
    private boolean alive;

    public Person(int age, String name, boolean alive){
        this.age = age;
        this.name = name;
        this.alive = alive;
    }

    public String toString(){
        String retString = (age + " " + name + " " + alive);
        return retString;
    }
}

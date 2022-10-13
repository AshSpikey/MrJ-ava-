package Test;
public class Main{
    public static void main(String[] args){
        System.out.println("\033[H\033[2J"); //This clears the terminal because I think the massive amount of random characters are stupid
        //System.out.println("Sayam is pretty cool");


        Test testVar = new Test();
        System.out.println(testVar.getFirstName());
    }
}
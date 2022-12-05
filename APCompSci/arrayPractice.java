package APCompSci;

public class arrayPractice {
    public static void main(String[] args){
        int[] numbers = new int[] {1,2,6,4,2,3,4,5,6,7,8};
        String[] letters = new String[] {"a","g","J","q","P"};
        boolean[] ob = new boolean[] {false, true, true, true, false, false};

        int x = 0;
        while(x<numbers.length){
            System.out.println(numbers[x]);
            x++;
        }

        for(int i = 0; i < letters.length; i++){
            System.out.println(letters[i]);
        }

        for(boolean y: ob){
            System.out.println(y);
        }
    }
}

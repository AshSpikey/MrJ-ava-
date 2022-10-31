import java.util.*;

public class sortingMethod {
    public static void main(String[] args){
        List<Integer> series = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int randomNumber = (int) (Math.random()*10);
            //System.out.println(randomNumber);
            series.add(randomNumber);
        }

        // Create sorting list 
        int index = 0;
        while(true){
            if(index + 1 < series.size()){
                int firstNumber = series.get(index);
                int secondNumber = series.get(index + 1);

                if (firstNumber > secondNumber){
                    series.set()
                }
            }
        }

    }
}

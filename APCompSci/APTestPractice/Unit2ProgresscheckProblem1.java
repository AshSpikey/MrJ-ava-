package APCompSci.APTestPractice;

public class Unit2ProgresscheckProblem1 {
    public static void main(String[] args){
        LightSequence gradShow = new LightSequence("0011 0011 0011");

        gradShow.changeSequence("0011 0011 0011");

        String resultSeq = gradShow.insertSegment("1111 1111", 4);
        System.out.println(resultSeq);
    }
}



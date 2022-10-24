package APCompSci.APTestPractice;

public class LightSequence {
    private String sequence;

    public LightSequence(String seq){
        sequence = seq;
    }

    public String insertSegment(String segment, int ind){
        String firstString = sequence.substring(0, ind);
        String secondString = sequence.substring(ind + 1);
        sequence = (firstString + " " + segment + " " + secondString);
        return sequence;
    }

    public void changeSequence(String seq){
        sequence = seq;
    }

    public void display(){
        //Displays stuff?
    }
}

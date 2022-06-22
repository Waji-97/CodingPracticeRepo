
public class AdditionProblem {

    private int x, y, answer;

    public AdditionProblem() {
        x = (int) (10 + 40 * Math.random());
        y = (int) (30 * Math.random());
        answer = x + y;
    }

    
    /** 
     * @return String
     */
    public String getProblem() {
        return "Compute the sum: " + x + " + " + y;
    }

    
    /** 
     * @return int
     */
    public int getAnswer() {
        return answer;
    }

}

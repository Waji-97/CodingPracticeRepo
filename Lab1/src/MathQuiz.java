import java.util.Scanner;

public class MathQuiz {
	
	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		AdditionProblem	additionProblem = new AdditionProblem();
		String num = additionProblem.getProblem();
		System.out.println("Question: " + num);
		try (Scanner ans = new Scanner(System.in)) {
			System.out.println("Your answer: ");
			int uAns = ans.nextInt();
			int sum = additionProblem.getAnswer();
			
			if (uAns == sum){
				System.out.println("Your answer is correct!");
			}
			else{
				System.out.println("Wrong answer!");
			}
		}
		
	      
	      
	}
}

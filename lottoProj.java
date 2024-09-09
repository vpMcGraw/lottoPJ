import java.util.*;
public class lottoProj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Generate 3 random numbers 0-9
		 * User enters 3 numbers 0-9
		 * Compare lotto numbers and user numbers
		 * if one number matches - 5$
		 * 2 matching- $50
		 * 3 match but not in exact order - 500$
		 * exact match - 2000$
		 * no matches - 0$
		 */
		
		/*PROBLEMS
		 * 1 - we have to compare 2 sets of 3 numbers at the same time for one result which gets long
		 * SOLUTION
		 * array probably
		 * 2 - that wasnt the actual solution im stupid
		 * 2 - it takes a lot of if statments to compare all 3 numbers regardless of if its an array or not
		 * SOLUTION 
		 * use .contains to see if it has "number"
		 * will have to parse everything as a string tho 
		 */
		Scanner scanner = new Scanner(System.in);
		boolean play = true;

		while(play == true){
			
			int lottoNums0 = (int)(Math.random()*20) + 1;
			int lottoNums1 = (int)(Math.random()*20) + 1;
			int lottoNums2 = (int)(Math.random()*20) + 1;
			
			
			
			System.out.println("Please input your first lotto number");
			String userNum0 = scanner.next();
			System.out.println("Please input your second lotto number");
			String userNum1 = scanner.next();
			System.out.println("Please input your third lotto number");
			String userNum2 = scanner.next();
			
			if(userNum0 == lottoNums0 && userNum1 == lottoNums1 && userNum2 == lottoNums2) {
				System.out.println("You win $2,000!");
			}
			else if(){
				
			}
			
			else {
				System.out.println("You win $0");
			}
		
		}

	}
}

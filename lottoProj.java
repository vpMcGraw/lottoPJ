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
		 * 2 - i forgor
		 */
		Scanner scanner = new Scanner(System.in);
		boolean play = true;
		
		int[] lottoNums;
		lottoNums = new int[3];
		
		lottoNums[0] = (int)(Math.random()*20) + 1;
		lottoNums[1] = (int)(Math.random()*20) + 1;
		lottoNums[2] = (int)(Math.random()*20) + 1;
		
		int userNum = scanner.nextInt();
		
		
	}

}

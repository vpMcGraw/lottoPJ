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
		 * STUPID SOLUTION THAT PROBABLY WONT WORK
		 * what is we just made it one giant number
		 */
		Scanner scanner = new Scanner(System.in);
		boolean play = true;
		
		int[] lottoNums;
		lottoNums = new int[3];
		
		lottoNums[0] = (int)(Math.random()*20) + 1;
		lottoNums[1] = (int)(Math.random()*20) + 1;
		lottoNums[2] = (int)(Math.random()*20) + 1;
		//_____________________ASKING FOR INPUT__________________________________
		System.out.println("Please input your first lotto number");
		int userNum1 = scanner.nextInt();
		System.out.println("Please input your second lotto number");
		int userNum2 = scanner.nextInt();
		System.out.println("Please input your third lotto number");
		int userNum3 = scanner.nextInt();
		
		
	}

}

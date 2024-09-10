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
		 * ok so when if lottoNum is 456 and i enter 555 it returns 500$
		 * how do i change it so it only recognizes each "char" once without 50 if statments???
		 * SOLUTION
		 * check if first second and or third are == to lotto1||2||3
		 */		
		
		/*TRY CATCHES
		 * user must input 3 numbers
		 * user must only input numbers (until the playcheck)
		 */
		Scanner scanner = new Scanner(System.in);
		boolean play = true;

		while(play == true){

			//lottonums
			String lotto1 = String.valueOf((int)(Math.random()*9));
			String lotto2 = String.valueOf((int)(Math.random()*9));
			String lotto3 = String.valueOf((int)(Math.random()*9));
			String full = lotto1+lotto2+lotto3;
			
			System.out.println(full);
			
			//usernums
			System.out.println("Please input your lotto number");
			String userNum1 = scanner.next();
			//usernum split MIGHT BE UNEEEDED***
			String first = String.valueOf(Integer.parseInt(userNum1)/100%10);
			String second = String.valueOf(Integer.parseInt(userNum1)/10%10);
			String third = String.valueOf(Integer.parseInt(userNum1)%10);
			
			if(full.equals(userNum1)){
				System.out.println("You win $2,000!");
			}
			else if(full.contains(first) && full.contains(second) && full.contains(third)){
				System.out.println("You win $500");
			}
			//check for 2 correct numbers
			else if((full.contains(first)&&full.contains(second))||(full.contains(second)&&full.contains(third))||full.contains(third)&&full.contains(first)){
				System.out.println("You win $50");
			}
			//check for 1 correct number
			else if(full.contains(first)||full.contains(second)||full.contains(third)){
				System.out.println("You win $5");
			}
			else {
				System.out.println("You win $0");
			}
		
		}

	}
}

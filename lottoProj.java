import java.util.*;

public class lottoProj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean play = true;
		int userNum1;

		while (play == true) {
			// lottonums
			String lotto1 = String.valueOf((int) (Math.random() * 9));
			String lotto2 = String.valueOf((int) (Math.random() * 9));
			String lotto3 = String.valueOf((int) (Math.random() * 9));
			String full = lotto1 + lotto2 + lotto3;

			System.out.println(full);

			
			try {
				System.out.println("Please input 3 numbers 0-9");
				userNum1 = scanner.nextInt();

				// usernum split MIGHT BE UNEEEDED***
				String first = String.valueOf((userNum1) / 100 % 10);
				String second = String.valueOf((userNum1) / 10 % 10);
				String third = String.valueOf((userNum1) % 10);

				// CALCULATIONS

				if (full.equals(String.valueOf(userNum1))) {
					System.out.println("You win $2,000!");
				}
				// check for 3 == but not in order
				else if (full.contains(first) && full.contains(second) && full.contains(third)) {
					
					if (first.equals(second)|| second.equals(third) || third.equals(first)) {
						if (lotto1.equals(lotto2)&&!!lotto2.equals(lotto3)||lotto2.equals(lotto3)&&!!lotto3.equals(lotto1)||lotto3.equals(lotto1)&&!!lotto1.equals(lotto2)) {
							System.out.println("You win $500");
						} 
						else {
							System.out.println("You win $50");
						}
					} 
					else {
						System.out.println("You win $500");
					}
				}
				// check for 2 correct numbers
				else if ((full.contains(first) && full.contains(second))|| (full.contains(second) && full.contains(third))|| full.contains(third) && full.contains(first)) {
					if (first.equals(second) || second.equals(third) || third.equals(first)) {
						if (lotto1.equals(lotto2)&&!!lotto2.equals(lotto3)||lotto2.equals(lotto3)&&!!lotto3.equals(lotto1)||lotto3.equals(lotto1)&&!!lotto1.equals(lotto2)) {
							System.out.println("You win $50");
						} 
						else {
							System.out.println("You win $5");
						}
					} 
					else {
						System.out.println("You win $50");
					}
				}
				// check for 1 correct number
				else if (full.contains(first) || full.contains(second) || full.contains(third)) {
					if (first.equals(second) || second.equals(third) || third.equals(first)) {
						if (lotto1.equals(lotto2) || lotto2.equals(lotto3) || lotto3.equals(lotto1)) {
							System.out.println("You win $5");
						} 
						else {
							System.out.println("You win $0");
						}
					} 
					else {
						System.out.println("You win $5");
					}
				} 
				else {
					System.out.println("You win $0");
				}
				
				System.out.println("Lottery number was " + full);
				System.out.println("Would you like to play again? Type 0 for no, type any other number for yes.");
				int playAgain = scanner.nextInt();
				if(playAgain == 0) {
					play = false;
					scanner.close();
				}
			} 
			//CATCH
			catch (InputMismatchException IME) {
				scanner.next();
			}

		}

	}
}

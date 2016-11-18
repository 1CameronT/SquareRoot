import java.util.Scanner;

/**
 * 
 */

/**
 * @author c.toy
 *
 */
public class SquareRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userNum = 0;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("\nEnter a number: ");
		userNum = userInput.nextInt();
		
		while(userNum <1){
			System.out.print("\nPlease Enter a positive number: ");
			userNum = userInput.nextInt();
		}
		
			
		System.out.println("your square root is: " +Math.sqrt(userNum));
			
			
		userInput.close();
		
		
		


	}
}



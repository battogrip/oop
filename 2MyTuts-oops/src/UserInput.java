import java.util.Scanner;

//control + shf + O; import statement

public class UserInput {
	public static void main(String[] args) {
	        
	        // Create scanner object
	        Scanner input = new Scanner(System.in);
	        
	        // Output the prompt
	        System.out.println("Enter a line of text: ");
	        //System.out.println("Enter a floating point value: ");
	        
	        // Wait for the user to enter something.
	        //double value = input.nextDouble();
	        String line = input.nextLine();
	        
	        // Tell them what they entered.
	        //System.out.println("You entered: " + value);
	        System.out.println("You entered following textLine: " + line);
	    }
}

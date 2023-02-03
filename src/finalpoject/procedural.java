package finalpoject;
import java.util.Scanner;

public class procedural {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter a non-negative integer: ");
	    int num = input.nextInt();

	    long result = calculateFactorial(num);
	    System.out.println("The factorial of " + num + " is " + result);}
	
	

	 
		 
		  public static long calculateFactorial(int num) {
		    if (num < 0) {
		      throw new IllegalArgumentException("Number must be non-negative");
		    }

		    long result = 1;
		    for (int i = 1; i <= num; i++) {
		      result *= i;
		    }

		    return result;
		  }
		
	 }
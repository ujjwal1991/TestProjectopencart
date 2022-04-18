package conditionalStatements;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner console = new Scanner(System.in);
       // int num; // To hold number
        int fact = 1; // To hold factorial
        
       // System.out.print("Enter any positive integer: ");
      //  num = console.nextInt();
       
        for(int i=1; i<=5; i++)
        {
            fact = fact*i;
        }
        
        System.out.println("Factorial: "+ fact);
	}

}

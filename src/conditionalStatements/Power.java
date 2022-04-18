package conditionalStatements;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int base;
     int power;
     int result = 1;
     System.out.print("Enter thec base number ");
     base = sc.nextInt();
     
     System.out.print("Enter the power ");
     power = sc.nextInt();
     
     for (int i = 1; i <=power; i++) {
    	 result = result*base;
		
	}
     System.out.println("Result: "+ result);
	}

}

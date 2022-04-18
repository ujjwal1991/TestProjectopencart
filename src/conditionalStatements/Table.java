package conditionalStatements;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a positive number");
       num = sc.nextInt();
       System.out.println("Multiplication Table of " + num);
       for (int i = 1; i <=10; i++) {
		System.out.println(num +" X " +  i + " = "+ (num*i));
	}
      
	}

}

package Fact;

import java.util.Scanner;

public class App {



	public static void main(String[] args) {
		
		
		Scanner	scanner = new Scanner(System.in);
		System.out.println("Enter ther value: ");
		Integer  number = scanner.nextInt();
		Factor.Factorial(number);
	}
}

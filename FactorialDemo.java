package integers;

import java.util.Scanner;

public class FactorialDemo {
    static int factorial(int n) 
    { 
        int res = 1, i; 
        for (i=2; i<=n; i++) 
            res *= i; 
        return res; 
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=0;
		int num = scanner.nextInt();
		do {			
			System.out.println("The factorial for the number is :" + factorial(num));	
			System.out.println("Enter a number:");
			num = scanner.nextInt();
			
		}				
		while(n !=num);
		System.out.println("Out!");
		scanner.close();
	}

}

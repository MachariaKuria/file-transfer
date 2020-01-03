package integers;

import java.util.Scanner;

public class PrimeNumbersDemo {

	public static void main(String[] args) {
		int n;
		int status = 1;
		int num=3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("The first 100 prime numbers is:");
		n = scanner.nextInt();
		
	      for ( int i = 2 ; i <=100 ;  )
	      {
	         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
	         {
	            if ( num%j == 0 )
	            {
	               status = 0;
	               break;
	            }
	         }
	         if ( status != 0 )
	         {
	            System.out.println(num);
	            i++;
	         }
	         status = 1;
	         num++;
	      }
	      scanner.close();
	}

}

package prime;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		
		System.out.println("Enter the number to check for prime number:");
		int n = sc.nextInt();
		
		if(n==0||n==1) //0 and 1 are not prime numbers
			flag = true;
		for(int i=2; i <= n/2; i++) { //2 is the only even prime number
			if(n%i==0) {
				flag = true;
				break;
			}
		}
		
		if(!flag)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
	}

}

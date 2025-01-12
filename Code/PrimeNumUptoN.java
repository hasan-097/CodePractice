package Interview;

import java.util.Scanner;

public class PrimeNumUptoN {

	static boolean isPrime(int n)
	{
		if(n<=1)
		return false;
		
		int c=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				c++;
		}
		if(c>=1)
		{
		return false;
		}
		else
		{
			return true;
		}
	}
	
	static void PrimeCheck(int n)
	{
		int i;
		for(i=2;i<=n;i++)
		{
			if(isPrime(i))
				System.out.println(i+" ");	
			else continue;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit :");
		int n=sc.nextInt();
		PrimeCheck(n);
	}

}

package Interview;

import java.util.Scanner;



public class FibonacciTriangle {

	public static int RecursiveNthFib(int n)
	{
		if(n<=1)
			return n;
		else
			return (RecursiveNthFib(n-1)+RecursiveNthFib(n-2));
		
	}
	
	public static int NthFib(int n)
	{
		int a=0,b=1,c=0,l=1;
		if(n<=2)
			return 1;
		else
		{
			
			while(l!=n)
			{
				c=a+b;
				a=b;
				b=c;
				l++;
			}			
		}
		return c;
		
	}
	
	public static void FibTriangle(int limit)
	{
		
		for(int i=1;i<=limit;i++)
		{
			int a=0,b=1,c;
			System.out.print(b+" ");
			for(int j=1;j<i;j++)
			{
				c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		FibTriangle(n);
		System.out.println(RecursiveNthFib(n));
		System.out.println(NthFib(n));
	}

}

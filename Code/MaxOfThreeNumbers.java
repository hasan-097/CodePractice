package Interview;

import java.util.Scanner;

public class MaxOfThreeNumbers {

	static int FindMax(int a,int b,int c)
	{
		int max=0,max1=0;
		max1=a>b?a:b;
		max=max1>c?max1:c;
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number :");
		int n1=sc.nextInt();
		System.out.println("Enter the Second Number :");
		int n2=sc.nextInt();
		System.out.println("Enter the Third Number :");
		int n3=sc.nextInt();
		System.out.println("Max Number is : "+FindMax(n1,n2,n3));
	}

}

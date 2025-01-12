package Interview;

import java.util.Scanner;

public class LCM {

	public static int GCD(int m, int n) {
		if(m==n)
	 		 return m;	 	 
	 	 else
	 	 {
	 		 if(m<n)
	 		 return GCD(m,n-m);
	 		 else
	 			return GCD(m-n,n);
	 	 }
	}
	public static int LCM(int m, int n)
	{
		int g=GCD(m,n);
		int q1=m/g;
		int q2=n/g;
		return g*q1*q2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First num :");
		int m=sc.nextInt();
		System.out.println("Enter the Second num :");
		int n=sc.nextInt();
		System.out.println("LCM :"+LCM(m,n));
	}

}

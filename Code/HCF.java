package Interview;

import java.util.Scanner;


public class HCF {

	 static int firstmethod(int m, int n)
	 {
	 	 while(m!=n)
	 		{
	 			if(m>n)
	 				m=m-n;
	 			else
	 				n=n-m;
	 		}
	 	return m;
	 }
	 
	 static int secondmethod(int m, int n)
	 {
	 	 if(m==n)
	 		 return m;	 	 
	 	 else
	 	 {
	 		 if(m<n)
	 		 return secondmethod(m,n-m);
	 		 else
	 			return secondmethod(m-n,n);
	 	 }
	 }
	 
	 static int thirdmethod(int m, int n)
	 {
		 int r;
	 	 while(m!=0)
	 	 {
	 		 if(m>n)
	 			 r=m%n;
	 		 else
	 			 r=n%m;
	 		 n=m;
	 		 m=r;
	 	 }
	 	 return n;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First num :");
		int m=sc.nextInt();
		System.out.println("Enter the Second num :");
		int n=sc.nextInt();
		System.out.println("GCD using firstmethod "+firstmethod(m,n));
		System.out.println("GCD using SecondMethod(Recursive) :"+secondmethod(m,n));
		System.out.println("GCD using thirdmethod :"+thirdmethod(m,n));
		

	}

}

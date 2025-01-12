package Interview;

import java.util.Scanner;

public class ReverseDigitOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num :");
		int n=sc.nextInt();
		int n1=0,r;
		while(n!=0)
		{
			r=n%10;
			n1=(n1*10)+r;
			n=n/10;
		}
		System.out.println("The reversed num is : "+n1);
	}

}

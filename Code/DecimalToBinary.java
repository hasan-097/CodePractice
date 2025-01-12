package Interview;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num :");
		int n=sc.nextInt();
		int a[]=new int[10],i,c=0;
		for(i=0;n>0;i++)
		{
			a[i]=n%2;
			n=n/2;
		}
		for(c=i;c>=0;c--)
		{
			System.out.print(a[c]);
		}
	}

}

package Interview;

import java.util.Scanner;

public class ReverseStringByCharacterSwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.next();
		int l=s.length();
		int i;
		char chars[]=s.toCharArray();
		char temp;
		for(i=0;i<=l/2;i++)
		{
			temp=chars[i];
			chars[i]=chars[l-i-1];
			chars[l-i-1]=temp;
		}
		s=new String(chars);
		System.out.println(s);
	}

}

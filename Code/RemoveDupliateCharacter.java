package Interview;

import java.util.Scanner;

public class RemoveDupliateCharacter {

	
	public static String RemoveDuplicate(String first, String second)
	{
		String s3="";
		int i;
		char charfirst[]=first.toCharArray();
		char charsecond[]=second.toCharArray();
		for( i=0;i<first.length();i++)
		{
			for(int j=0;j<second.length();j++)
			{
				if(charfirst[i]==charsecond[j])
					charsecond[j]='0';
			}
		}
		System.out.println(charsecond);
		
		for(i=0;i<second.length();i++)
		{
			if(charsecond[i]=='0')
				continue;
			else
				s3+=charsecond[i];
		}
		return s3;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String: ");
		String first=sc.nextLine();
		System.out.println(first.length());
		System.out.println("Enter second String: ");
		String second=sc.nextLine();
		System.out.println(second.length());
		System.out.println(RemoveDuplicate(first,second));
	}

}

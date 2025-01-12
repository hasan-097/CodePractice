package Interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoOfVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="JAV,i(/&ASEIO";
		String s2="aT01Ve";
		String s3="vowels";
		String regex="[aeiouAEIOU,()/*&]";
		String reg="[0-9a-z]";
		String reg1="[aeiouAEIOU]";
		int count=0;
		int count1=0;
		int count2=0;
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(s1);
		Pattern p1=Pattern.compile(reg);
		Matcher m1=p1.matcher(s2);
		Pattern p2=Pattern.compile(reg1);
		Matcher m2=p2.matcher(s3);
		for(int i=0;i<s1.length();i++)
		{
			if(m.find())
				count++;
		}
		System.out.println(count);
		for(int i=0;i<s2.length();i++)
		{
			if(m1.find())
				count1++;
		}
		
		System.out.println(count1);
		
		for(int i=0;i<s3.length();i++)
		{
			if(m2.find())
				count2++;
		}
		System.out.println(count2);
	}

}

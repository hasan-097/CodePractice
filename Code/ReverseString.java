package Interview;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="MADNM";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev+=s1.charAt(i);
		}
		System.out.println(rev);
		if(s1.equals(rev))
			System.out.println("Palindrome String");
		else
			System.out.println("Not a Palindrome String");
		
		
	}

}

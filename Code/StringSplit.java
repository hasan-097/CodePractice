package Interview;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "This is the example of string split";
		String s3="This  / i osbhc / jhe";
		String s2[]=s1.split(" ");
		String s4[]=s3.split("/");
		System.out.println(s2.length);
		System.out.println(s4.length);
	}

}

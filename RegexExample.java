import java.util.regex.*;
class RegexExample
{
	public static void main(String[] args)
	{
		boolean b=Pattern.compile("[a-zA-Z-0-9._]+@[a-zA-Z-0-9._]+.[a-zA-Z]{2,3}").matcher("sonaj123@gmail.com").matches();
		System.out.println("Email matches:"+b);
		boolean b1=Pattern.compile("[a-zA-Z-0-9._]{6,30}").matcher("sonaj123").matches();
		System.out.println("Username matches:"+b1);
		boolean b2=Pattern.compile("[a-zA-Z-0-9._@%]{8,16}").matcher("sonaj@123").matches();
		System.out.println("Password matches:"+b2);
	}
}

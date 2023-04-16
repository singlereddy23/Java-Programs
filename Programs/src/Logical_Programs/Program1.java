package Logical_Programs;

public class Program1
{
	public static void main(String[] args)
	{
		String str = "abcd";
		System.out.println(str.substring(1, 3));
		
		System.out.println("---------------------");
		
		String s1="cscorner";
		String s2 = new String(s1);
		
		System.out.println((s1==s2)+" "+(s1.equals(s2)));
		
	}
}
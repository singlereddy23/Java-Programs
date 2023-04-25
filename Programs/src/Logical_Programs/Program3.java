package Logical_Programs;

import java.util.Scanner;

public class Program3
{
	private static final String[] ones =
	{ "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	private static final String[] tens =
	{ "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
	private static final String[] teens =
	{ "", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 9999: ");
		int number = input.nextInt();
		String words = convertNumberToWords(number);
		System.out.println(words);
	}

	public static String convertNumberToWords(int number)
	{
		if (number == 0)
		{
			return "zero";
		}
		if (number < 0)
		{
			return "minus " + convertNumberToWords(-number);
		}
		if (number <= 9)
		{
			return ones[number];
		}
		if (number <= 19)
		{
			return teens[number - 10];
		}
		if (number <= 99)
		{
			return tens[number / 10] + ((number % 10 != 0) ? " " : "") + ones[number % 10];
		}
		if (number <= 999)
		{
			return ones[number / 100] + " hundred" + ((number % 100 != 0) ? " and " : "")
					+ convertNumberToWords(number % 100);
		}
		if (number <= 9999)
		{
			return ones[number / 1000] + " thousand" + ((number % 1000 != 0) ? " " : "")
					+ convertNumberToWords(number % 1000);
		}
		return "";
	}
}
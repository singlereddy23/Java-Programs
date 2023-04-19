package Java_Patterns;

public class patterns5
{
	public static void main(String[] args)
	{

		for (int i = 1; i <= 5; i++)
		{
			for (int j = 0; j <= 5; j++)
			{
				if (i == j)
				{
					System.out.print(1+" ");
				} 
				else if (j > i)
				{
					System.out.print(8+" ");
				} 
				else if (j < i)
				{
					System.out.print(9+" ");
				}
			}
			System.out.println();
		}
	}
}
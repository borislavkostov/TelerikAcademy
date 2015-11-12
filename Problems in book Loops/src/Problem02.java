import java.util.Scanner;

public class Problem02 
{

	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter N ");
		int N =scanner.nextInt();
		for (int i = 1; i<=N; i++) 
		{
			if (i%3>0 ^ i%7>0) 
			{
				
			}
			else
			{
				System.out.print(i+" ");
			}
			
		}

	}

}

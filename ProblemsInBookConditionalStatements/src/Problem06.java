import java.util.Scanner;

public class Problem06 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner (System.in);
		int[]numbers=new int[5];
		int result =Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) 
		{
			numbers[i]=scanner.nextInt();
		}
		for (int i = 0; i < numbers.length; i++) 
		{
			if (numbers[i]>result) 
			{
				result=numbers[i];
			}
		}
		System.out.println(result);

	}

}

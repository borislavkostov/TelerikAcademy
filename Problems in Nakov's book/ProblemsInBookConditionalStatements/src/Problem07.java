import java.util.Scanner;

public class Problem07 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner (System.in);
		int[]numbers=new int[3];
		int sum=Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) 
		{
			numbers[i]=scanner.nextInt();
		}
		for (int i = 0; i < numbers.length-1; i++) 
		{
			sum=numbers[i]+numbers[i+1];
			if (sum==0) 
			{
				System.out.println(numbers[i]+"+"+numbers[i+1]+"="+sum);
			}
			
		}
		

	}

}

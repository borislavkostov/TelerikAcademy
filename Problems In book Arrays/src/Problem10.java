import java.util.Scanner;

public class Problem10 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[][]numbers=new int[n][n];
		int counter=0;
		//a
		for (int i = 0; i < numbers.length; i++) 
		{
			for (int j = 0; j <n; j++) 
			{
				counter+=1;
				numbers[j][i]=counter;
			}
		}
		for (int i = 0; i < numbers.length; i++) 
		{
			for (int j = 0; j < numbers[0].length; j++) 
			{
				System.out.print(numbers[i][j]);			
			}
			System.out.println();
		}

	}

}

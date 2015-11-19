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
		PrintMatrix(numbers);

	}
	public static void PrintMatrix(int[][]array)
	{
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array[0].length; j++) 
			{
				System.out.print(array[i][j]+" ");			
			}
			System.out.println();
		}

	}
}

import java.util.Scanner;

public class Problem10b 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[][]numbers=new int[n][n];

        for (int i = 1; i < numbers.length; i++)
        {
            if (i % 2 == 1)
            {
                numbers[0][i] = numbers[0][i-1]+n*2-1;
            }
            else
            {
                numbers[0][i] = numbers[0][i-1]+1;
            }
        }

        for (int i = 1; i < numbers.length; i++)
        {
            for (int j = 0; j < numbers[0].length; j++)
            {
                if (j % 2 == 1)
                {
                    numbers[i][j] = numbers[i-1][j]-1;
                }
                else
                {
                    numbers[i][j] = numbers[i-1][j]+1;
                }
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



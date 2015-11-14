import java.math.BigInteger;
import java.util.Scanner;

public class Problem06 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter K ");
		int K=scanner.nextInt();
		System.out.print("Enter N ");
		int N=scanner.nextInt();
		int number=1;
		if (N <= 1 || K >= N || K < 1 || N > 100 || K >= 100) 
		{
			System.out.println("Error -Invalid input");
		}
		else 
		{
			long resultDivision =1;
            for (int i = N; i > K; i--)
            {
                resultDivision *=i;
            }
            System.out.println(resultDivision);
		}
	}

}

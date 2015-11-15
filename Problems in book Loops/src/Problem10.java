import java.util.Scanner;

public class Problem10 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		for (int i = 0; i <= N-1; i++) 
		{
			for (int j = 1; j <=N; j++) 
			{
				System.out.print(i+j);
			}
			System.out.println();
		}

	}

}

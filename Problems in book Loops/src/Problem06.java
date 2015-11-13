import java.util.Scanner;

public class Problem06 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int K=scanner.nextInt();
		int N=scanner.nextInt();
		int number;
		for (int i = K; i < N-1; i++) 
		{
			number=i+1;
			System.out.print(number+" ");
		}

	}

}

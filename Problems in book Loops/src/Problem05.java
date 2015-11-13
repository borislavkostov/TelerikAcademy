import java.util.Scanner;

public class Problem05 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int N =scanner.nextInt();
		int f1=0;
		int f2=1;
		for (int i = 0; i <= N; i++) 
		{
			//Fibonacci numbers
			f2=f1+f2;
			f1=f2-f1;
			System.out.print(f1+" ");
		}

	}

}

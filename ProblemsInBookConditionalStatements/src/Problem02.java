import java.util.Scanner;

public class Problem02 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		double a=scanner.nextDouble();
		double b=scanner.nextDouble();
		double result=a/b;
		if (result>=0) 
		{
			System.out.println("+");
		}
		else
		{
			System.out.println("-");
		}

	}

}

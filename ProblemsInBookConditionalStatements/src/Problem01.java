import java.util.Scanner;

public class Problem01 
{

	public static void main(String[] args) 
	{ 
		Scanner scanner =new Scanner(System.in);
		int a =scanner.nextInt();
		int b =scanner.nextInt();
		int result;
		if (a>b)
		{
		result=a;
		a=b;
		b=result;		
		}
		System.out.println(a);

	}

}

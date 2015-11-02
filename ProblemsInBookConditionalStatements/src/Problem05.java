import java.util.Scanner;

public class Problem05 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		int d=(b*b)-(4*a*c);
		double x;
		double xTwo;
		if (d==0) 
		{
			x=-b/2*a;
			System.out.println(x);
		}
		else if (d>0)
		{
			x=(-b+d*d)/ (2*a);
			xTwo=(-b-(d*d))/(2*a);
			System.out.println(x);
			System.out.println(xTwo);
		}
		else
		{
			System.out.println("Няма реални корени");
		}
		
	}

}

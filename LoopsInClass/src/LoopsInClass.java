import java.util.Scanner;

public class LoopsInClass 
{

	public static void main(String[] args) 
	{
		//while loop
		int n =10;
		int currentNumber=1;
		while(currentNumber<=n)
		{
			System.out.print(currentNumber++);
		}
		System.out.println();
		//For loops
		Scanner scanner=new Scanner(System.in);
		int number =scanner.nextInt();
		boolean isEven=true;
		for(;;) 
		{
			if(number%2==0)
			{
				System.out.println("even");
				isEven=true;
				System.out.println(isEven);
				break;
			}
			else
			{
				System.out.println("odd");
				isEven=false;
				System.out.println(isEven);
				break;
			}
		}
		
		
	}

}

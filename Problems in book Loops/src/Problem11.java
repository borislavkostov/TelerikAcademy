import java.util.Scanner;

public class Problem11 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter n ");
		int n=scanner.nextInt();
		long factorial=1;
		int zeroes=0;
		while (true) 
		{
			if(n==1)
			{
				break;
			}
			factorial*=n;
			n--;
		}
		System.out.println(factorial);
		while (true) 
		{
			if(factorial%5==0)
			{
				factorial/=5;
				zeroes+=1;
			}
			else 
			{
				break;
			}			
		}
		System.out.println(zeroes);

}
}

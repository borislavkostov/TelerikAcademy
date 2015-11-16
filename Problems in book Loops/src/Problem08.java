import java.util.Scanner;

public class Problem08 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter n ");
		int n=scanner.nextInt();
		System.out.print("Enter x ");
		int x=scanner.nextInt();
		long factorial=1;
		int sum=0;
		int[] sumTwo=new int[n];
		for (int i = 1; i <= n; i++) 
		{
			if (i==n) 
			{
				while (true) 
				{
					if(i==1)
					{
						break;
					}
					factorial*=i;
					i--;
				}
			}
			else
			{
			x=(int) Math.pow(x, i);
			sum=(int) (factorial/x);
			sumTwo[i]=sum;
			}
		}
		for (int i = 0; i < sumTwo.length; i++) 
		{
			sum+=sumTwo[i];
		}
		System.out.println(sum);
	}

}

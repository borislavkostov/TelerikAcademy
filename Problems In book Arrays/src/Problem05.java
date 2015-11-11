import java.util.Scanner;

public class Problem05 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("n= ");
		int n=scanner.nextInt();
		int[] numbers=new int[n];
		int[] bestLength =new int[n];
		int start=1;
		int count=1;
	    int bestCount=0,bestStart=0;
		
		for (int i = 0; i < numbers.length; i++) 
		{
			numbers[i]=scanner.nextInt();
		}
		for (int i = 0; i < numbers.length-1; i++) 
		{
			if (numbers[i]<numbers[i+1]) 
			{
				bestLength=numbers;	
				start=(i+1)-count;
				count+=1;

				   if(count>bestCount)
				   {
				   bestCount=count;
				   bestStart=start;
				   }
			}
			else
			{
				count=1;
				start=i+1;
			}
		}
		System.out.println("Началото на редицата е от индекс:"+bestStart);
	    System.out.println("bestCount="+bestCount);
		   for(int i=bestStart;i<bestStart+bestCount;i++){
		     System.out.print(" " + numbers[i]);

		   }

	}

}

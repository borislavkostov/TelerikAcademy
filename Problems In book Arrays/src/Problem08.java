import java.util.Scanner;

public class Problem08 
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
		BubbleSort(numbers);
		for (int i = 0; i < numbers.length-1; i++) 
		{
			if (numbers[i]==numbers[i+1]) 
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
				bestLength[i]=0;
			}
		}
	    System.out.println("bestCount="+bestCount);
	}
	public static void BubbleSort(int[] numbers)
	{
		int temp = 0;

	    for (int i = 0; i < numbers.length; i++) 
	    {
	        for (int j = 1; j < (numbers.length - i); j++) 
	        {

	            if (numbers[j - 1] > numbers[j]) {
	                temp = numbers[j - 1];
	                numbers[j - 1] = numbers[j];
	                numbers[j] = temp;
	            }
	        }
	    }
	}

}



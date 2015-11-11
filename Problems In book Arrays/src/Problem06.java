import java.util.Scanner;

public class Problem06 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter N ");
		int N=scanner.nextInt();
		System.out.print("Enter K ");
		int K=scanner.nextInt();
		int[] numbers=new int[N];
		for (int i = 0; i < numbers.length; i++) 
		{
			numbers[i]=scanner.nextInt();
		}
		BubbleSort(numbers);//Bubble sort
		for (int i = numbers.length-1; i>=K; i--) 
		{
			System.out.print(numbers[i]+" ");
		}
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


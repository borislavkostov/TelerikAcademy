import java.util.Scanner;

public class ArraysInClass 
{

	public static void main(String[] args) 
	{
		//how to make array
		Scanner scanner =new Scanner(System.in);
		int n=3;
		int result=Integer.MIN_VALUE;
		int[] numbers=new int[n];
		//read input
		for (int i = 0; i < numbers.length; i++) 
		{
			numbers[i]=scanner.nextInt();
		}
		//Max number
		for (int i = 0; i < numbers.length; i++) 
		{
			if(result<numbers[i])
			{
				result=numbers[i];
			}
		}
		System.out.println(result);
		//Reverse Array
	
		int length = numbers.length;

		// Declare and create the reversed array
		int[] reversed = new int[length];

		// Initialize the reversed array
		for (int index = 0; index < length; index++) 
		{
		    reversed[length-index-1] = numbers[index];
		}
		for (int i = 0; i < reversed.length; i++) 
		{
			System.out.print(reversed[i]+" ");
		}
		
	}

}

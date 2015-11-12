import java.util.Scanner;

public class Problem03 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int[] numbers =new int[3];
		int minTwo;
		int min=Integer.MIN_VALUE;
		int max=Integer.MIN_VALUE;
	    for (int i = 0; i < numbers.length; i++) 
	    {
	    	numbers[i]=scanner.nextInt();
	    }
	    BubbleSort(numbers);
	    min=numbers[0];
	    max=numbers[numbers.length-1];
	    
		System.out.println("Min value= "+min+"  Max value= "+max);

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

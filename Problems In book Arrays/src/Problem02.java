import java.util.Scanner;

public class Problem02 
{

	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		int arrayLength=scanner.nextInt();
		int arrayLengthTwo=scanner.nextInt();
		boolean Isequal=false;
		int[] numbers =new int[arrayLength];
		int[] numbersTwo=new int[arrayLengthTwo];
		if (arrayLength==arrayLengthTwo) 
		{
			for (int i = 0; i < numbers.length; i++) 
			{
				numbers[i]=scanner.nextInt();
			}
			for (int i = 0; i < numbersTwo.length; i++) 
			{
				numbersTwo[i]=scanner.nextInt();
			}
			for (int i = 0; i < numbersTwo.length; i++) 
			{
				if (numbers[i]==numbersTwo[i]) 
				{
					Isequal=true;
				}
				else
				{
					Isequal=false;
				}
			}
		}
		else
		{
			Isequal=false;						
		}
		if (Isequal==true) 
		{
			System.out.println("They are equal");
		}
		else 
		{
			
			System.out.println("They are'n equal");
		}
		

	}

}

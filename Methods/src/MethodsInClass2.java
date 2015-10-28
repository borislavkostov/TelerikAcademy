import java.util.Scanner;

public class MethodsInClass2 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		printMax(new int[]{1,2,-4,5,231,-52424,-5});
		

	}
	static void printMax(int[] numbers)
	{
		//for (i=0;i<numbers.Length;i++)
		//{
		//int number=numbers[i];
		//}Its same as
		int max=numbers[0];
		for(int number:numbers)
		{
			if(max<number)
			{
				max=number;
				
			}
		}
		System.out.println(max);
	}
	

}

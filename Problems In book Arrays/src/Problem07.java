import java.util.Scanner;

public class Problem07 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n ");
		int n=scanner.nextInt();
		int[] numbers=new int[n];
		for (int i = 0; i < numbers.length; i++) 
		{
			numbers[i]=scanner.nextInt();
		}
		doSelectionSort(numbers);
		for (int i = 0; i < numbers.length; i++) 
		{
			System.out.print(numbers[i]+" ");
		}

	}
	public static int[] doSelectionSort(int[] arr)
	{
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
}


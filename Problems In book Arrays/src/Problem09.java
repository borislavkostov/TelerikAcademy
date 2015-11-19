import java.util.Scanner;

public class Problem09 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int[] numbers={4,3,1,4,2,5,8};
		int S=scanner.nextInt();
		FindSequenceOfGivenSum(numbers,S);

	}
	static void PrintArray(int startIndex, int endIndex, int[] array)
    {
        System.out.println("Sequence of given sum is present:");
        System.out.print("{ ");
        for (int i = startIndex; i <= endIndex; i++)
        {
        	System.out.print(array[i]+" ");
        }
        System.out.println("}");
    }
    private static void FindSequenceOfGivenSum(int[] numbersArray, int sum)
    {
        long currentSum = 0;
        for (int currentEndIndex = 0; currentEndIndex < numbersArray.length; currentEndIndex++)
        {
            currentSum = 0;
            for (int currentSumIndex = currentEndIndex; currentSumIndex >= 0; currentSumIndex--)
            {
                currentSum += numbersArray[currentSumIndex];
                if (currentSum == sum)
                {
                    PrintArray(currentSumIndex, currentEndIndex, numbersArray);
                    return;
                }
            }
        }
        System.out.println("There is no sequence of given sum!");
    }

}

import java.util.Scanner;
import java.util.*;

public class ConditionalStatementsInClass 
{

	public static void main(String[] args) 
	{
		//If statements
		Scanner scanner=new Scanner(System.in);
		String password=scanner.nextLine();
		if(password.length()>=6)
		{
			System.out.println("Valid password");
		}
		else
		{
			System.out.println("Invalid password");
		}
		//
		System.out.println("Enter first number");
		int firstNum=scanner.nextInt();
		System.out.println("Enter second number");
		int secondNum=scanner.nextInt();
		if (firstNum>secondNum) 
		{
			System.out.println("First number is greater");
		}
		//Else if statemnet
		else if (secondNum==firstNum)
		{
			System.out.println("They are equal");
		}
		else
		{
			System.out.println("Second number is greater");
		}
		
		
		
		
		
	}

}

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
		//Switch-case Statements
		System.out.println("Enter day");
		int day=scanner.nextInt();
		
		switch (day) 
		{
		  case 1: System.out.println("Monday"); break;
		  case 2: System.out.println("Tuesday"); break;
		  case 3: System.out.println("Wednesday"); break;
		  case 4: System.out.println("Thursday"); break;
		  case 5: System.out.println("Friday"); break;
		  case 6: System.out.println("Saturday"); break;
		  case 7: System.out.println("Sunday"); break;
		  default: System.out.println("Error!"); break;
		}
		
		
		
		
	}

}

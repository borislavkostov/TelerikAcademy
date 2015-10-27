import java.util.Scanner;
import java.util.*;

public class ConditionalStatementsInClass 
{

	public static void main(String[] args) 
	{
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

	}

}

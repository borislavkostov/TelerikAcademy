import java.util.Scanner;

public class MethodsInClass 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter you name");
		//String name =scanner.next();
		//printName(name);
		//System.out.println();
		printLogo();
		System.out.println("Enter number");
		String numberAsString =scanner.nextLine();
		int number=stringToInt(numberAsString);
		System.out.println(number);
		

	}
	static void printLogo()
	{
		System.out.println("Telerik Academy");
		System.out.println("http://academy.telerik.com");
	}
	static String printName(String name)
	{	
		System.out.printf("Nice to meet you %s !",name);
		
		return name;			
	}
	static int stringToInt(String stringAsInt)
	{
		int number=Integer.parseInt(stringAsInt);
		return number;
		
	}

}

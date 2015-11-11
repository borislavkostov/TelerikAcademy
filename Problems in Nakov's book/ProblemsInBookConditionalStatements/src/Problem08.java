import java.util.Scanner;

public class Problem08 
{

	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		int number=scanner.nextShort();
		int result=0;
		switch (number) 
		{
		case 1:
			result=number*10;
			break;
		case 2:
			result=number*10;
			break;
		case 3:
			result=number*10;
			break;
		case 4:
			result=number*100;
			break;
		case 5:
			result=number*100;
			break;
		case 6:
			result=number*100;
			break;
		case 7:
			result=number*1000;
		case 8:
			result=number*1000;
			break;
		case 9:
			result=number*1000;
			break;

		default:
			break;
		
		}
		System.out.println(result);
		

	}

}

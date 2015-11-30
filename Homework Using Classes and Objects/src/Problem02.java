import java.util.Random;

public class Problem02 
{

	public static void main(String[] args) 
	{
		Random r=new Random();
		for (int i = 0; i < 10; i++) 
		{
			int randomNum =r.nextInt(200-100)+100;
			System.out.println(randomNum);
		}

	}

}

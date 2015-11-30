import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Problem03 
{

	public static void main(String[] args) 
	{
		LocalDateTime date=LocalDateTime.now();
		DayOfWeek dayOfWeek =date.getDayOfWeek();
		System.out.println(dayOfWeek);

	}

}

import java.util.Calendar;
import java.util.Locale;

public class FirstProblem {

	public static void main(String[] args) 
	{
		String name = "Pesho";
		int age= 18;
		System.out.print(name);
		System.out.println(age);
		System.out.println("\\n................");
		System.out.println(name);
		System.out.print(age);
		System.out.println();
		//Hi! My name is Pesho and
		//I am 18 years old
		//%d->decimal(int)
		//%f->float
		//%s->String
		System.out.printf("Hi! My name is %s and I am %d years old",name,age);
		System.out.println();
		//Gosho 19 Gosho Gosho
		System.out.printf("%s %d %s %s",name,age,name,name);
		System.out.println();
		//
		double f=Math.PI;
		double d = 1434.4213412;
		System.out.println(f);
		System.out.printf("%f",f);
		System.out.println();
		System.out.printf("%.3f",f);
		System.out.println();
		//3d ==3f
		System.out.printf("%10.3f",d);
		System.out.println();
		//get Calendar
		Calendar c = Calendar.getInstance();
		System.out.printf("%tB %te , %tY%n",c,c,c);
		System.out.println();
		System.out.format("%tB %te, %tY%n", c, c, c);
		System.out.format(Locale.forLanguageTag("BG"), "%tB %te, %tY%n", c, c, c);
		System.out.format(Locale.CHINA, "%tB %te, %tY%n", c, c, c);
		System.out.format("%tl:%tM %tp%n", c, c, c);
		System.out.format("%tD%n", c);
		
		
		
		
		
		

	}

}

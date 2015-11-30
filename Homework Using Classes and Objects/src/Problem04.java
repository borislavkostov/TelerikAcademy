
public class Problem04 
{

	public static void main(String[] args) 
	{
		double a=23.2;
		double h=5;
		TriangleSurfaceBySideAndaAltitude(a,h);
		//TriangleSurfaceByThreeSides(11,12,13);

	}
	static void TriangleSurfaceBySideAndaAltitude(double side,double altitude)
	{
		double surface =(side*altitude)/2;
		System.out.println(surface);
	}
	//static void TriangleSurfaceByThreeSides(double a,double b,double c)
	//{
		//double p=0.5/(a + b + c);
		//double surface=Math.pow((p*(p - a)*(p - b)*(p - c)), 2);
		//System.out.println(surface);
	//}

}

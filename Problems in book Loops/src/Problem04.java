
public class Problem04 
{

	public static void main(String[] args) 
	{
		String[] cards={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		String[] colors={"♠","♥","♦","♣"};
		int temp;
		for (int i = 0; i < cards.length; i++) 
		{
			for (int j = 0; j < colors.length; j++) 
			{
				System.out.print(colors[j]+" "+cards[i]);
				System.out.println();
			}
		}
	}

}

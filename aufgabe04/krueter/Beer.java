package a4;

public class Beer {

	public static void main(String[] args) {
		
		double money = Double.parseDouble(args[0]), beer = Double.parseDouble(args[1]);
		int count = 1;
		boolean check = true;
		
		while((money > beer) && check)
		{
			if(count == 1)
			{
				money -= beer;
			}
			else if(count > 1)
			{
				if(money > (beer * (count * count)))
				{
					money -= (beer * (count * count));
				}
				else
					check = false;
			}
			count++;
		}
		System.out.println("Ebenen: "+(count-1));
	}
}

package main;

public class Main {

	public static void main(String[] args) {

		double bonus = Double.parseDouble(args[0]);
		double price = Double.parseDouble(args[1]);
		boolean money = true;
		int ebene = 1;
		while(money)
		{
			double rest = bonus - (price * (double)(ebene*ebene));
			if(rest>=0)
			{
				bonus = rest;
				ebene++;
			}else
			{
				money = false;
			}
		}
		System.out.println("Ebenen: " + (ebene-1));
	}

}

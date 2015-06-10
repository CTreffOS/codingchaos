package cc;

public class BierPyramiede {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double preis = Double.parseDouble(args[1]);
		double bonus = Double.parseDouble(args[0]);
		int ebenen = 0;
		double current_bonus = 0;
		boolean flag = false;
		int result = 0;
		while(!flag){
			ebenen++;
			current_bonus = bonus;
			
			for(int i=ebenen;i>0;i--)
				current_bonus -= i*i*preis;

			if(!(current_bonus>=0)){
				result = ebenen-1;
				flag = true;
			}
		}
		
		System.out.println("Ergebnis ist " + result + " Ebenen.");
	}

}

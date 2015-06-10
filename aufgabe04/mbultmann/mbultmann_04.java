public class mbultmann_04 {
	public static void main(String[] args){
		double geld = Double.parseDouble(args[0]);
		double preis = Double.parseDouble(args[1]);
		int gesamtbier = (int) (geld/preis);
		int benutzeBier = 0;
		int ebene = 0;
		while(benutzeBier <= gesamtbier){
			benutzeBier += (int) Math.pow(ebene + 1,2);
			ebene++;
		}
		ebene--;
		benutzeBier -= (int) Math.pow(ebene + 1,2);	
    System.out.println(ebene);
	}
}

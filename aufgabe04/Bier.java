package aufgabe01;

public class Bier {

	public Bier() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bonus = 25.5;
		double preis = 1.2;
		double kostenSumme=0;
		int ebene = 1;
		
		while(true){
			
			if((kostenSumme + (ebene * ebene) *preis)<=bonus){
				kostenSumme +=(ebene * ebene) *preis;
				System.out.println(ebene);
				ebene++;
			}else{
				break;
			}
		}
		
		
		
	}

}

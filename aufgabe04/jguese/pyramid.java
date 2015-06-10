public class pyramid {

	public static void main(String[] args) {
		int layer = 0;
		int number = Integer.parseInt(args[0]);
		int startNr = number;
		System.out.println(pyramCalc(2));
		while(layer < number){
			pyramCalc(layer);
			layer++;
		}
		System.out.println(layer+" Ebenen mit "+pyramCalc(layer)+" Glaesern. "+(pyramCalc(layer)-startNr)+" bleiben ueber!");

	}
	private static int pyramCalc(int n){	
		return (2*n*n*n+3*n*n+n)/6;	
	}
}


package main;

public class Main {

	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		
		double w1 = Math.acos(-(c*c-a*a-b*b)/(2*a*b)) * 180 / Math.PI;
		double w2 = Math.acos(-(b*b-a*a-c*c)/(2*a*c)) * 180 / Math.PI;
		double w3 = Math.acos(-(a*a-b*b-c*c)/(2*b*c)) * 180 / Math.PI;
		
		if(w1==90 || w2==90 || w3==90) System.out.println("2");
		if(w1>90 || w2>90 || w3>90) System.out.println("3");
		if(w1<90 && w2<90 && w3<90) System.out.println("1");
		if(w1==180 || w2==180 || w3==180) System.out.println("0");
		
	}

}

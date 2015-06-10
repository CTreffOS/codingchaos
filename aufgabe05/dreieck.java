public class dreieck {

    private static boolean isAnySideTooShort(double a, double b, double c) {
        return a <= 0 || b <= 0 || c <= 0;
    }

    private static boolean violatesTriangleInequality(double a, double b, double c) {
        return a > b + c || b > a + c || c > a + b;
    }
    private static boolean hatRechtenWinkel(double a, double b, double c){
    	if(Math.asin(a/b)==90 || Math.asin(b/c)==90 || Math.asin(c/a)==90 ){
    		return true;
    	}
    	else return false;
    }
    private static boolean stumpfwinkliges(double a, double b, double c){
    	if(Math.asin(a/b)>90 || Math.asin(b/c)>90 || Math.asin(c/a)>90 ){
    		return true;
    	}
    	else return false;
    }
    private static boolean spitzwinkliges(double a, double b, double c){
    	if(Math.asin(a/b)<90 || Math.asin(b/c)<90 || Math.asin(c/a)<90 ){
    		return true;
    	}
    	else return false;
    }
    public static void main(String[] argv){
    	double a = Integer.parseInt(argv[0]);
    	double b = Integer.parseInt(argv[1]);
    	double c = Integer.parseInt(argv[2]);
    	
    	if(violatesTriangleInequality(a,b,c)||isAnySideTooShort(a,b,c)){
    		System.out.println("0");
    	}
    	else if(hatRechtenWinkel(a,b,c)){
    		System.out.println("2");
    	}
    	else if(stumpfwinkliges(a,b,c)){
    		System.out.println("3");
    	}
    	else if(spitzwinkliges(a,b,c)){
    		System.out.println("1");
    	}
    }
}

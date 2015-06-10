public class DreieckTypen{
    public static void main(String[] args){
        double a = Double.valueOf(args[0]);
        double b = Double.valueOf(args[1]);
        double c = Double.valueOf(args[2]);

        int res = 0;

        double cor = 180/ Math.PI;

        double y = Math.acos((-(c*c)+a*a+b*b)/(2*a*b))*cor;

        double al = Math.asin((a* Math.sin(y))/c)*cor;

        double bet = 180-y-al;

        System.out.println("Alpha: "+ al+ "Beta: "+bet+" Gamma: "+y);

        if(y < 90.0 || al < 90.0 || bet < 90.0){
            return 3;
        }


        if(y == 90.0 || al == 90.0 || bet == 90.0){
            return 1;
        }

        if(y > 90.0 || al > 90.0 || bet > 90.0){
            return 3;
        }

        return 0;

    }
}
import java.lang.Double;
import java.lang.System;

public class Bier{


    public static void main(String[] args){

        double bonus = Double.valueOf(args[0]);
        double bierPreis = Double.valueOf(args[1]);

        int anzBier = (int) (bonus / bierPreis);

        int anzEbenen = 0;
        int bierProEbene = 1;

        while(anzBier - bierProEbene >= 0){
            anzEbenen ++;
            anzBier -= bierProEbene;
            bierProEbene = anzEbenen*anzEbenen;

        }

        System.out.println("Anz Bierebenen: "+anzEbenen);

    }

}
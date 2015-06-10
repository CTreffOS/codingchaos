/******************************  Dreieck.java  ********************************/

import AlgoTools.IO;

/**
 * @version 10.06.15
 *  
 * @author nikrause
 */

public class Dreieck {

  public static void main(String[] argv) {
     double a = Double.parseDouble(argv[0]);
     double b = Double.parseDouble(argv[0]);
     double c = Double.parseDouble(argv[0]);
     double alpha = winkel(b,a,c);
     double beta = winkel(a,b,c);
     double gamma = winkel(b,c,a);
     
     if(a+b < c || a+c < b || b+c < a)
      IO.println(0);
     else if(alpha < 90.0 && beta < 90.0 && gamma < 90.0)
      IO.println(1);
     else if(alpha > 90.0 || beta > 90.0 || gamma > 90.0)
      IO.println(3);
     else if(alpha == 90.0 || beta == 90.0 || gamma == 90.0)
      IO.println(2);
     else
      IO.println();
     
  }

  public static double winkel(double a, double b, double c) {
    double cosinusBeta = (a * a + c * c - b * b) / (2 * a * c);
    double betaRad = Math.acos(cosinusBeta);
    return Math.toDegrees(betaRad);
  }
}


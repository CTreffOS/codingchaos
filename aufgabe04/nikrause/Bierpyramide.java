/******************************  Bierpyramide.java  ***************************/

import AlgoTools.IO;

/**
 * @version 10.06.15
 *  
 * @author nikrause
 */

public class Bierpyramide {

  public static void main(String[] argv) {
    double bonus = Double.parseDouble(argv[0]);
    double preis = Double.parseDouble(argv[1]);
    

    Double anzahl = bonus/preis;
    int anzBier = anzahl.intValue();

    int quadrat = 1;
    int ungerade = 1;
    int hoehe = 0;
    while(anzBier > quadrat) {
      anzBier = anzBier - quadrat;
      hoehe++;
      ungerade = ungerade + 2;
      IO.println(ungerade + " " + quadrat);
      quadrat = quadrat + ungerade;
    }

    IO.println(hoehe);
  }


}


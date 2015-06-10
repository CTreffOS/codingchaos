
package aufgabe4;

/**
 *
 * @author gitzzz
 */
public class Aufgabe4 {

    /**
     * @param args the command line arguments
     * 
     * 
Dabei braucht jede Ebene quadratisch
viele Biergläser. Also die obertse Ebene 1 Glas die zweite Ebene 2^2 also 4
Gläser, die dritte ebene 9 usw.


     * 
     * 
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 1;
        int level =1;
        
        float a = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[1]);

              
        
        int bier = Math.round(a/b);
        
        
        do {
            
            x+=1;
            bier=bier-(x*x);
            level++;
            System.out.println("x: "+x);
            System.out.println("bier: "+bier);
            System.out.println("Ebenen: "+level);
        }
        while (x<bier);
            
            
        System.out.println("Ebenen: "+level);
        
       
        
        
    }
    
}


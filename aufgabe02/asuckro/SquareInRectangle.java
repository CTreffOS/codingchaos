import java.util.ArrayList;
import java.util.List;

public class SquareInRectangle{
    public static void main(String[] args){
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        
        int area = a*b;
        
        List<Integer> rects = new ArrayList<Integer>();
        
        while (a > 0 && b > 0){
            if(a > b){
                area -= b*b;
                rects.add(b);
                a -= b;
            }
            else{
                area -= a*a;
                rects.add(a);
                b -= a;
            }
        }
        
        System.out.println(rects);
        
        
        
    }

}
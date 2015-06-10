public class aufgabe04 {
    public static void main(String[] args) {
        double cash = Double.parseDouble(args[0]);
        double price = Double.parseDouble(args[1]);

        int max = (int) (cash / price);
        int count = 0;
        int cur = 1;
        while(count < max) {
            count += Math.pow(cur, 2);
            cur++;
        }

        cur -= 2;
        System.out.println(cur);
    }
}

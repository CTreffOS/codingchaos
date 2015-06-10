public class aufgabe01 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

<<<<<<< HEAD
        if(num % 3 == 0)
            System.out.print("Fizz");

        if(num % 5 == 0)
            System.out.println("Buzz");

        System.out.println("\n");
=======
        for(int i = 1; i <= num; i++) {
            System.out.print(i + ": ");

            if(i % 3 == 0)
                System.out.println("Fizz");

            if(i % 5 == 0)
                System.out.println("Buzz");

            System.out.println();
        }
>>>>>>> 7820a91e8a75c754a12fc46b5ac0c692b2267a8f
    }
}

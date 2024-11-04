
import java.util.Random;

public class main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers.");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            Random rand = new Random();
            int result = rand.nextInt(100); 
            System.out.println("The result (feature): " + result);

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers.");
        }
    }
}

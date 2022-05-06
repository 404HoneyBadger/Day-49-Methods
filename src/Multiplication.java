import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: " );

        while(true) {
            int number = Integer.valueOf(scanner.nextInt());

            for (int i= 1; i < 11; i++) {
                System.out.println(number + " x " + i + " = " + number*i);

            }
        }


        
    }
    
}

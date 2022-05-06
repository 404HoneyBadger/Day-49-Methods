import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");

        while(true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                System.out.println("Process finished with exit code 0");
                break;
            }

             if (input < 0){
                System.out.println("Number must be positve");
                continue;
            }

            if (input > 0) {
                System.out.println("Number is " + input);
            }
        }
    }
}

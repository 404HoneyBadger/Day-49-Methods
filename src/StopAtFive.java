import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number==5) {
                break;
            }
        }
        System.out.print("Processed finished with exit code 0 ");

    }
}

import java.util.Scanner;

public class CountToEleven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number less than 11: ");

        while(true) {
            int number = Integer.valueOf(scanner.nextLine());

            for (int i= number; i <= 11; i++) {
                System.out.println(number++);
            }
        }
    }
}

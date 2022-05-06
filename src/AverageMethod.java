import java.util.Scanner;
public class AverageMethod {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double numOne = Double.valueOf(scanner.nextLine());
        
        System.out.println("Enter the next number:");
        double numTwo = Double.valueOf(scanner.nextLine());
        
        System.out.println("Enter the last number:");
        double numThree = Double.valueOf(scanner.nextLine());

        double sum = sumThree(numOne, numTwo, numThree);
        double average = averageThree(sum);
        
        System.out.println("The average is : " + average);
    }

    public static double sumThree(double num1, double num2, double num3){
        double sum = num1 + num2 + num3;
        return sum;
    }

    public static double averageThree(double sum){
        double average = sum/3;
        return average;
    }
}
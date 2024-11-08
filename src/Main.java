import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner input = new Scanner(System.in);
        int fstNumber = input.nextInt();
        System.out.println("Enter the second number");
        int secondNum = input.nextInt();
        int result = fstNumber + secondNum;
        System.out.println("the sum of two numbers are" +" "+ result);

    }
}
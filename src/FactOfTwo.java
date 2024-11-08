import java.util.Scanner;

public class FactOfTwo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which u want factorial");
        int num = sc.nextInt();
        long res = factorialOfNo(num);
        System.out.println("factorial is " + res);

    }
    public static long factorialOfNo(int num){
        if(num < 2){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while(i <= num){
            fact *= i;
            i++;
        }
        return fact;
    }
}

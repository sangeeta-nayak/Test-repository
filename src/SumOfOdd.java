import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int sum = sumOfOddNo(num);
        System.out.println(sum);

    }
    public static int sumOfOddNo(int num){
        int sum = 0;
        int i = 1;
        while(i <= num){
            sum += i;
            i += 2;
        }
        return sum;
    }
}

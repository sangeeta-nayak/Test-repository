import java.util.Scanner;

public class MultOfTwo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        printMultiplicationTable(num);
    }
    public static int printMultiplicationTable(int num){
        int i = 0;
        while(i <= 10){
            int finalRes = num*i;
            i++;
            System.out.println("final result is" + finalRes);
        }
        return 0;


    }
}

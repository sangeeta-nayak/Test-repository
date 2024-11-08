import java.util.Scanner;
public class ReturnPro {
    public static void main(String[]args){
        int firstNum = returnSum();
        int secondNum = returnSum();
        int sum = firstNum+secondNum;
        System.out.println(sum);

    }
    public static int returnSum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        return number;

    }
}

public class PrintPattern {
    public static void main(String[]args){
        printMyPtrn();
    }
    public static void printMyPtrn(){
        int rows = 0;
        while(rows<4){
            System.out.print("*");
            int i = 0;
            while(i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }

    }
}

import java.util.Scanner;
public class DoWhile1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        while(value!=5){
            System.out.println("enter 5");
            value=sc.nextInt();
        }
        System.out.println("your input is "+value);
    }
}

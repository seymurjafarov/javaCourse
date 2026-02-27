import java.util.Scanner;
public class DoWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value;
        do {
            System.out.println("enter 5");
            value = sc.nextInt();
        }while (value!=5);
    }
}

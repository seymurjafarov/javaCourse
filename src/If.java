import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int value = sc.nextInt();

        if (value >18) {
            System.out.println("18 yashdan kiciklere icaze yoxdur");
        } else if (value > 50) {
            System.out.println("50 yashdan yuxari da icaze yoxdur");
        } else {
            System.out.println("Buyurun");
        }

        main(args);
    }

}

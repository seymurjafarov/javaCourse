package arrays;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {


        String[] cars = new String[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < cars.length; i++) {

            String car = sc.nextLine();

            cars[i] = car;

        }

        System.out.println("Massiv doldu");


        for (String car1:cars
             ) {

            System.out.println(car1);

        }
        
    }
}

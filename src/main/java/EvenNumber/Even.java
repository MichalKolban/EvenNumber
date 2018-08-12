package EvenNumber;

import java.util.Scanner;

public class Even {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number here: ");

        try {

            int value = scanner.nextInt();

            boolean isEven = value % 2 == 0;

            if (isEven) {
                System.out.println(value + " it's an even number !");
            } else
                System.out.println("it isn't a even number !");
        }catch (Exception e){
            System.out.println("Sorry it isn't a number !");
        }

    }
}

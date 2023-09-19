package ChapterTwo;

import java.util.Scanner;

public class Arithemetrics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number:");
        int number1 = input.nextInt();

        System.out.print("Enter second number:");
        int number2 = input.nextInt();

        System.out.print("Enter third number:");
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        int average = (number1 + number2 + number3) / 3;
        int product = number1 * number2 * number3;

        System.out.println(sum);
        System.out.println(average);
        System.out.println(product);

        if (number1 < number2 && number1 < number3) {
            System.out.println("number1 is lesser");
        }
        if (number1 > number2 && number1 > number3) {
            System.out.println("number1 is greater");
        }

        if (number2 < number1 && number2 < number3) {
            System.out.println("number2 is lesser");
        }
    }
}
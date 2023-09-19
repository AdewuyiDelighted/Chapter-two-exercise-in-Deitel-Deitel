package ChapterTwo;

import java.util.Scanner;

public class Arithmetric {
    public static void main(String[] args) {
            Scanner square = new Scanner(System.in);

                System.out.print("Enter first Number:");
                int number1 = square.nextInt();

                System.out.print("Enter second Number:");
                int number2 = square.nextInt();

                int Result1 = number1 * number1;
                int Result2 = number2 * number2;
                int Sum = Result1 + Result2;
                int diff = Result1 - Result2;

                System.out.printf("The square of %d is %d%n", number1 , Result1 );
                System.out.printf("%d%s%d%n" , number2 , " square is " , Result2);
                System.out.printf("The sum of %d and %d is %d%n", Result1 , Result2, Sum);
                System.out.printf("The difference btw %d and %d is %d%n " ,Result1 , Result2,diff);

            }
        }



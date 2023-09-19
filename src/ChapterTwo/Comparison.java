package ChapterTwo;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {


            Scanner input = new Scanner(System.in);

            System.out.print("Enter First Number:");
            int firstNumber = input.nextInt();

            System.out.print("Enter Second Number:");
            int secondNumber = input.nextInt();

            System.out.print("Enter Third Number:");
            int thirdNumber = input.nextInt();

            System.out.print("Enter Fourth Number:");
            int fouthNumber = input.nextInt();

            System.out.print("Enter Fifth Number:");
            int fifthNumber = input.nextInt();


            if(firstNumber < secondNumber && firstNumber < thirdNumber && firstNumber < fouthNumber && firstNumber < fifthNumber){
                System.out.printf("%d%s%n", firstNumber ," is the smallest number");
            }
            else if(secondNumber < firstNumber && secondNumber < thirdNumber && secondNumber < fouthNumber && secondNumber < fifthNumber){
                System.out.printf("%d%s%n" , secondNumber ," is the smallest number");
            }


        }
}

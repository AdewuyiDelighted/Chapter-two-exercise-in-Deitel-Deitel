package ChapterTwo;

import java.util.Scanner;

public class DivisiableByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if(number%3 == 0) {
            System.out.println(number + " is divisible by three ");
        }
        else{
            System.out.println(number + " is not divisible by three");

            }
        }

    }


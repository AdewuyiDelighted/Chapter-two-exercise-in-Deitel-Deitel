package ChapterTwo;

import java.util.Scanner;

public class SeparatingDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        int digitOne = number /10000;
        int digitTwo = number /1000%10;
        int digitThree = number /100%10;
        int digitFour = number /10%10;
        int digitFive = number %10;

        System.out.printf(digitOne +"\t"+ digitTwo+"\t"+digitThree+"\t"+digitFour +"\t"+ digitFive+"\t");

    }
}

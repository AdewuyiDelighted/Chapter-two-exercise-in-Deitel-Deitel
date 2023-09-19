package ChapterTwo;

import java.util.Scanner;

public class BodyMass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("weight in pounds:");
        double weight = input.nextInt();

        System.out.print("height in inches:");
        double height = input.nextInt();

        double bmi = (weight * 703  ) / (height * height );

        System.out.printf("%s%f%n", "Body mass index " , bmi );



    }
}

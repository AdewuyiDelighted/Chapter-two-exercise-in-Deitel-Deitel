package ChapterTwo;

import java.util.Scanner;

public class PyramidOfGiza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter estimated number of stones used:");
        long numberOfStones = scanner.nextLong();

        System.out.print("Average weight of each stones:");
        double weightOfStones = scanner.nextDouble();

        System.out.print("Number of years used to build the pyramid:");
        int years = scanner.nextInt();

        double weightOfPyramid = numberOfStones * weightOfStones;
        double weightInOneYear = weightOfPyramid/31536000;
        double weightInOneHour = weightOfPyramid/3600;
        double weightInOneSecond = weightOfPyramid/60;

        System.out.printf("%s%f%n" , "weight of pyramid in one year " , weightInOneYear);
        System.out.printf("%s%f%n" , "weight of pyramid in one hour " , weightInOneHour);
        System.out.printf("%s%f%n" , "weight of Pyramid in one Second ", weightInOneSecond);




    }
}

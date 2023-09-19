package ChapterTwo;

import java.util.Scanner;

public class WorldPopulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Current World population:");
        long population;
        population = scanner.nextLong();

        System.out.print("Annual growth rate:");
        double growthRate;
        growthRate = scanner.nextDouble();

        System.out.print("Estimated year:");
        int year;
        year = scanner.nextInt();

        double worldPopulationYear =  population*(1 + growthRate/100);

        System.out.println(Math.pow(worldPopulationYear , year));

    }
}

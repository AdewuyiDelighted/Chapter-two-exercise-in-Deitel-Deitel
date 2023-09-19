package ChapterTwo;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of a circle:");
        int radius = scanner.nextInt();
        double pi = 3.14159;




        System.out.printf("%s%d%n" , "diameter is : " ,  2  * radius);
        System.out.printf("%s%f%n" , "circumferance : " , 2 * pi * radius);
        System.out.printf("%s%f%n" , "area : " ,(pi * radius)*(pi * radius));



    }
}

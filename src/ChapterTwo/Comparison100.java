package ChapterTwo;

import java.util.Scanner;

public class Comparison100 {
    public static void main(String[] args) {
        Scanner square = new Scanner(System.in);
        System.out.print("Enter one number:");
        int number = square.nextInt();

        if(number == 100 && number*number == 100){
            System.out.println(" is equal to 100" );
        }
        else if(number != 100 && number*number != 100){
            System.out.println( "number is not equal to 100 ");
        }
        if(number > 100 && number*number > 100){
            System.out.println("number is greater than 100");
        }
        if(number < 100 && number*number < 100){
            System.out.println("number is lesser than 100");
        }


    }
}

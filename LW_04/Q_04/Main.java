package LW_04.Q_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year you want to know if it is a leap year or not:");
        int year = scanner.nextInt();

        if (((year % 4) == 0) && !((year % 100) ==0)){
            System.out.printf("%d year is a leap year.",year);
        }else if((year % 4 ==0 ) && (year % 100 ==0 ) && (year % 400 ==0 )){
            System.out.printf("%d year is a leap year.",year);
        }else
            System.out.printf("%d is not a leap year.",year);
    }


}

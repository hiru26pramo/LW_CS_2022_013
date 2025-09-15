package LW_01;/*
Write a Java program to convert centimetres (input) to feet and inches (output). (1 inch
2.54 cm)
*/

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        double inches;
        double centi;
        int feet;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Centimeter: ");
        centi = scanner.nextDouble();

        inches = centi/2.54;
        feet =(int)inches/12 ;
        inches %= 12;

        System.out.printf("%.2f cm =  %d ft %.1f inches ",centi,feet,inches);





        scanner.close();
    }
}

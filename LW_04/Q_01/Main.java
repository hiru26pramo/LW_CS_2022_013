package LW_04.Q_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c,min;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number 1st : ");
        a = scanner.nextInt();
        System.out.print("Enter a number 2nd : ");
        b = scanner.nextInt();
        System.out.print("Enter a number 3rd : ");
        c = scanner.nextInt();
        scanner.close();


        min = a;

        if (min >  b && min < c)
            min = b;
        else if(min > c && min< b)
            min = c;


        System.out.printf("Minimum of these %d %d %d = %d",a,b,c,min);
    }
}

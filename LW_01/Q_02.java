package LW_01;/*
Write a program that asks the user for her or his full name in the format first middle
last and replies with the name in the format last, first middle-initial. where the last
name is followed by a comma and the middle initial is followed by a period. For
example, if the input is Antony Edward Stark then the output is Stark, Antony E.
 */


import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        String firstName,lastName,middleName;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your First Name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter your Middle Name: ");
        middleName = scanner.nextLine();

        System.out.print("Enter your Last Name: ");
        lastName = scanner.nextLine();

        //capitalizing first letter of names when  user gives any case of letter
     String firstNameUpper= firstName.toUpperCase().charAt(0)+firstName.substring(1);
     String lastNameUpper= lastName.toUpperCase().charAt(0)+lastName.substring(1);

        System.out.printf("%s, %s %s \n",lastNameUpper,firstNameUpper,middleName.toUpperCase().charAt(0));

        scanner.close();
    }
}

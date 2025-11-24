package LW_02;

import java.util.Scanner;

public class Q_02 {
     int  num;
    boolean isPositive = true;
    public  int  ShowNumberOfDigits(){
        System.out.print("Enter an integer number: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if(num <0){
            isPositive = false;
            return 0;
        }

        return String.valueOf(num).length();
    }

    public static void main(String[] args) {
        Q_02 numbers = new Q_02();

        int currentNumber;
        do{
            currentNumber =numbers.ShowNumberOfDigits();
            if(currentNumber > 0){
                System.out.println(currentNumber);
            }

        }while (!(numbers.isPositive != true));

    }
}

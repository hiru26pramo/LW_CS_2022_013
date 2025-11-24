package LW_02;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row = scanner.nextInt();

        System.out.println();
        for (int i=1;i<=row; i++ ){
            for (int j = row-i; j>0; j--){
                System.out.print(" ");
            }
            for (int j = 0 ; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

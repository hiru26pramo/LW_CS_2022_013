package LW_02;

import java.util.Arrays;
import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        int [] arr = new  int[5];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0 ; i<5 ; i++){
            System.out.print("Enter a number : ");
            arr[i]=scanner.nextInt();
        }

        //sorting array
        Arrays.sort(arr);

        //print 4th index
        System.out.printf("/nSecond largest element : %d",arr[3]);



    }

}

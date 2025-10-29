package LW_04.Q_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String num = "";
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value which power of 10 : ");
        int val = scanner.nextInt();
        
        switch (val){
            case 6:
                num = "Million";
                break;
            case 9:
                num = "Billion";
                break;
            case 12:
                num = "Trillion";
                break;
            case 15:
                num = "Quadrillion";
                break;
            case 18:
                num = "Quintillion";
                break;
            case 21:
                num = "Sextillion";
                break;
            case 30:
                num = "Nonillion";
                break;
            case 100:
                num = "Googol";
                break;
            default:
                System.out.println("Unknown");
        }
        System.out.printf("10 to the power %d = %s",val,num);
    }

}

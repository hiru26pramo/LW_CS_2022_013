package LW_01;/*1. Write a program that accepts an odd-length word and prints out the middle character.
For example, if the input is magnificent, which has 11 characters, you output the sixth
character f.
*/

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter odd-length word:  ");
        String word = scanner.nextLine();

        if (word.length() %2 == 0){
            System.out.println("Not a odd-length word which you entered.");
        }else{
            int lengthOfWord = word.trim().length()/2;
            System.out.printf("The middle character of word: %c",word.charAt(lengthOfWord));
        }

        scanner.close();
    }
}
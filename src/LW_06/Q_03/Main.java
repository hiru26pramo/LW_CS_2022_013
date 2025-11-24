package LW_06.Q_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        while (true){

            System.out.print("Enter your pet name(enter 'STOP' for stopping) : ");
            name = scanner.nextLine();


            if(name.equalsIgnoreCase("STOP")){
                break;
            }else if(name.equals("")){
                continue;
            }
            else{
                System.out.print("Enter type of the pet('c' for Cat & 'd' for Dog) : ");
                char type = scanner.next().charAt(0);
                scanner.nextLine();
                if(type == 'c')
                    pets.add(new Cat(name));
                else if(type == 'd')
                    pets.add(new Dog(name));
                else
                    System.out.println("Invalid type.");
            }

        }


        System.out.println("\nCat's List");
        for (Pet pet : pets){
            if (pet.petType().equalsIgnoreCase("cat")){
                System.out.println(pet.getName());
            }
        }

        System.out.println("\nDog's List");
        for (Pet pet : pets){
            if (pet.petType().equalsIgnoreCase("dog")){
                System.out.println(pet.getName());
            }
        }

        scanner.close();
    }
}

package LW_06.Q_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        String coatColor;
        double weight;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        while (true){

            System.out.print("Enter your pet name(enter 'STOP' for stopping) : ");
            name = scanner.nextLine();


            if(name.equalsIgnoreCase("STOP")){
                break;
            }else if(name.isEmpty()){
                continue;
            }
            else{
                System.out.print("Enter type of the pet('c' for Cat & 'd' for Dog) : ");
                char type = scanner.next().charAt(0);
                scanner.nextLine();
                if(type == 'c'){
                    System.out.print("Enter coat color : ");
                    coatColor = scanner.nextLine();
                    pets.add(new Cat(name,coatColor));


                }


                else if(type == 'd'){
                    System.out.print("Enter Weight : ");
                    weight = scanner.nextDouble();
                    scanner.nextLine();
                    pets.add(new Dog(name,weight));
                }

                else
                    System.out.println("Invalid type.");
            }

        }


        System.out.println("----Cat----");
        for (Pet pet : pets){
            if (pet.getType() == 'c'){
                Cat cat = (Cat)pet;
                System.out.println("Name \t Type \t Coat color \n");
                System.out.printf("%-10s \t %c \t %s\n",pet.getName(),pet.getType(),cat.getCoatColor());
            }
        }

        System.out.println("-----Dogs-----");
        for (Pet pet : pets){
            if (pet.getType() == 'd'){
                Dog dog = (Dog)pet;
                System.out.println("Name \t Type \t Weight \n");
                System.out.printf("%-10s \t %c \t %.2f\n",pet.getName(),pet.getType(),dog.getWeight());
            }
        }
        scanner.close();
    }
}


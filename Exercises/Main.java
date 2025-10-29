package Exercises;

public class Main {
    public static void main(String[] args) {
        Cat myPet = new Cat();
        myPet.setName("Cha Cha");
        System.out.println("Hi, I am " + myPet.getName());
        System.out.println(myPet.speak());
    }
}

package LW_03.Q_03;

public class Main {
    public static void main(String[] args) {
        // Bicycle with default owner
        Bicycle bicycle1 = new Bicycle();
        System.out.println("Bike1 owner : " + bicycle1.getOwnerName() + ", Phone No : " + bicycle1.getPhoneNo());

        //Bicycle with specified owner
        Bicycle bicycle2 = new Bicycle("Hirusha","0766574500");
        System.out.println("Bike2 owner : " + bicycle2.getOwnerName() + ", Phone No : " + bicycle2.getPhoneNo());

        // Update owner later
        Owner newOwner = new Owner("Pramod","0785821369");
        bicycle1.setOwner(newOwner);
        System.out.println("Updated Bike1 owner : " + bicycle1.getOwnerName() + ", Phone No : " + bicycle1.getPhoneNo());

    }
}

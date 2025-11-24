package src.LW_01;

import java.util.Scanner;

public class Q_05 {

    public static class Circle{
         private  double radius;
        Circle(double radius){
            if(radius>=0){
                this.radius = radius;
            }else {
                System.err.println("Warning: Radius can not be negative.Setting to 0. ");
                this.radius = 0;
            }
        }

        public double computeArea(){
            return Math.PI*(Math.pow(radius,2));
        }

        public double computeCircumference(){
            return 2 * Math.PI * radius;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the inner Radius (cm) : ");
        double innerRadius= scanner.nextDouble();

        System.out.print("Enter the outer Radius (cm) : ");
        double outerRadius = scanner.nextDouble();

//        if(innerRadius<0 || outerRadius<0){
//            System.err.println("Error: Radius can not be negative.");
//            return;
//        }
        if(innerRadius>outerRadius){
            System.err.println("Error: The inner Radius must be  grater than the outer Radius.");
            return;
        }

        Circle innerCircle = new Circle(innerRadius);
        Circle outerCircle = new Circle(outerRadius);

        double shadedArea = outerCircle.computeArea() -innerCircle.computeArea();

        System.out.printf("%n<<<<<<<<<<<<<<<Calculation Result >>>>>>>>>>>>>>>>>>%n");
        System.out.printf("\t\t\t\tShaded Area = %.2fcm² " , shadedArea);
        System.out.printf("%n<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>%n");
    }
}

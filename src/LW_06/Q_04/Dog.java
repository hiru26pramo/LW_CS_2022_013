package LW_06.Q_04;


public class Dog extends Pet {
    private double weight;

    public Dog(String name,double weight) {
        super(name,'d');
        this.weight = weight;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
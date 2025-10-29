package LW_06.Q_02;

public class Dog extends Pet{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String petType(){
        return "Dog";
    }
}

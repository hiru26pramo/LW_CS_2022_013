package LW_06.Q_02;

public class Cat extends Pet{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String petType() {
        return "Cat";
    }
}

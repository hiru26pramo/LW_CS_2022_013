package LW_05.Q_02;

public abstract class Person {
    private String name;

    //constructor
    public Person(String name) {
        this.name = name;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

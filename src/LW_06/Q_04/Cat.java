package LW_06.Q_04;

public class Cat extends Pet {
    private String coatColor;

    public Cat(String name,String coatColor) {
        super(name,'c');
        this.coatColor = coatColor;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }
}



package Zadachnik;

public class Human {
    private Name name;
    private int height;

    public Human(Name name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return name + ", рост: " + height;
    }
}

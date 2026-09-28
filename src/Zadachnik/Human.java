package Zadachnik;

public class Human {
    static private final int UNKNOWN_HEIGHT = -1;

    private Name name;
    private int height;
    private Human father;

    public Human(Name name, int height) {
        this.name = name;
        this.height = height;
    }

    public Human(Name name) {
        this(name, UNKNOWN_HEIGHT);
    }

    public void setFather(Human father) {
        if (father != null && !name.hasMiddleName()) {
            name.setMiddleName(father.name.getFirstName() + "ович");
        }
        this.father = father;
    }

    @Override
    public String toString() {
        return name.toString();
    }
}

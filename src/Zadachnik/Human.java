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

    public Human(String firstName) {
        this(new Name("", firstName, ""));
    }

    public Human(Name name, Human father) {
        this(name);
        setMiddleNameByFather(father);
    }

    public Human(String firstName, Human father) {
        this(new Name("", firstName, ""));
        setMiddleNameByFather(father);
    }

    public void setFather(Human father) {
        this.father = father;
        setMiddleNameByFather(father);
    }

    private void setMiddleNameByFather(Human father) {
        if (father != null && !name.hasMiddleName()) {
            name.setMiddleName(father.name.getFirstName() + "ович");
        }
    }

    @Override
    public String toString() {
        return name.toString();
    }
}

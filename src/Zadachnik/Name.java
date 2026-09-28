package Zadachnik;

public class Name {
    private String lastName;
    private String firstName;
    private String middleName;

    public Name(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public boolean hasMiddleName() {
        return !middleName.isBlank();
    }

    @Override
    public String toString() {
        String res = "";

        if (!lastName.isBlank()) {
            res += lastName;
        }

        if (!firstName.isBlank()) {
            res += " " + firstName;
        }

        if (!middleName.isBlank()) {
            res += " " + middleName;
        }

        return res.trim();
    }
}

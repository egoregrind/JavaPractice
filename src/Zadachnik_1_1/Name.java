package Zadachnik_1_1;

public class Name {
    private String lastName;
    private String firstName;
    private String middleName;

    public Name(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        String res = "";

        if (!lastName.isEmpty()) {
            res += lastName;
        }

        if (!firstName.isEmpty()) {
            res += " " + firstName;
        }

        if (!middleName.isEmpty()) {
            res += " " + middleName;
        }

        return res.trim();
    }
}

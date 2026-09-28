package Zadachnik;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;

        department.addEmployee(this);
        this.department = department;
    }

    public Employee(String name) {
        this(name, null);
    }

    @Override
    public String toString() {
        String res = name;
        if (department != null) {
            if (department.getBoss() == this) {
                res += " начальник отдела ";
            } else {
                res += " работает в отделе ";
            }
            res += department.getTitle();
        } else {
            res += " нигде не работает";
        }

        return res;
    }
}

package Zadachnik;

import java.util.ArrayList;
import java.util.List;

public class Department {
    static private final String UNKNOWN_DEPARTMENT_TITLE = "Неизвестный отдел";

    private String title;
    private Employee boss;
    private List<Employee> employees;

    public Department(String title) {
        if (title == null || title.isBlank()) {
            title = UNKNOWN_DEPARTMENT_TITLE;
        }
        this.title = title;
        this.employees = new ArrayList<>();
    }

    public String getTitle() {
        if (title == null || title.isBlank()) {
            title = UNKNOWN_DEPARTMENT_TITLE;
        }
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
    }

    public void addEmployee(Employee employee) {
        if (employee == null) {
            throw new IllegalArgumentException("Сотрудник не указан при попытке добавления в департамент");
        }
        this.employees.addLast(employee);
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }
}

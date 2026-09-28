package Zadachnik;

public class Department {
    static private final String UNKNOWN_DEPARTMENT_TITLE = "Неизвестный отдел";

    private String title;
    private Employee boss;

    public Department(String title) {
        if (title == null || title.isBlank()) {
            title = UNKNOWN_DEPARTMENT_TITLE;
        }
        this.title = title;
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
}

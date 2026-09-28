package Zadachnik;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = new ArrayList<>();

        validateGrades(grades);
        this.grades = new ArrayList<>(grades);
    }

    public Student(String name, Integer... grades) {
        this(name, List.of(grades));
    }

    public List<Integer> getGrades() {
        return List.copyOf(grades);
    }

    public void setGrades(List<Integer> grades) {
        validateGrades(grades);
        this.grades = new ArrayList<>(grades);
    }

    public void setGrade(int idx, Integer grade) {
        validateGrade(grade);

        grades.set(idx, grade);
    }

    private void validateGrades(List<Integer> grades) {
        if (grades == null) {
            throw new IllegalArgumentException("Список оценок null");
        }

        for (Integer grade : grades) {
            validateGrade(grade);
        }
    }

    private void validateGrade(Integer grade) {
        if (grade == null || grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка должна быть от 2 до 5");
        }
    }

    @Override
    public String toString() {
        return name + ": " + grades;
    }
}

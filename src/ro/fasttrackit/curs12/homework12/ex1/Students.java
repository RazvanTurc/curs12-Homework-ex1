package ro.fasttrackit.curs12.homework12.ex1;

import java.util.Objects;

public class Students {
    private final String name;
    private final int grade;

    public Students(String name, int grade) {
        this.name = Objects.requireNonNullElse(name,"N/A");
        this.grade = grade <= 10 && grade >= 1 ? grade : 5;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students that = (Students) o;
        return grade == that.grade && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }

    @Override
    public String toString() {
        return "Student: " + name + "\n" +
                "Grade: " + grade;
    }
}

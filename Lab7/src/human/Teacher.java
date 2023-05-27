package human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teacher extends Human {
    private int numberOfStudents;
    private String university;
    private List<Human> children = new ArrayList<>();

    public Teacher(String name, int age, int numberOfStudents) {
        super();
        this.name = name;
        this.age = age;
        this.numberOfStudents = numberOfStudents;
    }

    public Teacher(java.lang.String vasya, int age, int numberOfStudents) {
    }


    public void live() {
        teach();
    }

    public void teach() {
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void printData() {
        System.out.println("Преподаватель: " + name);
    }

    public human.List<Human> getChildren() {
        return (human.List<Human>) Collections.unmodifiableList(children);
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }
}

import human.Human;
import human.List;
import human.Student;
import human.Teacher;

import static java.lang.Character.getName;


public class Main {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setName("Dad");
        h1.setAge(15);
        h1.setBloodGroup(0);

        Human h2 = new Human();
        h2.setName("child");
        h2.setAge(20);
        h2.setBloodGroup(0);

        Human h3 = new Human();
        h2.setName("child2");
        h2.setAge(20);
        h2.setBloodGroup(0);

        Human h4 = new Human();
        h2.setName("child3");
        h2.setAge(20);
        h2.setBloodGroup(0);

        h1.addChild(h2);
        h1.addChild(h3);

        Student s1 = new Student("Bill", 20, 3.5);
        s1.addChild(h3);
        s1.addChild(h4);

        Teacher t1 = new Teacher("Vasya", 56, 100);


    }
}
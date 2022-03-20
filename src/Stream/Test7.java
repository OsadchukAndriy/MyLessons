package Stream;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.4);
        Student st2 = new Student("Masha", 'f', 19, 2, 6.6);
        Student st3 = new Student("Andrii", 'm', 16, 1, 9.3);
        Student st4 = new Student("Taras", 'm', 19, 2, 8.8);
        Student st5 = new Student("Inna", 'f', 26, 6, 7.7);


        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");

        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<Faculty>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(f -> f.getStudentOnFaculty().stream())
                .forEach(e -> System.out.println(e.getName()));




    }
}

class Faculty {
    String name;
    List<Student> studentOnFaculty;

    public List<Student> getStudentOnFaculty() {
        return studentOnFaculty;
    }

    public Faculty(String name) {
        this.name = name;
        studentOnFaculty = new ArrayList<>();
    }

    public void addStudentToFaculty(Student st){
        studentOnFaculty.add(st);
    }

}
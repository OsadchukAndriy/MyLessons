package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.4);
        Student st2 = new Student("Masha", 'f', 19, 2, 6.6);
        Student st3 = new Student("Andrii", 'm', 16, 1, 9.3);
        Student st4 = new Student("Taras", 'm', 19, 2, 8.8);
        Student st5 = new Student("Inna", 'f', 26, 6, 7.7);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);


//        students.stream().map(e ->
//                {
//                    e.setName(e.getName().toUpperCase());
//                    return e;
//                })
//                .filter(e -> e.getSex() == 'f')
//                .sorted((x, y) -> x.getAge() - y.getAge())
//                .forEach(e -> System.out.println(e));

        Student first = students.stream().map(e ->
                {
                    e.setName(e.getName().toUpperCase());
                    return e;
                })
                .filter(e -> e.getSex() == 'f')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .findFirst().get();
        System.out.println(first);


//       students = students.stream().filter(e -> e.getAge() > 17 && e.getAvgGrade() < 7.2 ).collect(Collectors.toList());
//        System.out.println(students);

//        List<Student> list4 = students.stream().sorted(
//                (a, e) -> a.getName().compareTo(e.getName()) ).collect(Collectors.toList());
//        System.out.println(list4);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

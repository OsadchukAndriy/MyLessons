package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {
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

//        Student min = students.stream().min((e,s) -> e.getAge() - s.getAge()).get();
//        System.out.println(min);
//        Student max = students.stream().max((e,s) -> e.getAge() - s.getAge()).get();
//        System.out.println(max);


//        students.stream().filter(e -> e.getAge()> 18).forEach(System.out::println);
//        System.out.println("____________________________");
//        students.stream().filter(e -> e.getAge()> 18).limit(2).forEach(System.out::println);
//        System.out.println("____________________________");
//        students.stream().filter(e -> e.getAge()> 18).skip(2).forEach(System.out::println);

//        List<Integer> lis = students.stream().mapToInt(e -> e.getCourse())
//                .boxed()
//                .collect(Collectors.toList());
//        System.out.println(lis);

        int sum = students.stream().mapToInt(e -> e.getCourse()).sum();
        System.out.println(sum);

        double aver = students.stream().mapToInt(e -> e.getCourse()).average().getAsDouble();
        System.out.println(aver);

        int min  = students.stream().mapToInt(e -> e.getCourse()).min().getAsInt();
        System.out.println(min);

        int max  = students.stream().mapToInt(e -> e.getCourse()).max().getAsInt();
        System.out.println(max);
    }
}

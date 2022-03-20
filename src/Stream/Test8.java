package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
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

//        Map<Integer, List<Student>> map =students.stream().map(e -> {
//                    e.setName(e.getName().toUpperCase());
//                    return e;
//                })
//                .collect(Collectors.groupingBy(e -> e.getCourse()));
//
////        System.out.println(map);
//        for (Map.Entry<Integer, List<Student>> entry: map.entrySet() ){
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//    }
        Map<Boolean, List<Student>> map = students.stream()
                .collect(Collectors.partitioningBy(e -> e.getAvgGrade()> 7));

//        System.out.println(map);
        for (Map.Entry<Boolean, List<Student>> entry: map.entrySet() ){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

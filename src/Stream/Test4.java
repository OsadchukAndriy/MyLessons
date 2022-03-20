package Stream;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce(1,(a, e) -> a * e);
        System.out.println(result);

        List<String> list2 = new ArrayList<>();
        list2.add("privet");
        list2.add("kak dela?");
        list2.add("Ok");
        list2.add("poka");

        String result2 = list2.stream().reduce((a, e) -> a + " " + e).get();
        System.out.println(result2);
    }
}

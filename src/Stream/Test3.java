package Stream;


import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(e -> System.out.println(e));
        Arrays.stream(array).forEach(Utils::MyMethod);
    }
}

class Utils {
    public static void MyMethod(int a) {
        a = a + 5;
        System.out.println("Element = " + a);

    }
}

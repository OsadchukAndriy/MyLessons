package Generics;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Privet", 6);
        System.out.println("Snachenie value1 = " + pair.getFirstValue()
                + " value2 = " + pair.getSecondValue());
    }

}
class Pair<V1, V2>{
    private  V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue(){
        return value1;
    }

    public V2 getSecondValue(){
        return value2;
    }
}
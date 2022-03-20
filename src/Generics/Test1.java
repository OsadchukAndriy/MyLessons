package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("og");
//        list.add(5);

        list.add("privet");
        list.add("poka");
        list.add("ok");
        list.add("dfdfdffgdfgd");

        for(String s : list){
            System.out.println(s + "dlina " + ((String)s).length() );

        }


    }
}

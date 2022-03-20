package Generics;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<Integer>();
        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.1);
        list1.add(3.15);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("3.14");
        list2.add("3.1");
        list2.add("3.15");
        showListInfo(list2);
    }
    static void showListInfo (List<?> list){
        System.out.println("My list - " + list);
    }
}

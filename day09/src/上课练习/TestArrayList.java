package 上课练习;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();


        //add()
        al.add("a");
        al.add("b");
        al.add("c");
        System.out.println(al);

        al.add(3,"d");
        System.out.println(al);

        //remove()
//        System.out.println(al.remove("a"));
//        System.out.println(al.remove(0));

        //set()
//        System.out.println(al.set(0,"d"));
//        System.out.println(al);

        //get()
        System.out.println(al.get(0));

        System.out.println(al.size());
    }
}

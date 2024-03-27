package ru.bikbaev.sem4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<String> userName = new ArrayList<>() {{
            add("Вера");
            add("Света");
            add("Анна");
            add("Миша");
            add("Слава");
            add("Ростя");
            add("Костя");
        }};

        System.out.println(userName);

//        userName.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });

//        userName.sort((e1,e2)->e1.compareTo(e2));
//        userName.sort(String::compareTo);

        Collections.sort(userName);


        System.out.println(userName);

        userName.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        });

//        userName.sort((e1,e2)->e1.length()-e2.length());
//        userName.sort(Comparator.comparingInt(String::length));

        System.out.println(userName);

        Collections.reverse(userName);

        System.out.println(userName);


    }
}




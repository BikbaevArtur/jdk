package ru.bikbaev.sem4;

import java.util.*;


public class Main2 {
    public static void main(String[] args) {
        List<String> userName = new ArrayList<>() {{
            add("Вера");
            add("Света");
            add("Анна");
            add("Миша");
            add("Слава");
            add("Аалешка");
            add("Костя");
            add("Костя");
            add("Артур");
            add("Артур");
        }};

        Set<String> strings = new HashSet<>(userName);
        System.out.println(strings.stream().min(Comparator.naturalOrder()));
        System.out.println(strings.stream().max((e1,e2)->e1.length()-e2.length()));


        System.out.println(strings.stream().filter(e1->!e1.contains("А")).toList());
    }
}

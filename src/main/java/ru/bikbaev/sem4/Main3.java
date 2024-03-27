package ru.bikbaev.sem4;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>(){{
            put("10","Сергей");
            put("2","Андрей");
            put("3","Мишель");
            put("4","Яими");
            put("5","Коша");
            put("6","Картоша");
        }};

        System.out.println(map.entrySet().stream().min((o1, o2) -> Integer.parseInt(o1.getKey()) - Integer.parseInt(o2.getKey()))
                .orElse(null).getValue());
        System.out.println(map.entrySet().stream().max((o1, o2) -> o1.getValue().length() - o2.getValue().length())
                .orElse(null).getKey());
        System.out.println(map.entrySet().stream().max((o1, o2) -> o1.getValue().compareTo(o2.getValue()))
                .orElse(null)
                .getKey());

    }
}

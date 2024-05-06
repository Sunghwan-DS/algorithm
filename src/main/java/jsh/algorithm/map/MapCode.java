package jsh.algorithm.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCode {

    public static void main(String[] args) {
        unionMap();
    }

    private static void hashMapEx() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("ab", 2);

        var entrySet = map.entrySet();
        System.out.println(entrySet);

        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }

        for (String key : map.keySet()) {
            System.out.println("key: " + key);
        }
    }

    private static void treeMapEx() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("ab", 1);
        map.put("a", 2);

        var entrySet = map.entrySet();
        System.out.println(entrySet);
    }

    private static void linkedHashMapEx() {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("b", 1);
        map.put("c", 2);
        map.put("a", 3);

        var entrySet = map.entrySet();
        System.out.println(entrySet);
    }

    private static void unionMap() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        map1.put("a", 1);
        map1.put("c", 3);
        map2.put("b", 2);
        map2.put("c", 4);

        map1.putAll(map2);
        System.out.println(map1);
    }
}

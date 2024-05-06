package jsh.algorithm.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCode {

    public static void main(String[] args) {
        hashMapEx();
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
}

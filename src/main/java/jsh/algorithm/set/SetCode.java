package jsh.algorithm.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCode {

    public static void main(String[] args) {
        intersectionSet();
    }

    private static void hashSetEx() {
        Set<String> set = new HashSet<>();
        set.add("b");
        set.add("c");
        set.add("a");

        System.out.println(set);

        for (String elem : set) {
            System.out.println("elem: " + elem);
        }
    }

    private static void treeSetEx() {
        Set<String> asceSet = new TreeSet<>();
        asceSet.add("bbb");
        asceSet.add("aaa");
        asceSet.add("ccc");

        Set<String> descSet = new TreeSet<>(Collections.reverseOrder());
        descSet.add("bbb");
        descSet.add("aaa");
        descSet.add("ccc");

        System.out.println("asceSet: " + asceSet);
        System.out.println("descSet: " + descSet);
    }

    private static void linkedHashSetEx() {
        Set<String> set = new LinkedHashSet<>();
        set.add("b");
        set.add("c");
        set.add("a");

        System.out.println("linkedHashSet: " + set);
    }

    private static void unionSet() {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("a");
        set1.add("c");

        set2.add("b");
        set2.add("c");

        set1.addAll(set2);
        System.out.println(set1);
    }

    private static void differenceSet() {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("a");
        set1.add("c");

        set2.add("b");
        set2.add("c");

        set1.removeAll(set2);
        System.out.println(set1);
    }

    private static void intersectionSet() {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("a");
        set1.add("c");

        set2.add("b");
        set2.add("c");

        set1.retainAll(set2);
        System.out.println(set1);
    }
}

package jsh.algorithm.linkedlist;

import java.util.LinkedList;

public class LibraryLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            linkedList.add(i);
        }
        System.out.println(linkedList);

        linkedList.addFirst(0);
        System.out.println(linkedList);

        var elem = linkedList.element();
        System.out.println("elem: " + elem);

        System.out.println("index 3: " + linkedList.get(3));
        var peek = linkedList.peek();

        System.out.println(peek);
        System.out.println(linkedList.toString());

        var pop = linkedList.pop();
        System.out.println("맨 앞 꺼내기 pop: " + pop);
        System.out.println(linkedList.toString());

        var poll = linkedList.poll();
        System.out.println("맨 앞 꺼내기 poll: " + poll);
        System.out.println(linkedList.toString());

        var pollLast = linkedList.pollLast();
        System.out.println("맨 뒤 꺼내기 pollLast: " + pollLast);
        System.out.println(linkedList.toString());
    }
}

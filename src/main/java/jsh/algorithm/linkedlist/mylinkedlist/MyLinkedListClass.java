package jsh.algorithm.linkedlist.mylinkedlist;

public class MyLinkedListClass {

    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        for (int i = 1; i <= 5; i++) {
            linkedList.add(i);
        }
        System.out.println(linkedList.toString());
    }
}

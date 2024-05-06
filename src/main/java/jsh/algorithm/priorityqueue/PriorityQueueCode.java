package jsh.algorithm.priorityqueue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCode {

    public static void main(String[] args) {
        customComparatorEx();
    }

    private static void minHeapEx() {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(3);
        minHeap.add(2);
        minHeap.add(1);

        System.out.println(minHeap);
        while (!minHeap.isEmpty()) {
            var elem = minHeap.poll();
            System.out.println("elem: " + elem);
        }
    }

    private static void maxHeapEx() {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(1);
        maxHeap.add(2);
        maxHeap.add(3);

        System.out.println(maxHeap);
        while (!maxHeap.isEmpty()) {
            var elem = maxHeap.poll();
            System.out.println("elem: " + elem);
        }
    }

    private static void customComparatorEx() {
        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] arr1, int[] arr2) {
                return Integer.compare(arr1[1], arr2[1]);
            }
        };

        PriorityQueue<int[]> customQueue = new PriorityQueue<>(comparator);
        customQueue.add(new int[]{1, 3});
        customQueue.add(new int[]{2, 2});
        customQueue.add(new int[]{3, 1});

        while(!customQueue.isEmpty()) {
            int[] elem = customQueue.poll();
            System.out.println("elem: " + Arrays.toString(elem));
        }
    }
}

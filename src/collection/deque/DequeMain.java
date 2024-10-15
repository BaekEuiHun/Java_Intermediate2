package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerLast(3);
        System.out.println(deque);

        deque.pollFirst();
        deque.pollFirst();
        deque.pollLast();
        System.out.println(deque);
    }
}

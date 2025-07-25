package Leetcode75;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    public Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
        return;
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }

}

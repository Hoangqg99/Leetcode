package Leetcode75;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Keys_and_Rooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new java.util.HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        visited.add(0);
        while (!queue.isEmpty()) {
            int roomIndex = queue.poll();
            for (int key : rooms.get(roomIndex)) {
                if (!visited.contains(rooms.get(roomIndex)))
                    queue.offer(key);
                visited.add(key);
            }
        }
        return visited.size() == rooms.size();

    }

    public static void main(String[] args) {
        Keys_and_Rooms solution = new Keys_and_Rooms();
        List<List<Integer>> rooms = Arrays.asList(
                Arrays.asList(1), // Room 0 has key to Room 1
                Arrays.asList(2), // Room 1 has key to Room 2
                Arrays.asList(3), // Room 2 has key to Room 3
                Arrays.asList() // Room 3 has no keys
        );
        boolean result = solution.canVisitAllRooms(rooms);
        System.out.println(result); // Output: true
    }
}

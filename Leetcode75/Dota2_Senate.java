package Leetcode75;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2_Senate {
    public Queue<Integer> Radiant;
    public Queue<Integer> Dire;

    public String predictPartyVictory(String senate) {
        Radiant = new LinkedList<>();
        Dire = new LinkedList<>();

        int n = senate.length();
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                Radiant.add(i);
            } else {
                Dire.add(i);
            }
        }
        while (!Radiant.isEmpty() && !Dire.isEmpty()) {
            int rIndex = Radiant.poll();
            int dIndex = Dire.poll();
            if (rIndex > dIndex) {
                Dire.add(dIndex + n);
            } else {
                Radiant.add(rIndex + n);
            }
        }
        return Dire.isEmpty() ? "Dire" : "Radiant";
    }

    public static void main(String[] args) {
        Dota2_Senate solution = new Dota2_Senate();
        String s = "RD";
        String resulString = solution.predictPartyVictory(s);
        System.out.println(resulString);
    }

}

package Leetcode75;

public class largestAltitude {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0, currAltitude = 0;
        for (int i = 0; i < gain.length; i++) {
            currAltitude += gain[i];
            maxAltitude = Math.max(maxAltitude, currAltitude);
        }
        return maxAltitude;
    }

    public static void main(String[] args) {
        largestAltitude obj = new largestAltitude();
        int[] gain = { -5, 1, 5, 0, -7 };
        int result = obj.largestAltitude(gain);
        System.out.println("result: " + result);
        ;
    }
}

import java.util.*;

class Solution {
    public int minimumPushes(String word) {

        int[] freq = new int[26];

        // Count frequency of each letter
        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Sort frequencies in ascending order
        Arrays.sort(freq);

        int pushes = 0;
        int cost = 1;
        int count = 0;

        // Traverse from largest frequency to smallest
        for (int i = 25; i >= 0; i--) {

            if (freq[i] == 0)
                break;

            pushes += freq[i] * cost;
            count++;

            // After assigning 8 letters, increase cost
            if (count == 8) {
                cost++;
                count = 0;
            }
        }

        return pushes;
    }
}
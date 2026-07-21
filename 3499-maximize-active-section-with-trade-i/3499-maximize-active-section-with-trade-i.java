class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        String t = "1" + s + "1";
        int n = t.length();

        // Count original active sections
        int active = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') active++;
        }

        int maxGain = 0;
        int i = 1;

        while (i < n - 1) {

            // Find a 1-block surrounded by 0s
            if (t.charAt(i) == '1' && t.charAt(i - 1) == '0') {

                int oneStart = i;
                while (i < n && t.charAt(i) == '1') i++;
                int oneEnd = i - 1;

                if (i < n && t.charAt(i) == '0') {

                    // Left zero block
                    int left = oneStart - 1;
                    while (left >= 0 && t.charAt(left) == '0') left--;
                    int leftZeros = oneStart - left - 1;

                    // Right zero block
                    int right = i;
                    while (right < n && t.charAt(right) == '0') right++;
                    int rightZeros = right - i;

                    int oneLen = oneEnd - oneStart + 1;

                    // Merged zero block after removing the 1-block
                    int gain = leftZeros + oneLen + rightZeros - oneLen;

                    maxGain = Math.max(maxGain, gain);
                }
            } else {
                i++;
            }
        }

        return active + maxGain;
    }
}
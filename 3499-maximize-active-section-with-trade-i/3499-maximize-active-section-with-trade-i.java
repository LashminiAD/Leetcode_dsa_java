class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        // String t = "1" + s + "1";
        // int n = t.length();

        // // Count original active sections
        // int active = 0;
        // for (char c : s.toCharArray()) {
        //     if (c == '1') active++;
        // }

        // int maxGain = 0;
        // int i = 1;

        // while (i < n - 1) {

        //     // Find a 1-block surrounded by 0s
        //     if (t.charAt(i) == '1' && t.charAt(i - 1) == '0') {

        //         int oneStart = i;
        //         while (i < n && t.charAt(i) == '1') i++;
        //         int oneEnd = i - 1;

        //         if (i < n && t.charAt(i) == '0') {

        //             // Left zero block
        //             int left = oneStart - 1;
        //             while (left >= 0 && t.charAt(left) == '0') left--;
        //             int leftZeros = oneStart - left - 1;

        //             // Right zero block
        //             int right = i;
        //             while (right < n && t.charAt(right) == '0') right++;
        //             int rightZeros = right - i;

        //             int oneLen = oneEnd - oneStart + 1;

        //             // Merged zero block after removing the 1-block
        //             int gain = leftZeros + oneLen + rightZeros - oneLen;

        //             maxGain = Math.max(maxGain, gain);
        //         }
        //     } else {
        //         i++;
        //     }
        // }

        // return active + maxGain;

        int oneCount = 0; // Total number of ones already present in the string
        int maxMergedzeros = 0; // Max number ofg aditional ones we could get by merging 2 0 blocks
        int currZeroCount = 0; // Length of the zero block we are currently walking through
        int lastZeroCount = 0; // Length of the previous 0 block we finished

        // Loop over each char
        for(char c : s.toCharArray()){
            if(c == '0') currZeroCount++; // Increase the continuos zero count
            else {
                // If the char is not a 0 and we have a current count of zeros then we save the previous zero block length
                if(currZeroCount != 0) lastZeroCount = currZeroCount;
                currZeroCount = 0; // Reset the current zero block length to zero since we are counting the continuos ones in this point
                oneCount++; // Increase the one count
            }
            // Updates the largest merged zero blocks
            maxMergedzeros = Math.max(maxMergedzeros, currZeroCount + lastZeroCount);
        }
        // If there are no 1 blocks then the best zero block comes from either side, so we can't merge 0 blocks 
        // Meaning there is  no profitable trade making the existing ones the best already
        if(maxMergedzeros == currZeroCount || maxMergedzeros == lastZeroCount) return oneCount;
        // Return the largets gain obtainable by merging two zero blocks with the ones already present
        return oneCount + maxMergedzeros;
    }
}
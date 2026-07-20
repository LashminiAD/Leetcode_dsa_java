class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count =0;
        for(int i : jewels.toCharArray()){
            for(int j : stones.toCharArray()){
                 if(i == j) count++;
            }
        }
        return count;
    }
}
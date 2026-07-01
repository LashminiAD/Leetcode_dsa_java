class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int n : nums){
            if(n%2==0)
            even.add(n);
            else
            odd.add(n);
        }
        int[] res = new int[nums.length];
        int index =0;
        for(int i : even)
        res[index++] = i;
        for(int j : odd)
        res[index++] = j;

        return res;
    }
}
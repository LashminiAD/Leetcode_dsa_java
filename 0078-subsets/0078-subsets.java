class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sub = new ArrayList<>();
        sub.add(new ArrayList<>()); //[]

        for(int n : nums){
            int size = sub.size();
            for(int i=0; i<size; i++){
                List<Integer> newsub = new ArrayList<>(sub.get(i)); //[ [] ]
            newsub.add(n);
            sub.add(newsub);
            }
           
        }
        return sub;
    }
}
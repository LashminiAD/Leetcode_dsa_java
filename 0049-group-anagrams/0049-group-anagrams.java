class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs){
            char [] arr = s.toCharArray();
            Arrays.sort(arr);
            String cs = new String(arr);

            if(!map.containsKey(cs)){
                map.put(cs, new ArrayList<>()); //act []
            }
            map.get(cs).add(s); // act [cat]
        }
        return new ArrayList<>(map.values());
    }
}
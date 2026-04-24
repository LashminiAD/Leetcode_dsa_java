class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs){
            char [] arr = s.toCharArray();
            Arrays.sort(arr);
            String cs = new String(arr);
//instead of containsKey we can use putIfAbsent
            if(!map.containsKey(cs)){
                map.put(cs, new ArrayList<>()); //act []
            }
            //or   map.putIfAbsent(cs, new ArrayLtgist<>());
        
            map.get(cs).add(s); // act [cat]
        }
        return new ArrayList<>(map.values());
    }
}

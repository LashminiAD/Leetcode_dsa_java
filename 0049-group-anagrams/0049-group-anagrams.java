class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            int []count = new int[26];
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            
            String cs = Arrays.toString(count);
            map.putIfAbsent(cs, new ArrayList<>());
            map.get(cs).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
// or O(n * k log k) SORTING APPORACH
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            
            String cs = new String(arr);
//or containsKey 
            if(!map.containsKey(cs)) {
                map.put(cs, new ArrayList<>());  }
// cleaner way instead of containsKey we can use putIfAbsent      
            map.putIfAbsent(cs, new ArrayList<>());
            map.get(cs).add(s);
        }

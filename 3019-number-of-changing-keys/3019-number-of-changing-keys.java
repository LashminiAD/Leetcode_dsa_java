class Solution {
    public int countKeyChanges(String s) {
        int count = 0;
        char[] arr = s.toLowerCase().toCharArray();
        for(int i =1; i<arr.length; i++){
            if(arr[i] != arr[i-1]) count++;
        }
        return count;
    }
}
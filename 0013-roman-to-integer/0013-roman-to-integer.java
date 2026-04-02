class Solution {
    public int romanToInt(String s) {
        int []val = new int[128];
        val['I']=1;
        val['V']=5;
        val['X']=10;
        val['L']=50;
        val['C']=100;
        val['D']=500;
        val['M']=1000;
        int sum = 0;
        for(int i = 0; i<s.length(); i++){
            int current = val[s.charAt(i)]; //XI //X -> 10
            if(i<s.length()-1 && current < val[s.charAt(i+1)]){ //10 < 1
                sum -= current;
            }else{
                sum += current; //10 + 1//11
            }
        }
        return sum; 
    } 
}

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totDrink = numBottles; //15
        int empty = numBottles; //15
        while(empty >= numExchange){ //15 >= 4 , 6 >= 4 , 3 >= 4 NOO
            int newBottles = empty / numExchange; // 15/4 = 3, 6/4 = 1
            int remainEmpty = empty % numExchange; // 15 % 4 = 3 , 6 % 4 = 2
            totDrink += newBottles; // 15 + 3 = 18, 18 + 1 = 19 
            empty = newBottles + remainEmpty; // 3 + 3 = 6 , 1 + 2 = 3
            
        }
        return totDrink;

    }
}
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totDrink = numBottles; //10
        int empty = numBottles; //10
        while(empty >= numExchange){ //10 >= 3 
            empty -= numExchange; //10-3=7
            int getBot = 1; 
            totDrink += getBot; //10+1 = 11
            empty += getBot; // 7 + 1 = 8 
            numExchange++; //4
        }
        return totDrink;

    }
}
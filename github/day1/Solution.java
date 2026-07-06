package day1;

public class Solution {

        public int numWaterBottles(int numBottles, int numExchange) {
            int full=0;
            int empty;
            while(numBottles >numExchange){
                full=numBottles;
                empty=numBottles/numExchange;
                full+=empty;

            }

            System.out.println(full);
            return full;
        }
}

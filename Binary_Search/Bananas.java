package com.problem_solving.Needcode150.Binary_Search;


public class Bananas {

    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int hoursLimit = 8;
        System.out.println(findMinBananaEatingSpeed(piles, hoursLimit));
    }

    public static int findMinBananaEatingSpeed(int[] piles, int hoursLimit) {

        // min and max banana eating speed
        int lowestSpeed = 1, highestSpeed = 1;
        for (int pile : piles) {
            highestSpeed = Math.max(highestSpeed, pile);
        }

        while (lowestSpeed < highestSpeed) {
            int midSpeed = lowestSpeed + (highestSpeed - lowestSpeed) / 2;
            if (canEatAllBananas(piles, midSpeed, hoursLimit)) {
                highestSpeed = midSpeed;
            } else {
                lowestSpeed = midSpeed + 1;
            }
        }
        return lowestSpeed;
    }

    private static boolean canEatAllBananas(int[] piles, int currSpeed, int hoursLimit) {
        int currHours = 0;
        for (int pile : piles) {
            currHours += Math.ceil((double) pile / currSpeed);
        }
        /**
         * check if exceeded time limit
         * if currHours less then time limit -> lowestSpeed can be faster -> move left pointer to faster speed
         * if currHours more then time limit -> highestSpeed should be slower -> move right pointer to slower speed
         */
        return currHours <= hoursLimit;
    }
}

package com.problem_solving.Needcode150.Arrays_and_Hashing;


import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,5,6,7,7,7,7,7};
        int k = 2;
        System.out.println(Arrays.toString(topElems(nums, k)));
    }

    public static int[] topElems(int[] nums, int k) {

        //edge case
        if(k == nums.length){
            return nums;
        }

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n,0) +1);
        }

//        Queue<Integer> heap = new PriorityQueue<>(
//                (a,b) -> freqMap.get(a)-freqMap.get(b));

        Queue<Integer> heap = new PriorityQueue<>(
                Comparator.comparingInt(freqMap::get));

        for(int n : freqMap.keySet()) {
            heap.add(n);
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] answer = new int[k];
        for (int i=0; i<k; i++) {
            answer[i] = heap.poll();
        }

        return answer;
    }
}

package com.rohith.leetcode75.arrayAndString;

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {

        int firstMin=Integer.MAX_VALUE, secMin=Integer.MAX_VALUE;
        for(int i: nums){
            if(i<=firstMin) firstMin = i;
            else if(i<=secMin) secMin = i;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
    	IncreasingTripletSubsequence solution = new IncreasingTripletSubsequence();

        // Test case 1
        int[] nums1 = {1, 2, 3, 4, 5};
        boolean result1 = solution.increasingTriplet(nums1);
        System.out.println("Test case 1: " + result1);

        // Test case 2
        int[] nums2 = {5, 4, 3, 2, 1};
        boolean result2 = solution.increasingTriplet(nums2);
        System.out.println("Test case 2: " + result2);

        // Test case 3
        int[] nums3 = {2, 1, 5, 0, 4, 6};
        boolean result3 = solution.increasingTriplet(nums3);
        System.out.println("Test case 3: " + result3);
    }
}

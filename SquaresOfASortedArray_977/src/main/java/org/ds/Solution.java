package org.ds;

class Solution {
    public static int[] sortedSquares(int[] nums) {
        int[] newArray = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        while (index >=0 && nums[left] <= nums[right] ) {
            if (Math.abs(nums[left]) >= Math.abs(nums[right])) {
                newArray[index] = nums[left] * nums[left];
                left++;
            } else {
                newArray[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }
        return newArray;
    }
}
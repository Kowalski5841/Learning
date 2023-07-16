/*
 * Copyright (c) @KOWALSKI FOR STUDY
 */

package com.kowalski.day2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
//        int[] arr = {1,2,4,6,10};
//        System.out.println(Arrays.toString(twoSum2(arr, 8)));
        int[] arr = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares2(arr)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length-1;
        int[] result = new int[2];
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                 result[0] = left;
                 result[1] = right;
                 break;
            }
        }
        return result;
    }
    public static int[] twoSum2(int[] numbers, int target){
        int[] result = new int[2];
        for (int j = 0; j < numbers.length; j++) {
            int temp = target - numbers[j];
            for (int i = 1; i < numbers.length; i++) {
                if(numbers[i] == temp && i != j){
                    result[0] = Math.min(i, j);
                    result[1] = Math.max(i, j);
                }
            }
        }
        return result;
    }

    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for(int j = 0; j < nums.length - i -1; j++){
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] =nums[i] ^ 2;
        }
        return nums;
    }
    public static int[] sortedSquares2(int[] nums) {

        int len = nums.length;
        int[] ans = new int[len];
        int l = 0, r = nums.length-1;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        while(l <= r){
            if(nums[l] > nums[r]){
                ans[--len] = nums[l];
                ++l;
            }else{
                ans[--len] = nums[r];
                --r;
            }
        }

        return ans;
    }
    /**
     * Definition for singly-linked list.
     *
     *
     *
     *
     *
     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode p = head;
        while (head != null){
            ListNode temp = p.next;
            p.next = pre;
            pre = p;
            p =temp;
        }
        return pre;
    }

}
package com.fxf.demo.day_20220826;

public class Demo1 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length != 0){
            if (nums2.length % 2 == 0){
                return (double)((nums2[nums2.length / 2] + nums2[nums2.length / 2 - 1])) / 2;
            }else {
                return nums2[nums2.length / 2];
            }
        }
        if (nums2.length == 0 && nums1.length != 0){
            if (nums1.length % 2 == 0){
                return (double)((nums1[nums1.length / 2] + nums1[nums1.length / 2 - 1])) / 2;
            }else {
                return nums1[nums1.length / 2];
            }
        }
        if (nums2.length == 0 && nums1.length == 0){
            return 0;
        }
        int[] count = new int[nums1.length + nums2.length];
        int front1 = 0;
        int front2 = 0;
        int flag = 0;
        while (front1 < nums1.length || front2 < nums2.length){
            if (front1 == nums1.length){
                count[flag] = nums2[front2];
                front2++;
                flag++;
                continue;
            }
            if (front2 == nums2.length){
                count[flag] = nums1[front1];
                front1++;
                flag++;
                continue;
            }
            if (nums1[front1] < nums2[front2]){
                count[flag] = nums1[front1];
                front1++;
                flag++;
            }else {
                count[flag] = nums2[front2];
                front2++;
                flag++;
            }
        }
        if (count.length % 2 == 0){
            return (double) ((count[count.length / 2] + count[count.length / 2 - 1])) / 2;
        }else {
            return (double) count[count.length / 2];
        }
    }
}

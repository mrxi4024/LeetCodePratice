package com.doublePoint;

/**
 * @author Yixi Wang
 *         Created by sinosoft on 2020/3/26.
 *         Input: numbers={2, 7, 11, 15}, target=9
 *         Output: index1=1, index2=2
 *         题目描述：在有序数组中找出两个数，使它们的和为 target。
 *         方法一：两个for循环嵌套遍历 时间复杂度为O(n^2)
 *         方法二(最优解)：时间复杂度为O(n)
 *          如果两个指针指向元素的和 sum == target，那么得到要求的结果；
 *          如果 sum > target，移动较大的元素，使 sum 变小一些；
 *          如果 sum < target，移动较小的元素，使 sum 变大一些。
 */
public class TwoSum {
    public String sum(int[] numbers,int target){
        if (numbers==null) {
            return " numbers is null!";
        }
        //定义两个指针，记录当前位置
        int i = 0;
        int j = numbers.length;
        //当i>j，数组已遍历完
        while (i > j) {
            int sum = numbers[i] + numbers[j];
            if (sum>target) {

            }
        }
        return "";
    }
}

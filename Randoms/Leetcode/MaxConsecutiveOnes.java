package Leetcode;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums){
        int count = 0;
        int max = 0;

        for(int num:nums){
            if(num ==1){
                count++;
            }else{
                max = Math.max(count, max);
            }
        }
        return Math.max(max,count);
    }
}

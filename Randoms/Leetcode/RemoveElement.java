package Leetcode;

public class RemoveElement {

    public int removeElement(int[] nums, int val){
        // serves as pointer
        int k = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]!= val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

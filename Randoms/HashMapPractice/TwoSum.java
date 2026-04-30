package HashMapPractice;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums and an integer target,
// return the indices of the two numbers
// such that they add up to target.
public class TwoSum {

    static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};
        int target1= 7;
        int[] result = twoSum(array1, target1);
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + array1[result[0]] + " + " + array1[result[1]] + " = " + target1);
        } else {
            System.out.println("No solution found.");
        }
    }

    public static int[] twoSum(int[] nums, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }



}

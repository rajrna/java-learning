package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums){
        Set<Integer> seenNums = new HashSet<>();

        for(int num : nums){
            if(seenNums.contains(num)){
                return true;
            }
            seenNums.add(num);
        }
        return false;
    }
}

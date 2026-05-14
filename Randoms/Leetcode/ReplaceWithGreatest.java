package Leetcode;

public class ReplaceWithGreatest {
    public int[] replaceElements(int[] arr){
        int n = arr.length;
        int currentMax = -1;

        for(int i = n-1; i >= 0; i--){
            int currentVal = arr[i];

            arr[i] = currentMax;

            if(currentVal > currentMax){
                currentMax = currentVal;
            }
        }

        return  arr;
    }
}

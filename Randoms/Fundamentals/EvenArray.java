package Fundamentals;

//    Given an array of integers,
//    return a new array containing only the even numbers,
//    preserving their original order.
public class EvenArray {
    static void main() {
        int[] nums = {1,2,3,4,5,6};
        int count = 0;
        for(int i=0;i<nums.length; i++){
            int num = nums[i];
            if(num%2==0){
                count++;
            }
        }

        int[] evenNums = new int[count];

        int index = 0;
        for(int i =0;i<nums.length; i++){
            if(nums[i]%2==0){
                evenNums[index] = nums[i];
                index++;
            }
        }

        for(int i=0; i<evenNums.length;i++){
            System.out.println(evenNums[i] + " ");
        }
    }
}

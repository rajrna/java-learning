package day2.flowloops;
// Write a loop that finds the largest number
// in an array of integers 
// without using any built-in methods.
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr ={1,2,3};

        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }

        System.out.println("Largest num: "+max);
    }
    
}

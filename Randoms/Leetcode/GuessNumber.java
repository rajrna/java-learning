package Leetcode;

//**
// * Forward declaration of guess API.
// * @param  num   your guess
// * @return 	     -1 if num is higher than the picked number
// *			      1 if num is lower than the picked number
// *               otherwise return 0
// * int guess(int num);
// **/
public class GuessNumber {


    public int guess(int num){
        int select = 5;
        if(num>select){
            return  -1;
        }else if(num<select){
            return 1;
        }else {
            return  0;
        }
    }
    public int guessNumber(int n){
        int low = 1;
        int high = n;

        while(low <= high){
            int mid = low + (high - low) / 2;
            int res = guess(mid);

            if(res == 0){
                return  res;
            } else if (res == -1) {
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}

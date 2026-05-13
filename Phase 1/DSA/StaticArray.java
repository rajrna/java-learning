
//Reading from an Array

//remove from end
void removeEnd( int[] arr, int length){
        if(length>0){
                arr[length-1] = 0;
                length--;
        }
}

//remove from middle
void removeMiddle(int[] arr, int i, int length){
        for(int index = i+1; index<length; i++){
                arr[index - 1] = arr[index];
        }
}

//insert element at the end
void insertEnd(int[] arr, int n, int length, int capacity){
        if(length < capacity){
                arr[length] = n;
        }
}

//insert element at middle
void insertMiddle(int[] arr, int i, int n, int length){
        for(int index = length - 1; index>i; i--){
                arr[index + 1] = arr[index];
        }
        arr[i] = n;
}
void main() {

//initialize
        int[] myArray = {1,3,5};
//access arbitrary element
        int num =myArray[2];

//traversing through an array
        int size = myArray.length;

        for (int i=0; i<size; i++){
                System.out.println(myArray[i]);
        }



}
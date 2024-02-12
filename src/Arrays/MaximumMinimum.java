package Arrays;

//Rearrange an array in maximum minimum form using Two Pointer Technique

//Given a sorted array of positive integers,
// rearrange the array alternately i.e first element should be a maximum value,
// at second position minimum value, at third position second max,
// at fourth position second min, and so on..

public class MaximumMinimum {
    public static void method(int[] arr){
        int[] temp = arr.clone();
        int low = 0 ;
        int high  = arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=temp[high--];
            }else{
                arr[i]=temp[low++];
            }
        }
    }
}

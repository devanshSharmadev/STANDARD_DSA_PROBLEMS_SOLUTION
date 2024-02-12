package Arrays;

//Given an array of random numbers, Push all the zero’s of a given array to the end of the array.
// For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0},
// it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}.
// The order of all other elements should be same.

public class MovingZeroToEnd {
    public static void movingZerosToEndOne(int[] arr){
        // You just need to modify the current array, not need to make any new changes in it...

        int j=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                System.out.println(arr[i]+" "+arr[j]);
                j++;
            }
        }
        for(int x:arr){
            System.out.println(x);
        }

    }

}

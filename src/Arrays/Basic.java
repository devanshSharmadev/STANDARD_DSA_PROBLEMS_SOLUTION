package Arrays;

import java.util.Arrays;

public class Basic {
    public static  void reverseAnArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static  void reverseAnArrayInRange(int[] arr,int s,int e){
        int start=s;
        int end=e-1;
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void rotateAnArray(int[] arr, int n){
        reverseAnArrayInRange(arr,0,n);
        reverseAnArrayInRange(arr,n,arr.length);
        reverseAnArray(arr);
    }

    public static void printAllSubArrays(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                printSubarray(arr,i,j);
            }
        }
    }

    public static void printSubarray(int[] array, int start, int end) {
        System.out.print("[");
        for (int i = start; i <= end; i++) {
            System.out.print(array[i]);
            if (i < end) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

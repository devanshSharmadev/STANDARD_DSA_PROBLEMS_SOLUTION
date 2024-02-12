package Arrays;

import java.util.ArrayList;

public class LeaderOfTheArray {
    public static ArrayList<Integer> method(int[] arr){
        int temp=Integer.MIN_VALUE;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=arr.length-1;i<=0;i++){
            if(arr[i]>temp){
                result.add(arr[i]);
                temp=arr[i];
            }
        }
        return result;
    }
}

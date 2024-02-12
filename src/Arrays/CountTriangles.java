package Arrays;

import java.util.Arrays;

public class CountTriangles {
    public static int method(int[] arr){
        int n=arr.length;
        int count=0;
        Arrays.sort(arr);

        for(int i=n-1;i>=1;i--){
            int l=0,r=i-1;
            while(l<r){
                if(arr[l]+arr[r]>arr[i]){
                    count+=r-l;
                    r--;


                }else{
                    l++;
                }
            }
        }
        return count;
    }
}

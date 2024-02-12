package Arrays;

public class SubArrayWithGivenSum {
    public static boolean method(int[] arr,int target){
        int sum=0;
        int j=0;
        for(int i=0;i<arr.length;i++){
            while(sum>target && j<i){
                sum-=arr[j];
                j++;
            }
            if(sum==target){
                return true;
            }
            sum+=arr[i];
        }
        return false;
    }
}

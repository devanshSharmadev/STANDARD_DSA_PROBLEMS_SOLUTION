package Arrays;

public class elementappearsarrayeveryelementappearstwice {

    // Take XOR of all element and return the answer.
    public static int method1(int[] arr){
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            res=res^arr[i];
        }
        return res;
    }
}

package Arrays;

public class WaveArray {
    public static void method(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(i%2==0 && i<arr.length-1){
                if(arr[i+1]>arr[i]){
                    int temp = arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
            }else{
                if(i<arr.length-1 && arr[i+1]<arr[i] ){
                    int temp = arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        for(int x:arr){
            System.out.println(x);
        }
    }
}


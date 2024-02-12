package Arrays;

import java.util.Arrays;

public class SegregrateEvenOdd {
    public static void method(int[] s){
        int j=0;
        for(int i=0;i<s.length;i++){
            if(s[i]%2==0){
                int temp=s[j];
                s[j]=s[i];
                s[i]=temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(s));
    }
}

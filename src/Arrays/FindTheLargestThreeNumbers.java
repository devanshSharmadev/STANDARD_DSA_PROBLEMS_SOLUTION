package Arrays;

import java.util.Arrays;

public class FindTheLargestThreeNumbers {
    public static int[] findTheLargestThreeNumbersLameMethod(int[] arr){
        // lame method
        // 1. Sort the Array & return last three elements

        Arrays.sort(arr); //  ---- O(nlog(N))
        int n=arr.length; // ----- O (1)
        int largest = arr[n-1];   //// O(1)
        int secondLargst = arr[n-1]; // O(1)
        int thirdlargest = arr[n-2]; // O(1)

        // Compexity  - O(nlog()n)+O(1) + O(1) + O(1) + O(1) => O(nlog(n))

        return new int[]{largest,secondLargst,thirdlargest};

    }

    public static int[] secondMethod(int[] arr){
        int firstlarget,secondLargest,third;
        firstlarget=secondLargest=third=Integer.MIN_VALUE;

        for(int x:arr){
            if(x>firstlarget){
                third=secondLargest;
                secondLargest=firstlarget;
                firstlarget=x;
            }else if(x>secondLargest && x!=firstlarget){
                third=secondLargest;
                secondLargest=x;

            }else if(x>third && x!=secondLargest){
                third=x;
            }
        }

        return new int[]{firstlarget,secondLargest,third};
    }
}

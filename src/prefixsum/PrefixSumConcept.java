package prefixsum;

import java.util.Arrays;

public class PrefixSumConcept {

    public static void main(String[] args) {

        int arr[] = {-2, 0, 3, -5, 2, -1};

        int[] result = new int[arr.length];
        result[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            result[i] = arr[i] + result[i-1];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));

        //Find interval
        int start=0,end=3;
        System.out.println(result[end] - result[start-1]);
    }
}

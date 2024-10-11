package TwoSum;

import java.util.Arrays;

public class RemoveDuplicates_26 {
    public static int removeDuplicates(int[] nums) {
        int left =0;
        int right = 1;

        while(right<nums.length){
            if(nums[left] == nums[right]){
                right++;
            }else{
                left++;
                nums[left] = nums[right];
                right++;
            }
        }
        return left+1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        int [] result = new int[arr.length];
        int size = removeDuplicates(arr);
        for (int i = 0; i < size; i++) {
            result[i] = arr[i];
        }

        System.out.println(Arrays.toString(result));
    }
}

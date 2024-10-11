package prefixsum;

/*
Problem No: 525

* https://leetcode.com/problems/contiguous-array/description/
* */
public class ContiguousArray_525 {
    public static int findMaxLength(int[] nums) {

        int max =0;
        int[] result = new int[nums.length];
        result[0] = nums[0] == 0 ? -1 : 1;
        for(int i=1;i<nums.length;i++){
            result[i] = (nums[i] == 0 ?-1:1) + result[i-1];
            if(result[i]==0){
                max =i+1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,0,0,0,1,1};
        System.out.println(findMaxLength(arr));
    }
}

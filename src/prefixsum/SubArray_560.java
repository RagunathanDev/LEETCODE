package prefixsum;

import java.util.HashMap;

public class SubArray_560 {

    public static int subarraySum(int[] nums, int k) {
        int prefixSum = 0;
        int count =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : nums) {
            prefixSum = prefixSum + num;

            if(map.containsKey(prefixSum - k)){
                count = count + map.get(prefixSum - k);
            }
            map.put(prefixSum , map.getOrDefault(prefixSum,0) +1);
        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        int k =3;
        System.out.println(subarraySum(arr,k));
    }
}

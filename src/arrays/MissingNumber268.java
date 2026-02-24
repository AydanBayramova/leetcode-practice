package arrays;

import java.util.HashSet;

public class MissingNumber268 {
    //Solution 1
        public int missingNumber(int[] nums) {
            int max=nums.length;
            HashSet<Integer> set=new HashSet<>();
            for(int num:nums){
                set.add(num);
            }
            while(max>=0){
                if(!set.contains(max)){
                    return max;
                }
                max--;
            }
            return -1;
        }
        //Solution 2
//    public int missingNumber(int[] nums) {
//        int n = nums.length;
//        int expectedSum = n * (n + 1) / 2;
//        int actualSum = 0;
//        for (int num : nums) {
//            actualSum += num;
//        }
//        return expectedSum - actualSum;
//    }
}

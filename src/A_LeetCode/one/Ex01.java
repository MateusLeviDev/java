package A_LeetCode.one;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex01 {
    public int[] twoSum(int[] nums, int target) {

        //Initialize Hash-Map to hold nums Integers as key and their indexs as their values
        Map<Integer, Integer> hashMap = new HashMap<>();


        //Initialize For loop to iterate through 'nums' array
        for (int i = 0; i < nums.length; i++) {
            // Subtract current target from current value of nums[i] in interation to get the complement
            int complement = target - nums[i];

            /* Chech to see if complement is present as a key in Hash-Map if so that means (Complement + num[i]) = Target if so return a new Interger Array with the key of the complement value (which is the complement index) and index of num[i] */
            if (hashMap.containsKey(complement)) {
                return new int[]{hashMap.get(complement), i};
            }

            //Places num[i] as key and num[i] index as value if no complement is found
            hashMap.put(nums[i], i);

        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 6, 7};
        int target = 10;

        Ex01 ex01 = new Ex01();
        int[] result = ex01.twoSum(nums, target);

        System.out.println(Arrays.toString(result));

    }
}
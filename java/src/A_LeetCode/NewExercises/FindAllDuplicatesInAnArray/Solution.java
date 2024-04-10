package A_LeetCode.NewExercises.FindAllDuplicatesInAnArray;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        int[] input = {1,2,6,9,8,6,1,7};

        System.out.println(findDuplicates(input));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int B = 100001;
        for (int i = 0; i < nums.length; i++) {
            int index = (nums[i] % B) - 1;
            nums[index] += B;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 2*B) {
                res.add(i + 1);
            }
        }

        return res;
    }
}

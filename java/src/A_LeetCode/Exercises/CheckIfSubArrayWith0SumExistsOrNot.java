package A_LeetCode.Exercises;

import java.util.*;

/*
    Author: levi
    Date: May 6, 2024
 */
public class CheckIfSubArrayWith0SumExistsOrNot {

    public static void main(String[] args) {
        int[] numbers = {4, -6, 3, -1, 4, 2, 7};

        if (hasZeroSumSubArray(numbers)) {
            System.out.println("Subarray exists");
        } else {
            System.out.println("Subarray does not exist");
        }

    }

    public static Boolean hasZeroSumSubArray(int[] numbers) {
        // create an empty set to store the sum of elements of each
        // subArray `numbers[0…i]`, where `0 <= i < numbers.length`
        Set<Integer> set = new HashSet<>();

        // insert 0 into the set to handle the case when subArray with
        // zero-sum starts from index 0
        set.add(0);

        int sum = 0;

        // traverse the given array
        for (int value : numbers) {
            // sum of elements so far
            sum += value;

            // if the sum is seen before, we have found a subArray with zero-sum
            if (set.contains(sum)) {
                return true;
            }

            // insert sum so far into the set
            set.add(sum);
        }

        // we reach here when no subArray with zero-sum exists
        return false;
    }
}

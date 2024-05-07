package A_LeetCode.Exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
    Author: levi
    Date: May 6, 2024
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 8, 12, 9, 11, 13, 5, 2};
//        findPairUsingSort(numbers, 18);
        findPairUsingHashing(numbers, 18);
    }

    /*
    Given an unsorted integer array, find a pair with the given sum in it.
     */
    public static void findPairUsingSort(int[] numbers, int target) {

        Arrays.sort(numbers);

        //Pointer Initialization, because of indexes
        int low = 0;
        int high = numbers.length - 1;

        while (low < high) {
            if (numbers[low] + numbers[high] == target) {
                System.out.printf("Pair found (%d, %d)", numbers[low], numbers[high]);
                return;
            }

            // increment `low` index if the total is less than the desired sum;
            // decrement `high` index if the total is more than the desired sum
            if (numbers[low] + numbers[high] < target) {
                //means we need to increase the sum to get closer to the target.
                low++;
            } else {
                high--;
            }

            System.out.println("Pair not found");
        }
    }

    public static void findPairUsingHashing(int[] numbers, int target) {
        {
            // create an empty HashMap
            Map<Integer, Integer> map = new HashMap<>();

            // do for each element
            for (int i = 0; i < numbers.length; i++) {
                // check if pair (numbers[i], target-numbers[i]) exists

                // if the difference is seen before, print the pair
                if (map.containsKey(target - numbers[i])) {
                    System.out.printf("Pair found (%d, %d)",
                            numbers[map.get(target - numbers[i])], numbers[i]); //map.get(10) return the index, i.e. 0 and numbers[0] == 10 in this case
                    return;
                }

                // store index of the current element in the map
                map.put(numbers[i], i);
            }

            // we reach here if the pair is not found
            System.out.println("Pair not found");
        }
    }
}

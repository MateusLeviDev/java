package A2_LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberOfDistinctAvg {
    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 3, 0, 6, 7, 8, 20, 13};
        int result = distinctAvg(nums);
        System.out.println("Número de médias distintas: " + result);

        int i = distinctAverages(nums);
        System.out.println(i);
    }

    public static int distinctAvg(int[] nums) {
        int half = nums.length / 2;

        Set<Float> set = IntStream.range(0, half)
                .mapToObj(i -> (nums[i] + nums[nums.length - 1 - i]) / 2.0F)
                .collect(Collectors.toSet());

        return set.size();
    }

    /*
    O uso da variável half divide a lista em duas partes, calculando as médias
    apenas para os pares correspondentes em ambas as extremidades da lista, evitando a
    repetição do mesmo cálculo para os mesmos pares.
     */
    public static int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        List<Float> list = new ArrayList<>(); //
        int half = nums.length / 2;
        for (int i = 0; i < half; i++) {
            list.add((nums[i] + nums[nums.length - 1 - i]) / 2.0F);
        }
        return (int) list.stream().distinct().count();
    }
}

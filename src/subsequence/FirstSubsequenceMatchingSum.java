package subsequence;

import java.util.ArrayList;
import java.util.List;

public class FirstSubsequenceMatchingSum {
    public static boolean firstSubsequenceMatchedSum(
            final int[] arr,
            final int n,
            int index,
            final List<Integer> result,
            int sum,
            int target
    ) {
        if(index >= n ) {
            if(sum == target) {
                System.out.println(result);
                return true;
            }
            return false;
        }

        // take
        result.add(arr[index]);
        sum += arr[index];
        if(firstSubsequenceMatchedSum(arr, n, index + 1, result, sum, target)) {
            return true;
        }

        // not take
        result.remove(result.size() - 1);
        sum -= arr[index];
        if(firstSubsequenceMatchedSum(arr, n, index + 1, result, sum, target)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int n = arr.length;
        firstSubsequenceMatchedSum(
                arr,
                n,
                0,
                new ArrayList<>(),
                0,
                2
        );
    }
}

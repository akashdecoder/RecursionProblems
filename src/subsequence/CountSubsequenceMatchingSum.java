package subsequence;

import java.util.ArrayList;
import java.util.List;

public class CountSubsequenceMatchingSum {
    public static int countSubsequenceMatchedSum(
            final int[] arr,
            final int n,
            int index,
            final List<Integer> result,
            int sum,
            int target
    ) {
        if(index >= n ) {
            if(sum == target) {
                return 1;
            }
            return 0;
        }

        // take
        result.add(arr[index]);
        sum += arr[index];
        final int l = countSubsequenceMatchedSum(
                arr,
                n,
                index+1,
                result,
                sum,
                target
        );

        // not take
        result.remove(result.size() - 1);
        sum -= arr[index];
        final int r = countSubsequenceMatchedSum(
                arr,
                n,
                index+1,
                result,
                sum,
                target
        );
        return l + r;
    }

    public static void main(String[] args) {
        final int[] arr = {1,2,3};
        final int n = arr.length;
        System.out.println(
                countSubsequenceMatchedSum(arr, n, 0, new ArrayList<>(), 0, 2)
        );
    }
}

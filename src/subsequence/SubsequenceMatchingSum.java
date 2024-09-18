package subsequence;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceMatchingSum {

    public static void subsequenceMatchedSum(
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
            }
            return;
        }

        // take
        result.add(arr[index]);
        sum += arr[index];
        subsequenceMatchedSum(
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
        subsequenceMatchedSum(
                arr,
                n,
                index+1,
                result,
                sum,
                target
        );
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int n = arr.length;
        subsequenceMatchedSum(
                arr,
                n,
                0,
                new ArrayList<>(),
                0,
                2
        );
    }
}

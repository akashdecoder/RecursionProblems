package subsequence;

import java.util.ArrayList;
import java.util.List;

public class PrintingSubsequenceInOrder {

    public static void printSubsequence(
            final int[] arr,
            final int n,
            int index,
            final List<Integer> result
    ) {
        if(index >= n) {
            System.out.println(result);
            return;
        }

        // take
        result.add(arr[index]);
        printSubsequence(
                arr,
                n,
                index+1,
                result
        );

        // not take
        result.remove(result.size() - 1);
        printSubsequence(
                arr,
                n,
                index+1,
                result
        );
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        int n = arr.length;
        printSubsequence(
                arr,
                n,
                0,
                new ArrayList<>()
        );
    }


}


import java.util.Arrays;

public class Test {

    public Test() {
    }

    static int lowerBound(int[] a, int low, int high, int element) {
        while (low < high) {
            int middle = low + (high - low) / 2;
            if (element > a[middle]) {
                low = middle + 1;
            } else {
                high = middle;
            }
        }
        return low;
    }

    static int upperBound(int[] a, int low, int high, int element) {
        while (low < high) {
            int middle = low + (high - low) / 2;
            if (a[middle] > element) {
                high = middle;
            } else {
                low = middle + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int arr[] = {5, 9, 2, 5, 77, 8, 56, 100};
        Arrays.sort(arr);
        int n = arr.length;
        System.out.println(lowerBound(arr, 0, n, 5));
        System.out.println(upperBound(arr, 0, n, 100));
    }
}


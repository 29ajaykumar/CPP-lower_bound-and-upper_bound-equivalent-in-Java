# CPP-lower_bound-and-upper_bound-equivalent-in-Java
C++, lower_bound() should return an index to the first element in the sorted container that is equal to or above the number being looked up, and -1 if there is no such element.

C++, upper_bound() should return an index to the first element in the sorted container that is above the number being looked up, and -1 if there is no such element.

In Java, you can use Collections.binarySearch to find the lower bound of the equal range in a sorted list (Arrays.binarySearch provides a similar capability for arrays). Then you continue iterating linearly until you hit to the end of the equal range.

Here is simple java code of lower_bound() and upper_bound() function implementation.


<code>import java.util.Arrays;

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
</code>


import java.util.Arrays;

public class largestinarr {

    public static void main(String args[]) {

        int arr[] = {3, 6, 1, 66, 33, 88, 11};

        Arrays.sort(arr);

        int n = arr.length;

        int small = arr[1];

        int large = arr[n - 1];

        int secondl = arr[n - 2];

        System.out.println("The smallest element" + " " + small);

        System.out.println("The largest element" + " " + large);

        System.out.println("The second largest element" + " " + secondl);

    }

}

public class KadanesAlgorithm {
    // Driver Code
    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int[] result = maxSubArraySum(a);
        System.out.println("Result: " + result);
        System.out.println("Maximum contiguous sum is " + result[0]);
        System.out.println("Start index: " + result[1]);
        System.out.println("End index: " + result[2]);
        System.out.println("Max Ending Here: " + result[3]);
        System.out.println("Length: " + a.length);
        System.out.println("Min Value: " + Integer.MIN_VALUE);
        System.out.println("S: " + result[4]);
        
        
    }

    // Function Call
    static int[] maxSubArraySum(int a[]) {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        int start = 0, end = 0, s = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here += a[i];

            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }

            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }
        }
        return new int[]{max_so_far, start, end, max_ending_here, s};
    }
}

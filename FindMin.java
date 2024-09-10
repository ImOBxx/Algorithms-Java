
public class FindMin {

    public static int findMin(int arr[], int start, int end) {
        if (start == end) {
            return arr[start];
        }

        int mid = (start + end) / 2;

        int leftMin = findMin(arr, start, mid);
        int rightMin = findMin(arr, mid + 1, end);

        return Math.min(leftMin, rightMin);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 11, 6, 4, 10};
        int min = findMin(arr, 0, arr.length - 1);
        System.out.println("The minimum value in the array is: " + min);
    }
}

public class InterSearch {

    public static int interpolationSearch(int[] a, int key) {
        int left = 0;
        int right = a.length - 1;

        while (a[left] < key && key < a[right]) {
            int mid = left + (key - a[left]) * (right - left) / (a[right] - a[left]);
            if (a[mid] < key) {
                left = mid + 1;
            } else if (a[mid] > key) {
                right = mid - 1;
            } else return mid;

            if (a[left] == key) {
                return left;
            } else if (a[right] == key) {
                return right;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,1,1,2,2,3,3,3,3,4,4,4,4,5,6,6,7,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8};
        System.out.println(interpolationSearch(arr,6));
    }

}

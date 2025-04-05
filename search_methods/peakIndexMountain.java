package search_methods;

public class peakIndexMountain {
    static int peakIndexArray(int[] arr) {
        int s = 0, e = arr.length - 1, m = 0;
        int peak = -1;
        while (s < e) {
            m = s + (e - s) / 2;
            if (arr[m] > arr[m+1]) {
                e = m;
                peak = m;
            } else {
                s=m+1;
            }
        }
        return peak;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        System.out.println("The output is: " + peakIndexArray(arr));
    }
}
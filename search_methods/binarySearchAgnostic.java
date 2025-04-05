package search_methods;

public class binarySearchAgnostic {

    public static boolean isRowAsc;
    public static boolean isColAsc;

    static int BSearch(int[][] arr, int element) {
        if (arr == null || arr.length == 0) {
            System.out.println("The array is not initialized or is empty.");
            return -1;
        }
        int left = 0,current;
        int right = arr[0].length - 1;
        isRowAsc = arr[0][0] < arr[0][right];
        isColAsc = arr[0][0] < arr[arr.length - 1][0];
        int floor=Integer.MIN_VALUE;
        int ceil=Integer.MAX_VALUE;
        if (isRowAsc && isColAsc) {
            while (left < arr.length && right >= 0) {
                current=arr[left][right];
                if (current == element) {
                    System.out.printf("Element [%d] found at index [%d][%d].", element, left, right);
                    return 1;
                } else if (current > element) {
                    ceil=Math.min(current, ceil);
                    right--;
                } else {
                    floor=Math.max(floor,current);
                    left++;
                }
            }
        } else {
            while (left < arr.length && right >= 0) {
                current=arr[left][right];
                if (current == element) {
                    System.out.printf("Element [%d] found at index [%d][%d].", element, left, right);
                    return 1;
                } else if (current < element) {
                    floor=Math.max(floor,current);
                    right--;
                } else {
                    ceil=Math.min(current, ceil);
                    left++;
                }
            }
        }
        // Print ceiling and floor values
        System.out.println("Ceiling of the element " + element + " is " + (ceil == Integer.MAX_VALUE ? "None" : ceil));
        System.out.println("Floor of the element " + element + " is " + (floor == Integer.MIN_VALUE ? "None" : floor));


        return -1;

    }
}
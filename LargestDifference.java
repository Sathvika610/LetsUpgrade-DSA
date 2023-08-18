public class LargestDifference {
    public static void main(String[] args) {
        int[] arr = {7, 9, 5, 6, 3, 2};
        int result = findLargestDifference(arr);
        System.out.println("Largest Difference: " + result);
    }
    
    public static int findLargestDifference(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0; // No valid difference possible
        }
        
        int maxDifference = 0;
        int minElement = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > minElement) {
                maxDifference = Math.max(maxDifference, arr[i] - minElement);
            } else {
                minElement = arr[i];
            }
        }
        
        return maxDifference;
    }
}

public class Que1 {
    public static void merge(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
        // Pointer for X[] to iterate from the end of filled elements
        int last = m - 1;
        
        // Move non-zero elements of X[] to the end
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[last] = X[i];
                last--;
            }
        }
        
        // Merge Y[] into X[]
        int i = last + 1;
        int j = 0;
        int k = 0;
        
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[k] = X[i];
                i++;
            } else {
                X[k] = Y[j];
                j++;
            }
            k++;
        }
        
        // If there are any remaining elements in Y[], add them to X[]
        while (j < n) {
            X[k] = Y[j];
            j++;
            k++;
        }
    }
    
    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};
        
        merge(X, Y);
        
        // Print the merged array X[]
        for (int num : X) {
            System.out.print(num + " ");
        }
    }
}

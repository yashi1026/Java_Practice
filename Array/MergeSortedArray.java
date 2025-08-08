public class MergeSortedArray {
    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            merged[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        return merged;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] result = merge(arr1, arr2);
        
        System.out.print("Merged Array: [");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}

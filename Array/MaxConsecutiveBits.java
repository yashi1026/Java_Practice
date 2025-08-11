import java.util.*;
class MaxConsecutiveBits {
    static int maxConsecBits(int[] arr){
        if (arr.length == 0)
            return 0;
        int maxCount = 0, count = 1;
        int maxBit = arr[0];  
         for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            }
            else {
                if (count > maxCount) {
                    maxCount = count;
                    maxBit = arr[i - 1]; 
                }
                count = 1;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            maxBit = arr[arr.length - 1];
        }
        System.out.println("Bit with maximum consecutive count: " + maxBit);
        return maxCount;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements :");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum Consecutive Bits are : " + maxConsecBits(arr));
    }
}

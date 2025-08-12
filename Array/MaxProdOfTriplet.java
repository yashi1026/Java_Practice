import java.util.*;
public class MaxProdOfTriplet {
    static int maxProduct(int[] arr)
    {
        int n = arr.length;
        int max_product = Integer.MIN_VALUE;

        for (int i = 0; i < n - 2; i++)
            for (int j = i + 1; j < n - 1; j++)
                for (int k = j + 1; k < n; k++)
                    max_product = Math.max(max_product,
                                           arr[i] * arr[j]
                                               * arr[k]);

        return max_product;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n= sc.nextInt();
        int arr[] = new int [n];
        System.out.println(" Enter elements :  ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = maxProduct(arr);
        System.out.println("Maximum Product of Triplet : "+result);
    }
}

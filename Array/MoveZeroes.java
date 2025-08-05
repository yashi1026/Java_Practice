public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeroes obj = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("Original array:");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        obj.moveZeroes(nums);
        System.out.println("Array after moving zeroes:");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

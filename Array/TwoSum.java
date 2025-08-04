public class TwoSum {

    public void twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Indexes: " + i + " and " + j);
                    System.out.println("Numbers: " + nums[i] + " + " + nums[j] + " = " + target);
                    System.out.println("Target Found.");
                    return; 
                }
            }
        }
        System.out.println("No two numbers add up to the target.");
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] numbers = {2, 7, 11, 15}; 
        int target = 9;                 
        ts.twoSum(numbers, target);    
    }
}

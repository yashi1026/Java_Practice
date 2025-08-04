 class DuplicateChecker {

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println("Duplicate value " + nums[i] + " found at indexes " + i + " and " + j);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2};
        if (containsDuplicate(numbers)) {
            System.out.println("Duplicate found.");
        } else {
            System.out.println("No duplicates.");
        }
    }
}


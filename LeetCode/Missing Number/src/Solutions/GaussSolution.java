package Solutions;

/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class GaussSolution {
    public int missingNumber(int[] nums) {
        int expectedSum = nums.length*(nums.length + 1)/2;
        int actualSum = 0;
        for (int num : nums) actualSum += num;
        return expectedSum - actualSum;
    }
}

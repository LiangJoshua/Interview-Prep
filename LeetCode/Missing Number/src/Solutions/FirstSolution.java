package Solutions;
import java.util.HashSet;


/**
 * Time Complexity: O(n)
 * Space Complexity: O(
 */
public class FirstSolution {

    public int missingNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        int missingNumber = 0;
        for (int i = 0; i < nums.length; i++){
            hashSet.add(nums[i]);
        }
        for (int i = 0; i < nums.length + 1; i++){
            if (!hashSet.contains(i)) {
                missingNumber = i;
            }
        }
        return missingNumber;
    }


}

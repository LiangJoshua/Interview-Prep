package Solutions;

/**
 * Vertical Scanning (Character by character matching)
 * Time Complexity: O(S)
 * worst case:  In the worst case there will be n equal strings with length m and the algorithm performs
 * S = m*n character comparisons.
 * best case: there are at most n*minLen  comparisons where minLen is the length of the shortest string in the array.
 *
 * Space Complexity: O(1)
 */
public class SecondSolution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}

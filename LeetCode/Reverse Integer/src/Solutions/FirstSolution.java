package Solutions;

public class FirstSolution {

    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10; //math trick that get's the last number 123 -> 3
            x /= 10; //math trick that will truncate the last number 123 -> 12
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop; //math trick that will add a number as an extra digit 12 3 -> 123
        }
        return rev;
    }
}
//Time Complexity: O(log n)
//Space Complexity: O(1)
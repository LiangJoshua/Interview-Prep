package Solution;

public class Solution {
    public String multiply(String num1, String num2) {
        int n1 = num1.length(), n2 = num2.length();
        int[] products = new int[n1 + n2];
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int d1 = num1.charAt(i) - '0';  // we do - '0' to convert it to int. .chartAt(i) will return a character
                int d2 = num2.charAt(j) - '0';  // Note that this is terrible code. It's slightly arcane,
                                                // only works with ASCII and is much harder to parse mentally.
                products[i + j + 1] += d1 * d2;
            }
        }
        int carry = 0;
        for (int i = products.length - 1; i >= 0; i--) {
            int tmp = (products[i] + carry) % 10;
            carry = (products[i] + carry) / 10;
            products[i] = tmp;
        }
        StringBuilder sb = new StringBuilder();
        for (int num : products) sb.append(num);
        while (sb.length() != 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
        return sb.length() == 0 ? "0" : sb.toString(); // code still works when I delete sb.length() == 0 ? "0" :
    }
    public static void main(String args[]){
        Solution solution = new Solution();
        System.out.println(solution.multiply("123", "456"));
    }
}

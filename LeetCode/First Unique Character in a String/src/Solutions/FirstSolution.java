package Solutions;

import java.util.HashMap;


public class FirstSolution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (hashmap.containsKey(s.charAt(i))) {
                hashmap.replace(s.charAt(i), -1);

            } else {
                hashmap.put(s.charAt(i), i);
            }
        }
        int index = Integer.MAX_VALUE;

        for (int value : hashmap.values()) {

            if (index > value && value >= 0) {
                index = value;
            }

        }
        if (index == Integer.MAX_VALUE){
            index = -1;
        }
        return index;
    }

    public static void main(String[] args){
        int ret = new FirstSolution().firstUniqChar("leetcode");

        String out = String.valueOf(ret);

        System.out.print(out);
    }
}

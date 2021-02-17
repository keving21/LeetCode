import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        int val =0;
        int temp =0;

        for(char c: s.toCharArray()){
            hash.put(c, hash.getOrDefault(c,0)+1);
        }

        for(char x: hash.keySet()){
            temp = hash.get(x);

            if (set.contains(temp)) {
                while (set.contains(temp)) {
                    val++;
                    temp--;
                }
            }
            if(temp>0) set.add(temp);
        }
        return val;
    }
}
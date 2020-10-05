import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] out = new int[k];

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        List<Integer> keys = new ArrayList<Integer>(map.keySet());
        Collections.sort(keys, (w1,w2) -> map.get(w2)- map.get(w1));

        for(int i=0;i<k;i++){
            out[i] = keys.get(i);
        }

        return out;
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[][] kClosest(int[][] points, int K) {

        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        int index =0;
        int[][] res = new int[K][2];

        for(int i=0;i<points.length;i++){
            int val = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);
            hash.put(i, val);
        }
        List<Integer> arr = new ArrayList<Integer>(hash.keySet());
        Collections.sort(arr, (w1, w2)-> hash.get(w1)-hash.get(w2));

        for(int i =0;i<K;i++){
            res[i][0] = points[arr.get(i)][0];
            res[i][1] = points[arr.get(i)][1];
        }

        return res;
    }
}
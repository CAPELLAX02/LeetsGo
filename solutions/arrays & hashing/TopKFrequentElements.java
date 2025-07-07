import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = { 1,1,1,2,2,3 };
        int[] res = topKFrequent(nums, 2);
        System.out.println(Arrays.toString(res)); // [1, 2]
    }

    static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key :  freqMap.keySet()) {
            int freq = freqMap.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        List<Integer> res = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && res.size() < k; i--) {
            if (bucket[i] != null) {
                res.addAll(bucket[i]);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}

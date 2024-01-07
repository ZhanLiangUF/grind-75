import java.util.HashMap;
import java.util.Map;

public class majorityelement {
  public int majorityElement(int[] nums) {
    int count = 0;
    int candidate = 0;

    for (int num: nums) {
        if (count == 0) {
            candidate = num;
        }

        if (num == candidate) {
            count++;
        } else {
            count--;
        }
    }
    return candidate;
}

    public int majorityElement2(int[] nums) {
        int majority = nums.length/2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int x: nums) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > majority) {
                return entry.getKey();
            }
        }
        return -1;
    }
}

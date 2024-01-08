import java.util.HashMap;
import java.util.HashSet;

public class containsduplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<Integer, Integer>();
        for (int num: nums) {
            if (seen.containsKey(num)) {
                return true;
            }
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }
  }


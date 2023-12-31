public class binarysearch {
  public int search(int[] nums, int target) {
    int l = 0;
    int r = nums.length-1;
    while (l <= r) {
        int m = l + (r-l)/2;
        if (nums[m] == target) {
            return m;
        }
        if (nums[m] > target) {
            r = r-1;
        } else if (nums[m] < target) {
            l = l + 1;
        }
    }
    return -1;
}
}

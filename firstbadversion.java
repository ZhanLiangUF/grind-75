public class firstbadversion {
  boolean isBadVersion(int version) {
    return true;
  }
  
  public int firstBadVersion(int n) {
    int start = 1;
    int end = n;
    while (start <= end) {

        int m = start + (end-start)/2;
        System.out.println(m);
        if (isBadVersion(m)) {
            end = m - 1;
        } else {
            start = m + 1;
        }
    }
    return start;
}
}

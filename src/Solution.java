import java.util.*;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        // Time: O(n) because theres a for loop
        // Space: O(n) because worst space is all the values
        //   in the arrays get put inside the map

        Set<Integer> set = new HashSet<>();

        for (int num: nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }

}

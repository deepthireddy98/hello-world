import java.util.*;
public class RemoveDuplicatesFromSortedArray {

    /**
     * Two Pointers.
     * Use the length of the distinct elements as a pointer to the next position to be filled.
     * For each number n in nums:
     * | If length is 0 or n != nums[length - 1]:
     * |   Update nums[length] to n. Increment length by 1.
     * Return length.
     */
    public int removeDuplicates(int[] nums) {
        int len = 0;
        for (int n : nums) {
            if (len == 0 || n != nums[len - 1]) {
                nums[len++] = n;
            }
        }
        return len;
    }

    public int removeDuplicates2(int[] nums) {
        int len = 1;
        for (int i = 1, j = i; i < nums.length; i = j) {
            while (j < nums.length && nums[j] == nums[len - 1]) {
                j++;
            }
            if (j < nums.length) {
                nums[len] = nums[j];
                len++;
            }
        }
        return len;
    }
}

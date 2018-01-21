import java.util.*;
class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicates r = new RemoveDuplicates();
        int[] A = { 1, 1, 2, 2, 3 };
        System.out.println(r.removeDup(A));
    }
    
    /**
     * Use count to remember current position 
     */
    public int removeDupStandard(int[] A) {
        int count = 0;
        int len = A.length;
        for (int i = 0; i < len; i++) {
            if (count == 0 || A[i] != A[count - 1]) { // first or not dup
                A[count++] = A[i]; // copy and update count
            }
        }
        return count;
    }
    
    /**
     * use two pointers, one in the front, one for the dups
     */
    public static int removeDup(int[] A) {
        int i = 0;
        int j = 0;
        int pos = i + 1; // record current position
        while (i < A.length) {
            j = i + 1;
            while (j < A.length && A[i] == A[j]) {
                j++;
            }
            if (j >= A.length) break; // out of range
            A[pos] = A[j];
            pos++;
            i = j;
        }
        return pos;
    }
}

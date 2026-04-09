import java.util.*;

class Solution {
    
    public static void pb(ArrayDeque<Integer> dq, int x) {
        dq.addLast(x);   // push back
    }

    public static void ppb(ArrayDeque<Integer> dq) {
        if (!dq.isEmpty()) {
            dq.removeLast();   // pop back
        }
    }

    public static int front_dq(ArrayDeque<Integer> dq) {
        if (dq.isEmpty()) {
            return -1;
        }
        return dq.peekFirst();   // get front
    }

    public static void pf(ArrayDeque<Integer> dq, int x) {
        dq.addFirst(x);   // push front
    }
}
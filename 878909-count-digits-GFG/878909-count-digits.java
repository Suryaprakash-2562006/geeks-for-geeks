//Back-end complete function Template for Java
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        
        while(num>0)
        {
            int n = num % 10;
            count++;
            num/=10;
        }
        
        System.out.print(count);
    }
}
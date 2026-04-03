# [Count pair sum](https://www.geeksforgeeks.org/problems/count-pair-sum5956/1)
## Easy
Given two sorted arrays arr1 and arr2 of distinct elements. Given a value x. The problem is to count all pairs from both arrays whose sum equals x.Note: The pair has an element from each array.
Examples:
Input: x = 10, arr1[] = [1, 3, 5, 7], arr2[] = [2, 3, 5, 8] 
Output: 2
Explanation: The pairs are: (5, 5) and (7, 3).  
Input: x = 5, arr1[] = [1, 2, 3, 4], arr2[] = [5, 6, 7, 8]
Output: 0Explanation: There are no valid pairs.
Expected Time Complexity: O(n+m).Expected Auxiliary Space: O(1).
Constraints:1 ≤ x ≤ 1091 ≤ arr1.size(), arr2.size() ≤ 1061 ≤ arr1[i], arr2[i] ≤ 106
# [Palindrome Array](https://www.geeksforgeeks.org/problems/perfect-arrays4645/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=submissions)
## Easy
Given an array arr, the task is to find whether the arr is&nbsp;palindrome or not.&nbsp;If the&nbsp;arr&nbsp;is palindrome then return&nbsp;true&nbsp;else return false.

An array is said to be&nbsp;palindrome if its reverse array matches the original array.&nbsp;

Examples:
Input: arr = [1, 2, 3, 2, 1]
Output: true
Explanation: Here we can see we have [1, 2, 3, 2, 1] if we reverse it we can find [1, 2, 3, 2, 1] which is the same as before. So, the answer is true.

Input: arr = [1, 2, 3, 4, 5]
Output: falseExplanation: Here we can see we have [1, 2, 3, 4, 5] if we reverse it we find [5, 4, 3, 2, 1] which is the not same as before. So, the answer false.
Expected Time Complexity: O(n)Expected Auxiliary Space: O(1)
Constraints:1 ≤ arr.size ≤ 1061 ≤ arr[i] ≤ 109
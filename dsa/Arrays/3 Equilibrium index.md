# Equilibrium index of an array

## Problem Description

You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.

Note:

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.

Problem Constraints
1 <= N <= 105
-105 <= A[i] <= 105

Input Format
First arugment is an array A .

Output Format
Return the equilibrium index of the given array. If no such index is found then return -1.

Example Input
Input 1:
A = [-7, 1, 5, 2, -4, 3, 0]
Input 2:

A = [1, 2, 3]

Example Output
Output 1:
3
Output 2:

-1

Example Explanation
Explanation 1:

| i   | Sum of elements at lower indexes | Sum of elements at higher indexes |
| --- | -------------------------------- | --------------------------------- |
| 0   | 0                                | 7                                 |
| 1   | -7                               | 6                                 |
| 2   | -6                               | 1                                 |
| 3   | -1                               | -1                                |
| 6   | 0                                | 0                                 |
| 6   | 0                                | 0                                 |
| 6   | 0                                | 0                                 |
| 4   | 1                                | 3                                 |
| 5   | -3                               | 0                                 |

3 is an equilibrium index, because:
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
Explanation 1:

i Sum of elements at lower indexes Sum of elements at higher indexes
0 0 5
1 1 3
2 3 0
Thus, there is no such index.

Expected Output
Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases

### Solutions

### Appraoch 1:

brute force method

1. for each element claiculate the sum of left and right and compare

#### Time complexity: o(n^2)

#### Space Complexity: O(1)

### Appraoch 2

#### Observation

1. As the sum calications for each is element is repeatedly includes the caliculations of the same number + adding or removing element from left and right sum
1. Calicate the prefix sum
1. for each element caliculate the sum of left and right and compare

#### code

```java
public class Solution {
    public int solve(int[] A) {
        int n=A.length;
        int result=-1;
        int leftSum=0;
        int rightSum=0;

        for(int i=0;i<n;i++){
            rightSum+=A[i];
        }
        for(int i=0;i<n;i++){
            rightSum-=A[i];
            if(leftSum==rightSum){
                return i;
            }
                leftSum+=A[i];
        }

        return -1;
    }
}

```

#### TimeComplexity: O(n + n) => O(n)

#### SpaceComplexity: O(n) for prefix array

### Apprach 3

Observations:

1. as the right sum can be derived from the total sum - leftsum - current element
1. Caliculate the total Sum by traversing through an array
1. initialze the leftsum = 0
1. to find whether the current index is Equilibrium index or not
   1. check total sum - leftsum - current element
1. as the index moves further add the current element to the left sum.

```java
public class Solution {
    public int solve(int[] A) {
        int n=A.length;
        int totalSum = 0;
        int leftSum = 0;
        for(int i=0;i<n;i++){
            totalSum += A[i];
        }

        for(int i=0;i<n;i++){
            int rightSum = totalSum - leftSum - A[i];
            if(leftSum == rightSum) return i;
            leftSum += A[i];
        }

        return -1;
    }
}

```

#### TimeComplexity : o(n + n) => O(n)

#### SpaceComplexity : o(1)

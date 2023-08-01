# First Missing Integer

## Problem Description
Given an unsorted integer array, A of size N. Find the first missing positive integer.

Note: Your algorithm should run in O(n) time and use constant space.



### Problem Constraints
``` 1 <= N <= 1000000

-109 <= A[i] <= 109
```



### Input Format
First argument is an integer array A.



### Output Format
Return an integer denoting the first missing positive integer.



###Example Input
```
Input 1:

[1, 2, 0]
Input 2:

[3, 4, -1, 1]
Input 3:

[-8, -7, -6]


Example Output
Output 1:

3
Output 2:

2
Output 3:

1
```


###Example Explanation
```
Explanation 1:

A = [1, 2, 0]
First positive integer missing from the array is 3.
```

## solution

#### Appraach 1 - using bruteforce search 

#### Appraoach 2 - using hash set 
```java
public class Solution {
    public int firstMissingPositive(int[] A) {
        int n=A.length;
        HashSet<Integer> set = new HashSet<>();
        for(int x: A){
            set.add(x);
        }
        int missing =1;
        while(set.contains(missing)){
            missing++;
        }
        return missing;
        
    }
}
```

### Approach 3 : using the fact that the missing possitive number lies between 1 and N

1. place all the elements in the right index 
1. traverse again and check whether they are in  the right position  of not.
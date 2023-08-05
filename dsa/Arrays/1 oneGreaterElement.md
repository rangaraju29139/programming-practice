## problem statement:

Given n array elements , find the number of elements having atleast one element greate than itself.

## solution

### Approach 1:

using the bruteforce apprach , for each number find it has any element greater than itself.

#### time complexity : o(n^2)

#### Space complexity : o(1)

### Approach 2:

##### Observations:

1. For maximum number there will no element which is greater than itself.
1. find the max element.
1. find how many such max elements are present in the array.
1. subtract max count from total , you can get the number of elements which have atleast one element greater than itsel -> n-max count

#### TimeComplexity: O(n+ n) => O(n)

#### Space complexity: O(1)

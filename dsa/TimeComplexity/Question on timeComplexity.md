### Question time complexity of below code

```java
for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j+=i){
        //some o(1) code
    }
}

```

<!-- #### Solution: nlogn -->

#### Explination:

| i   | j           | number of iterations |
| --- | ----------- | -------------------- |
| 1   | 1 2 3 4...  | n                    |
| 2   | 1 3 5 7 ... | n/2                  |
| 3   | 1 4 7...    | n/3                  |
| ..  | ...         | ...                  |
| n   | 1           | n/n = 1              |

n(1 + 1/2 + 1/3 + 1/4 ...) = (approximately) n\* logn

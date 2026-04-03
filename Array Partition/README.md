# 561. Array Partition

## 🟢 Easy

### 📌 Problem
Given an integer array nums of 2n integers, group these integers into n pairs such that the sum of min(ai, bi) for all i is maximized.

### 💡 Approach
- Sort the array
- Take elements at even indices (0, 2, 4...)
- These represent the minimums of each pair

### ⏱️ Complexity
- Time: O(n log n)
- Space: O(1)

### ✅ Solution
```java
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}

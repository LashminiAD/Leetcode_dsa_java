class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;   //  If number is 0 or negative → not a power of 2

        return (n & (n-1)) == 0;
    }
}

/*         🔥 Magic Trick: n & (n - 1)

         👉 This operation removes the last set (1) bit

         ✅ Example: n = 8
         n     = 1000
         n - 1 = 0111
         ----------------
         &     = 0000 ✅        ✔ Result is 0 → only one '1' present   👉 So it is a power of 2

         ❌ Example: n = 6
         n     = 110
         n - 1 = 101
         ----------------
         &     = 100 ❌        ✔ Not zero → more than one '1'  👉 Not a power of 2   */

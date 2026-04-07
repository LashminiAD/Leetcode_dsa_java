1572. Matrix Diagonal Sum
Problem

Given a square matrix mat, return the sum of the matrix diagonals.

Include all elements from the primary diagonal
Include all elements from the secondary diagonal
Do not double count the middle element (if n is odd)
🧠 Approach
Traverse the matrix using a single loop
Add:
mat[i][i] → Primary diagonal
mat[i][n - i - 1] → Secondary diagonal
If n is odd:
Subtract the middle element (mat[n / 2][n / 2])
🚀 Solution
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += mat[i][i];           // primary diagonal
            sum += mat[i][n - i - 1];   // secondary diagonal
        }

        // Remove duplicate center element
        if(n % 2 == 1){
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }
}
🔍 Example
Input
mat = [
 [1,2,3],
 [4,5,6],
 [7,8,9]
]
Output
25
Explanation

Primary diagonal → 1 + 5 + 9 = 15
Secondary diagonal → 3 + 5 + 7 = 15
Total = 30
Middle element counted twice → subtract 5

Final Answer = 25

⏱️ Complexity
Time Complexity: O(n)
Space Complexity: O(1)
🏷️ Tags
Array
Matrix
🌟 Key Takeaways
Use a single loop for both diagonals
Handle the center element carefully
Optimal solution with constant space

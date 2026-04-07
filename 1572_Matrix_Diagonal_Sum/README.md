<h2><a href="https://leetcode.com/problems/matrix-diagonal-sum">1572. Matrix Diagonal Sum</a></h2><h3>Easy</h3><hr><p>Given a square matrix <code>mat</code>, return the sum of the matrix diagonals.</p>

<p>Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
<strong>Output:</strong> 25
<strong>Explanation:</strong> Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
<strong>Output:</strong> 8
</pre>

<p><strong class="example">Example 3:</strong></p>
<pre><strong>Input:</strong> mat = [[5]]
<strong>Output:</strong> 5
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == mat.length == mat[i].length</code></li>
	<li><code>1 &lt;= n &lt;= 100</code></li>
	<li><code>1 &lt;= mat[i][j] &lt;= 100</code></li>
</ul>

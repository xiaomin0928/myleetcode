<p>Given an <code>m x n</code> <code>matrix</code>, return <em>all elements of the</em> <code>matrix</code> <em>in spiral order</em>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/13/spiral1.jpg" style="width: 242px; height: 242px;" />
<pre>
<strong>Input:</strong> matrix = [[1,2,3],[4,5,6],[7,8,9]]
<strong>Output:</strong> [1,2,3,6,9,8,7,4,5]
</pre>

<p><strong>Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/13/spiral.jpg" style="width: 322px; height: 242px;" />
<pre>
<strong>Input:</strong> matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
<strong>Output:</strong> [1,2,3,4,8,12,11,10,9,5,6,7]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>m == matrix.length</code></li>
	<li><code>n == matrix[i].length</code></li>
	<li><code>1 &lt;= m, n &lt;= 10</code></li>
	<li><code>-100 &lt;= matrix[i][j] &lt;= 100</code></li>
</ul>
<div><div>Related Topics</div><div><li>数组</li><li>矩阵</li><li>模拟</li></div></div><br><div><li>👍 1147</li><li>👎 0</li></div>

<div>
<p>solution 1</p>
和59题的思路类似，每次遍历一条边。
与59.螺旋矩阵II不同的是：前题中的螺旋矩阵是正方形，只有正方形的边长n一个边界条件，而本题中，需要考虑长方形的长和宽(m行和n列)两个边界条件。
<ul>
<li>
loop的计算： 本题的loop计算与59.螺旋矩阵II算法略微差异，因为存在rows和columns两个维度，可自行分析，loop只能取min(rows, columns)/2，例如rows = 5, columns = 7，那loop = 5 / 7 = 2
</li>
<li>
mid的计算及填充： 
<ul>1.同样的原理，本题的mid计算也存在上述差异，mid = min(rows,columns)/2；</ul> 
<ul>2. 如果min(rows, columns)为偶数(min(rows,columns)%2 == 0)，则不需要在最后单独考虑矩阵最中间位置的赋值；如果min(rows, columns)为奇数，则矩阵最中间位置不只是[mid][mid],而是会留下来一个特殊的中间行或者中间列，如果rows > columns,则是中间列，相反，则是中间行</ul>
</li>
<li>
遍历每条边的边界条件，startx,starty分别作为列和行的起始点，offset从1开始，每次loop结束后，offest+2,startx+1,starty+1,向内层遍历。
</li>
</ul>
<p>solution 2</p>
先计算所有要遍历的节点，len = rows * columns,按照指令来遍历，flag = right，right->down->left->up, 如果index i,j超过了rows，columns或者是下一个元素已经被遍历过，则flag标记为下一个指令，每次循环之后 matrix[i][j] 标记为已遍历，len--。
</div>
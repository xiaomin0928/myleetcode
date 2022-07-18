<p>Given a positive integer <code>n</code>, generate an <code>n x n</code> <code>matrix</code> filled with elements from <code>1</code> to <code>n<sup>2</sup></code> in spiral order.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/13/spiraln.jpg" style="width: 242px; height: 242px;" />
<pre>
<strong>Input:</strong> n = 3
<strong>Output:</strong> [[1,2,3],[8,9,4],[7,6,5]]
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> n = 1
<strong>Output:</strong> [[1]]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 20</code></li>
</ul>
<div><div>Related Topics</div><div><li>数组</li><li>矩阵</li><li>模拟</li></div></div><br><div><li>👍 765</li><li>👎 0</li></div>
<p></p>
<div>螺旋矩阵</div>

模拟顺时针画矩阵的过程:
<ul>
<li>填充上行从左到右</li>
<li>填充右列从上到下</li>
<li>填充下行从右到左</li>
<li>填充左列从下到上</li>
</ul>
由外向内一圈一圈这么画下去，并且遵循左闭右开的原则。

根据example 1，画1->2,3->4,5->6,7->8,9最后画，每个拐角点都让给新的一条边来画。
n%2 == 1，画中心点。
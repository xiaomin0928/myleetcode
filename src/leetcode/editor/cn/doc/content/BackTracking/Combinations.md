<p>Given two integers <code>n</code> and <code>k</code>, return <em>all possible combinations of</em> <code>k</code> <em>numbers chosen from the range</em> <code>[1, n]</code>.</p>

<p>You may return the answer in <strong>any order</strong>.</p>

<p>&nbsp;</p> 
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> n = 4, k = 2
<strong>Output:</strong> [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
<strong>Explanation:</strong> There are 4 choose 2 = 6 total combinations.
Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> n = 1, k = 1
<strong>Output:</strong> [[1]]
<strong>Explanation:</strong> There is 1 choose 1 = 1 total combination.
</pre>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>1 &lt;= n &lt;= 20</code></li> 
 <li><code>1 &lt;= k &lt;= n</code></li> 
</ul>

<div><div>Related Topics</div><div><li>回溯</li></div></div><br><div><li>👍 1088</li><li>👎 0</li></div>

#### 解题思路
组合
<ul>
 <li>回溯算法</li>
 <li>参数：n, k, startIndex</li>
 <li>结束条件：单个结果集item的size等于k，此时将item加入res，注意：res.add(new ArrayList<>(item))</li>
 <li>for循环中i从startIndex开始，剪枝：i <= n - (k - item.size), 总个数-仍需要的数字个数，保证剩余的个数充足</li>
 <li>item.add(i);backTracking(n,k,i+1);item.remove(item.size()-1),去掉最后一个元素</li>
 <li>for循环横向展开，递归函数深度遍历</li>
</ul>
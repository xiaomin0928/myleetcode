<p>Find all valid combinations of <code>k</code> numbers that sum up to <code>n</code> such that the following conditions are true:</p>

<ul> 
 <li>Only numbers <code>1</code> through <code>9</code> are used.</li> 
 <li>Each number is used <strong>at most once</strong>.</li> 
</ul>

<p>Return <em>a list of all possible valid combinations</em>. The list must not contain the same combination twice, and the combinations may be returned in any order.</p>

<p>&nbsp;</p> 
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> k = 3, n = 7
<strong>Output:</strong> [[1,2,4]]
<strong>Explanation:</strong>
1 + 2 + 4 = 7
There are no other valid combinations.</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> k = 3, n = 9
<strong>Output:</strong> [[1,2,6],[1,3,5],[2,3,4]]
<strong>Explanation:</strong>
1 + 2 + 6 = 9
1 + 3 + 5 = 9
2 + 3 + 4 = 9
There are no other valid combinations.
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> k = 4, n = 1
<strong>Output:</strong> []
<strong>Explanation:</strong> There are no valid combinations.
Using 4 different numbers in the range [1,9], the smallest sum we can get is 1+2+3+4 = 10 and since 10 &gt; 1, there are no valid combination.
</pre>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>2 &lt;= k &lt;= 9</code></li> 
 <li><code>1 &lt;= n &lt;= 60</code></li> 
</ul>

<div><div>Related Topics</div><div><li>数组</li><li>回溯</li></div></div><br><div><li>👍 523</li><li>👎 0</li></div>


#### 解题思路
几数之和的组合问题(指定数字范围1-9)
<ul>
 <li>回溯算法</li>
 <li>参数：TargetSum, k, startIndex</li>
 <li>结束条件：单个结果集item的size等于k，sum == targetSum 时将item加入res，注意：res.add(new ArrayList<>(item))</li>
 <li>for循环中i从startIndex开始，剪枝：i <= n - (k - item.size), 总个数-仍需要的数字个数，保证剩余的个数充足</li>
 <li>sum += i，item.add(i);递归：backTracking(n,k,sum,i+1);回溯：item.remove(item.size()-1)，sum -= i</li>
 <li>for循环横向展开，递归函数深度遍历</li>
 <li>注意n,k参数的含义</li>
</ul>
<p>Given the <code>root</code> of a&nbsp;binary tree, return <em>the postorder traversal of its nodes' values</em>.</p>

<p>&nbsp;</p> 
<p><strong>Example 1:</strong></p> 
<img alt="" src="https://assets.leetcode.com/uploads/2020/08/28/pre1.jpg" style="width: 127px; height: 200px;" /> 
<pre>
<strong>Input:</strong> root = [1,null,2,3]
<strong>Output:</strong> [3,2,1]
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> root = []
<strong>Output:</strong> []
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> root = [1]
<strong>Output:</strong> [1]
</pre>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li>The number of the nodes in the tree is in the range <code>[0, 100]</code>.</li> 
 <li><code>-100 &lt;= Node.val &lt;= 100</code></li> 
</ul>

<p>&nbsp;</p> 
<strong>Follow up:</strong> Recursive solution is trivial, could you do it iteratively?

<div><div>Related Topics</div><div><li>栈</li><li>树</li><li>深度优先搜索</li><li>二叉树</li></div></div><br><div><li>👍 900</li><li>👎 0</li></div>

#### 解题思路
后序遍历
方法1：递归
<ul>
 <li>遍历左节点，遍历右节点，取root的值</li>
</ul>
方法2：迭代
<ul>
 <li>使用栈进行迭代(节点的入栈顺序和遍历顺序相反，root右左)</li>
 <li>root不为空时，入栈</li>
 <li>取出栈顶元素，如果该元素不为空，则进行处理：root节点入栈，并在root节点后加上null节点标记root节点未被处理，右节点入栈，左节点入栈</li>
 <li>如果该元素为空，说明是标记节点，pop(null),然后pop(node),最后将node的值放入结果集</li>
</ul>
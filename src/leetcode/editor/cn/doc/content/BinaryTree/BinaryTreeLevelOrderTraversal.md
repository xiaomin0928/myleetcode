<p>Given the <code>root</code> of a binary tree, return <em>the level order traversal of its nodes' values</em>. (i.e., from left to right, level by level).</p>

<p>&nbsp;</p> 
<p><strong>Example 1:</strong></p> 
<img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/tree1.jpg" style="width: 277px; height: 302px;" /> 
<pre>
<strong>Input:</strong> root = [3,9,20,null,null,15,7]
<strong>Output:</strong> [[3],[9,20],[15,7]]
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> root = [1]
<strong>Output:</strong> [[1]]
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> root = []
<strong>Output:</strong> []
</pre>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li>The number of nodes in the tree is in the range <code>[0, 2000]</code>.</li> 
 <li><code>-1000 &lt;= Node.val &lt;= 1000</code></li> 
</ul>

<div><div>Related Topics</div><div><li>树</li><li>广度优先搜索</li><li>二叉树</li></div></div><br><div><li>👍 1424</li><li>👎 0</li></div>

#### 解题思路
层次
方法1：递归
<ul>
 <li>递归函数的参数：root,deep</li>
 <li>首先deep++,如果deep 大于 res.size，构造新的结果层，将root的值放入deep-1对应的结果层中</li>
 <li>使用递归函数遍历root.left,root.right</li>
</ul>

方法2：迭代
<ul>
 <li>使用队列，同一层的元素进入队列，一边将这些元素出队，一边将他们的左右孩子出队</li>
 <li>首先将root入队，新建该层的结果集，获取当前que的长度（队列中元素的个数），将这些元素出队，并且将他们的左右孩子入队</li>
 <li>遍历完一层，将这一层的结果加入res</li>
 <li></li>
</ul>
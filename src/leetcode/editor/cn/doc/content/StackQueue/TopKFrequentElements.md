<p>Given an integer array <code>nums</code> and an integer <code>k</code>, return <em>the</em> <code>k</code> <em>most frequent elements</em>. You may return the answer in <strong>any order</strong>.</p>

<p>&nbsp;</p> 
<p><strong>Example 1:</strong></p> 
<pre><strong>Input:</strong> nums = [1,1,1,2,2,3], k = 2
<strong>Output:</strong> [1,2]
</pre>
<p><strong>Example 2:</strong></p> 
<pre><strong>Input:</strong> nums = [1], k = 1
<strong>Output:</strong> [1]
</pre> 
<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li> 
 <li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li> 
 <li><code>k</code> is in the range <code>[1, the number of unique elements in the array]</code>.</li> 
 <li>It is <strong>guaranteed</strong> that the answer is <strong>unique</strong>.</li> 
</ul>

<p>&nbsp;</p> 
<p><strong>Follow up:</strong> Your algorithm's time complexity must be better than <code>O(n log n)</code>, where n is the array's size.</p>

<div><div>Related Topics</div><div><li>数组</li><li>哈希表</li><li>分治</li><li>桶排序</li><li>计数</li><li>快速选择</li><li>排序</li><li>堆（优先队列）</li></div></div><br><div><li>👍 1283</li><li>👎 0</li></div>

#### 解题思路
方法1：大顶堆
大顶堆：父节点的值大于左右孩子，root存放最大值，pop的结果是降序排列
<ul> 
 <li>先构建map<num,frequency></li>
 <li>然后构建大顶堆：PriorityQueue<Map.Entry<Integer,Integer>> que = new PriorityQueue<>((o1,o2) -> o2.getValue()-o1.getValue());</li>
 <li>将map中的元素Map.Entry<Integer,Integer>放入大顶堆中:que.offer</li>
 <li>将前k个元素放入结果集</li>
</ul>

方法2：小顶堆
大顶堆：父节点的值小于左右孩子，root存放最小值，pop的结果是升序排列
<ul> 
 <li>先构建map<num,frequency></li>
 <li>然后构建大顶堆：PriorityQueue<Map.Entry<Integer,Integer>> que = new PriorityQueue<>((o1,o2) -> o2.getValue()-o1.getValue());</li>
 <li>将前k个元素放入小顶堆，第k个元素加入堆的时进行检测：k元素的值大于que.peek(),先poll堆顶元素，然后k元素入堆，否则k元素不入堆</li>
 <li>将que中的元素放入结果集中，注意逆序遍历</li>
</ul>
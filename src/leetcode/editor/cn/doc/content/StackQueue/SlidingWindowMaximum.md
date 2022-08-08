<p>You are given an array of integers&nbsp;<code>nums</code>, there is a sliding window of size <code>k</code> which is moving from the very left of the array to the very right. You can only see the <code>k</code> numbers in the window. Each time the sliding window moves right by one position.</p>

<p>Return <em>the max sliding window</em>.</p>

<p>&nbsp;</p> 
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,3,-1,-3,5,3,6,7], k = 3
<strong>Output:</strong> [3,3,5,5,6,7]
<strong>Explanation:</strong> 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       <strong>3</strong>
 1 [3  -1  -3] 5  3  6  7       <strong>3</strong>
 1  3 [-1  -3  5] 3  6  7      <strong> 5</strong>
 1  3  -1 [-3  5  3] 6  7       <strong>5</strong>
 1  3  -1  -3 [5  3  6] 7       <strong>6</strong>
 1  3  -1  -3  5 [3  6  7]      <strong>7</strong>
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1], k = 1
<strong>Output:</strong> [1]
</pre>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li> 
 <li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li> 
 <li><code>1 &lt;= k &lt;= nums.length</code></li> 
</ul>

<div><div>Related Topics</div><div><li>队列</li><li>数组</li><li>滑动窗口</li><li>单调队列</li><li>堆（优先队列）</li></div></div><br><div><li>👍 1773</li><li>👎 0</li></div>

#### 解题思路
使用单调队列，保持队列单调递减，每次弹出队列的队首元素，即最大值  
方法1
<ul>
<li>单调队列里存放nums的index，保持nums[index]是单调递减</li>
<li>确保队首元素的下标在[i-k+1,i],que.peekFirst > i-k+1的时候，que.pollFirst</li>
<li>确保nums[index]是单调递减,nums[que.peekLast] < nums[i],que.popLast</li>
<li>当i>=k-1的时候，将队首元素保存到结果集</li>
</ul>
方法2
<ul>
<li>自定义Myque,pop:如果队首元素和需要pop的值相等，则pop</li>
<li>push：如果队尾元素 小于 需要加入的元素，则先pop队尾元素，直到队尾元素 大于 需要加入的元素或者队为空，然后加入元素</li>
<li>首先将前k个元素加入队列，将队首元素放入结果集，然后从第k个元素开始，移动窗口，pop nums[i-k]，push[i],将队首元素放入结果集</li>
</ul>
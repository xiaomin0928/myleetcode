<p>Write an algorithm to determine if a number <code>n</code> is happy.</p>

<p>A <strong>happy number</strong> is a number defined by the following process:</p>

<ul> 
 <li>Starting with any positive integer, replace the number by the sum of the squares of its digits.</li> 
 <li>Repeat the process until the number equals 1 (where it will stay), or it <strong>loops endlessly in a cycle</strong> which does not include 1.</li> 
 <li>Those numbers for which this process <strong>ends in 1</strong> are happy.</li> 
</ul>

<p>Return <code>true</code> <em>if</em> <code>n</code> <em>is a happy number, and</em> <code>false</code> <em>if not</em>.</p>

<p>&nbsp;</p> 
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> n = 19
<strong>Output:</strong> true
<strong>Explanation:</strong>
1<sup>2</sup> + 9<sup>2</sup> = 82
8<sup>2</sup> + 2<sup>2</sup> = 68
6<sup>2</sup> + 8<sup>2</sup> = 100
1<sup>2</sup> + 0<sup>2</sup> + 0<sup>2</sup> = 1
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> n = 2
<strong>Output:</strong> false
</pre>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>1 &lt;= n &lt;= 2<sup>31</sup> - 1</code></li> 
</ul>

<div><div>Related Topics</div><div><li>哈希表</li><li>数学</li><li>双指针</li></div></div><br><div><li>👍 994</li><li>👎 0</li></div>

#### 解题思路
<ul> 
<li>getSum(n)函数：求出n每个位置上数字的平方和，sum +=(n%10)*(n%10); n /= 10</li>
<li>循环求和判断，如果sum == 1,是快乐数，如果sum已经出现过： set.contains(sum)，不是快乐数；如果没有出现过，则把sum放入到set中，set.add(sum)</li>
<li>注意：每次循环后，n = sum</li>
</ul>
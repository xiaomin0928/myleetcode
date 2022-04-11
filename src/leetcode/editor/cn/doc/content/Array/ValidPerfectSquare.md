<p>Given a <strong>positive</strong> integer <i>num</i>, write a function which returns True if <i>num</i> is a perfect square else False.</p>

<p><b>Follow up:</b> <b>Do not</b> use any built-in library function such as <code>sqrt</code>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<pre><strong>Input:</strong> num = 16
<strong>Output:</strong> true
</pre><p><strong>Example 2:</strong></p>
<pre><strong>Input:</strong> num = 14
<strong>Output:</strong> false
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= num &lt;= 2^31 - 1</code></li>
</ul>
<div><div>Related Topics</div><div><li>数学</li><li>二分查找</li></div></div><br><div><li>👍 369</li><li>👎 0</li></div>
<p></p>
<div>完全平方数的要求middle == num/middle and num%middle == 0,注意middle == num/middle时，left = middle + 1</div>
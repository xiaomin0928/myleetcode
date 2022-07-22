<p>Given two strings <code>s</code> and <code>t</code>, return <code>true</code> <em>if</em> <code>t</code> <em>is an anagram of</em> <code>s</code><em>, and</em> <code>false</code> <em>otherwise</em>.</p>

<p>An <strong>Anagram</strong> is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.</p>

<p>&nbsp;</p> 
<p><strong>Example 1:</strong></p> 
<pre><strong>Input:</strong> s = "anagram", t = "nagaram"
<strong>Output:</strong> true
</pre>
<p><strong>Example 2:</strong></p> 
<pre><strong>Input:</strong> s = "rat", t = "car"
<strong>Output:</strong> false
</pre> 
<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>1 &lt;= s.length, t.length &lt;= 5 * 10<sup>4</sup></code></li> 
 <li><code>s</code> and <code>t</code> consist of lowercase English letters.</li> 
</ul>

<p>&nbsp;</p> 
<p><strong>Follow up:</strong> What if the inputs contain Unicode characters? How would you adapt your solution to such a case?</p>

<div><div>Related Topics</div><div><li>哈希表</li><li>字符串</li><li>排序</li></div></div><br><div><li>👍 619</li><li>👎 0</li></div>

#### 解题思路
方法1：使用Arrays的sort和equals  
<ul>
<li>分别对s,t字符串数组化：s.toCharArray</li>
<li>Arrays.sort()对字符数组排序</li>
<li>Arrays.equals()比较排序后的字符串是否相同</li>
</ul>

方法2：使用hash map  
<ul>
<li>对s字符串数组化：s.toCharArray; 然后将每个字符放入hash map,注意将integer+1</li>
<li>对t字符串数组化：t.toCharArray; 根据char的值去map中获取Integer的值，如果Integer>1,说明该字符出现多次，更改map中的Integer:map.put(),如果Integer==1 or 0,说明该字符最后一次出现或者是没有出现过，则从map中删除，map.remove()</li>
<li>根据map是否为空来判断两个字符串是否为异位词，map.isEmpty()</li>
</ul>

方法3：使用数组记录字符出现的次数
<ul>
<li>分别使用sCounts(int[26])和tCounts(int[26]),记录s,t字符串中字符出现的次数</li>
<li>注意存放字符串时候sCounts的index,char - 'a'</li>
<li>检查sCounts，tCounts中的每个元素是否相等，如果有不相等，返回false</li>
</ul>
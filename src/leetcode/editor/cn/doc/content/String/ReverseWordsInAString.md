<p>Given an input string <code>s</code>, reverse the order of the <strong>words</strong>.</p>

<p>A <strong>word</strong> is defined as a sequence of non-space characters. The <strong>words</strong> in <code>s</code> will be separated by at least one space.</p>

<p>Return <em>a string of the words in reverse order concatenated by a single space.</em></p>

<p><b>Note</b> that <code>s</code> may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.</p>

<p>&nbsp;</p> 
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = "the sky is blue"
<strong>Output:</strong> "blue is sky the"
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = "  hello world  "
<strong>Output:</strong> "world hello"
<strong>Explanation:</strong> Your reversed string should not contain leading or trailing spaces.
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = "a good   example"
<strong>Output:</strong> "example good a"
<strong>Explanation:</strong> You need to reduce multiple spaces between two words to a single space in the reversed string.
</pre>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li> 
 <li><code>s</code> contains English letters (upper-case and lower-case), digits, and spaces <code>' '</code>.</li> 
 <li>There is <strong>at least one</strong> word in <code>s</code>.</li> 
</ul>

<p>&nbsp;</p> 
<p><b data-stringify-type="bold">Follow-up:&nbsp;</b>If the string data type is mutable in your language, can&nbsp;you solve it&nbsp;<b data-stringify-type="bold">in-place</b>&nbsp;with&nbsp;<code data-stringify-type="code">O(1)</code>&nbsp;extra space?</p>

<div><div>Related Topics</div><div><li>双指针</li><li>字符串</li></div></div><br><div><li>👍 602</li><li>👎 0</li></div>

#### 解题思路
方法1：把原有的字符串拷贝到新的字符串中
<ul> 
 <li>定义一个新的char[],newcStr,长度是str.length+1,多一个位置用于保存最后一个空格</li>
 <li>从后向前遍历原来的str, 找到每个单词开始和结束的位置：
     <code>while( i >=0 && cStr[i] == ' ' ) i--;  
           int boundary = i;   
           while( i >= 0 && cStr[i] != ' ' ) i--;  
     </code>
 </li>
 <li>将这个单词放入到newcStr中去，
    <code>for( int j = i + 1; j <= boundary; j++){
                newcStr[k++] = cStr[j];
                if( j == boundary){
                    newcStr[k++] = ' ';
                }
            }
    </code>
 </li>
 <li>注意：返回的结果要把最后的空格去掉，new String(newcStr,0,k-1);</li>
</ul>

方法2：反转字符 + 反转字母 + 去除空格
<ul> 
 <li>反转字符：双指针left,right移动反转</li>
 <li>反转单词：找到单词的起始位置，使用反转字符函数</li>
 <li>去除空格：双指针，fast移动第一个字母处，然后复制到slow处，边移动边复制，每个单词的结尾处增加空格</li>
</ul>
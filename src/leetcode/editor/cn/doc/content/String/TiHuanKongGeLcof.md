<p>English description is not available for the problem. Please switch to Chinese.</p>

<div><div>Related Topics</div><div><li>字符串</li></div></div><br><div><li>👍 319</li><li>👎 0</li></div>

请实现一个函数，把字符串 s 中的每个空格替换成"%20"。

示例 1： 输入：s = "We are happy."
输出："We%20are%20happy."

#### 解题思路
方法1：把原有的字符串拷贝到新的字符串中
<ul> 
 <li>定义一个StringBuffer str</li>
 <li>遍历原来的string, 如果s.charAt(i)是空格，str.append("%20"); 否则加入原来的值</li>
</ul>

方法1：双指针
<ul> 
 <li>首先统计s中的空格数，StringBuffer str中保存两倍数量的空格</li>
 <li>将str连接在原有的s上，用于扩充字符串的长度</li>
 <li>left -> 原来s的末尾(s.length-1); right -> 拼接后的s的末尾;</li>
 <li>同时移动left,right,如果cStr[left]的值是空格，right移动两位并且填充“%20”：cStr[right--] = '0';cStr[right--] = '2';cStr[right] = '%';
     否则，将left对应的值复制给right：cStr[right] = cStr[left]</li>
</ul>
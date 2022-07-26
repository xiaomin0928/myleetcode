<p>English description is not available for the problem. Please switch to Chinese.</p>

<div><div>Related Topics</div><div><li>数学</li><li>双指针</li><li>字符串</li></div></div><br><div><li>👍 274</li><li>👎 0</li></div>

请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。

示例 1：
输入: s = "abcdefg", k = 2
输出: "cdefgab"

示例 2：
输入: s = "lrloseumgh", k = 6
输出: "umghlrlose"

限制：
1 <= k < s.length <= 10000

#### 解题思路
<ul>
 <li>反转前n个字符</li>
 <li>反转剩下的字符</li>
 <li>反转整个字符串</li>
 <li>反转函数：移动首尾指针，交换元素</li>
</ul>

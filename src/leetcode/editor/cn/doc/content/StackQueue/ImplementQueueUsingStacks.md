<p>Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (<code>push</code>, <code>peek</code>, <code>pop</code>, and <code>empty</code>).</p>

<p>Implement the <code>MyQueue</code> class:</p>

<ul> 
 <li><code>void push(int x)</code> Pushes element x to the back of the queue.</li> 
 <li><code>int pop()</code> Removes the element from the front of the queue and returns it.</li> 
 <li><code>int peek()</code> Returns the element at the front of the queue.</li> 
 <li><code>boolean empty()</code> Returns <code>true</code> if the queue is empty, <code>false</code> otherwise.</li> 
</ul>

<p><strong>Notes:</strong></p>

<ul> 
 <li>You must use <strong>only</strong> standard operations of a stack, which means only <code>push to top</code>, <code>peek/pop from top</code>, <code>size</code>, and <code>is empty</code> operations are valid.</li> 
 <li>Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.</li> 
</ul>

<p>&nbsp;</p> 
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input</strong>
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]
<strong>Output</strong>
[null, null, null, 1, 1, false]

<strong>Explanation</strong>
MyQueue myQueue = new MyQueue();
myQueue.push(1); // queue is: [1]
myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
myQueue.peek(); // return 1
myQueue.pop(); // return 1, queue is [2]
myQueue.empty(); // return false
</pre>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>1 &lt;= x &lt;= 9</code></li> 
 <li>At most <code>100</code>&nbsp;calls will be made to <code>push</code>, <code>pop</code>, <code>peek</code>, and <code>empty</code>.</li> 
 <li>All the calls to <code>pop</code> and <code>peek</code> are valid.</li> 
</ul>

<p>&nbsp;</p> 
<p><strong>Follow-up:</strong> Can you implement the queue such that each operation is <strong><a href="https://en.wikipedia.org/wiki/Amortized_analysis" target="_blank">amortized</a></strong> <code>O(1)</code> time complexity? In other words, performing <code>n</code> operations will take overall <code>O(n)</code> time even if one of those operations may take longer.</p>

<div><div>Related Topics</div><div><li>栈</li><li>设计</li><li>队列</li></div></div><br><div><li>👍 716</li><li>👎 0</li></div>

#### 解题思路
<ul> 
 <li>使用两个栈，一个输入栈，一个输出栈</li>
 <li>push:数据放入输入栈</li>
 <li>pop：先检查输出栈是否为空，如果输出栈不为空，输出栈pop，如果输出栈为空，则将输入栈的数据pop，放入到输出栈,然后输出栈pop</li>
 <li>peek:和pop类似</li>
 <li>empty：两个栈都为空的时候，队列为空</li>
</ul>
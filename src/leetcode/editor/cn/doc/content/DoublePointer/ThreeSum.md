<p>Given an integer array nums, return all the triplets <code>[nums[i], nums[j], nums[k]]</code> such that <code>i != j</code>, <code>i != k</code>, and <code>j != k</code>, and <code>nums[i] + nums[j] + nums[k] == 0</code>.</p>

<p>Notice that the solution set must not contain duplicate triplets.</p>

<p>&nbsp;</p> 
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [-1,0,1,2,-1,-4]
<strong>Output:</strong> [[-1,-1,2],[-1,0,1]]
<strong>Explanation:</strong> 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,1,1]
<strong>Output:</strong> []
<strong>Explanation:</strong> The only possible triplet does not sum up to 0.
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,0,0]
<strong>Output:</strong> [[0,0,0]]
<strong>Explanation:</strong> The only possible triplet sums up to 0.
</pre>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>3 &lt;= nums.length &lt;= 3000</code></li> 
 <li><code>-10<sup>5</sup> &lt;= nums[i] &lt;= 10<sup>5</sup></code></li> 
</ul>

<div><div>Related Topics</div><div><li>数组</li><li>双指针</li><li>排序</li></div></div><br><div><li>👍 5023</li><li>👎 0</li></div>

#### 解题思路
<ul> 
 <li>先对nums数组进行排序：Arrays.sort(nums),遍历nums数组，a = i,b = nums[left],c = nums[right];i:遍历index,left = i+1, right = nums.length-1</li> 
 <li>升序排列的数组，nums[i]>0,说明无解</li> 
 <li>对a进行去重：i>0 && nums[i] == nums[i-1], continue跳过</li>
 <li>sum = nums[i] + nums[left] + nums[right],根据sum的值收缩left和right，sum>0,right--;sum<0,left++</li>
 <li>找到sum==0的情况，nums[i]，nums[left]，nums[right]放入result，然后对nums[left],nums[right]去重: right>left && nums[right]==nums[right-1],right--; right>left && nums[left]==nums[left+1],left++</li>
</ul>
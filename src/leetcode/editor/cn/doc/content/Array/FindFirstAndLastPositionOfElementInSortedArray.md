////Given an array of integers nums sorted in non-decreasing order, find the 
////starting and ending position of a given target value. 
////
//// If target is not found in the array, return [-1, -1]. 
////
//// You must write an algorithm with O(log n) runtime complexity. 
////
//// 
//// Example 1: 
//// Input: nums = [5,7,7,8,8,10], target = 8
////Output: [3,4]
//// Example 2: 
//// Input: nums = [5,7,7,8,8,10], target = 6
////Output: [-1,-1]
//// Example 3: 
//// Input: nums = [], target = 0
////Output: [-1,-1]
//// 
//// 
//// Constraints: 
////
//// 
//// 0 <= nums.length <= 10⁵ 
//// -10⁹ <= nums[i] <= 10⁹ 
//// nums is a non-decreasing array. 
//// -10⁹ <= target <= 10⁹ 
//// 
//// Related Topics 数组 二分查找 👍 1602 👎 0
//
//二分查找的变形，先找到middle==target,然后向左右扩散

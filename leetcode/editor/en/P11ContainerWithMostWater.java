//You are given an integer array height of length n. There are n vertical lines 
//drawn such that the two endpoints of the iᵗʰ line are (i, 0) and (i, height[i]).
// 
//
// Find two lines that together with the x-axis form a container, such that the 
//container contains the most water. 
//
// Return the maximum amount of water a container can store. 
//
// Notice that you may not slant the container. 
//
// 
// Example 1: 
//
// 
//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,
//3,7]. In this case, the max area of water (blue section) the container can 
//contain is 49.
// 
//
// Example 2: 
//
// 
//Input: height = [1,1]
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// n == height.length 
// 2 <= n <= 10⁵ 
// 0 <= height[i] <= 10⁴ 
// 
// Related Topics Array Two Pointers Greedy 👍 16537 👎 933

//java:Container With Most Water
public class P11ContainerWithMostWater{
    public static void main(String[] args){
        Solution solution = new P11ContainerWithMostWater().new Solution();
        int[] input = {1,3,2,5,25,24,5};
        int result = solution.maxArea(input);
        System.out.println(result);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {
        int begin = 0;
        int end = height.length -1;
        int max = 0;
        while (begin < end) {
            int high = 0;
            int width = 0;
            width = end - begin;
            if (height[begin] < height[end]) {
                high = height[begin];
                begin = begin + 1;
            } else {
                high = height[end];
                end = end -1;
            }
            int current = high * width;
            if (current > max) {
                max = current;
            }
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
//Leetcode 11 : Container With Most Water
//Topic : Array, Two Pointers, Greedy
package Medium;

class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int res = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l); //height * width 
            res = Math.max(res, area);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }
}

//take the last one height value and the closest height value of the closest to the first one n find the area by width r-l and height min of the heights.
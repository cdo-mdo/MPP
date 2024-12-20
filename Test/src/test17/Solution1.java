package test17;

class Solution1 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (right + left)/2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] nums = {-1, 0, 2, 4, 6, 8};
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.search(nums, 4));
    }
}
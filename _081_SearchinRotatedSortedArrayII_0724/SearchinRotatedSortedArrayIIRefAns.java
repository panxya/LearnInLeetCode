package _081_SearchinRotatedSortedArrayII_0724;

public class SearchinRotatedSortedArrayIIRefAns {
	public static void main(String[] args) {
		int[] nums = { 3, 1 };
		boolean res = search(nums, 9);
		System.out.println(res);
	}

	public static boolean search(int[] nums, int target) {
		int start = 0, end = nums.length - 1, mid = -1;
		while (start <= end) {
			mid = (start + end) / 2;
			if (nums[mid] == target) {
				return true;
			}
			// 右边有序或左边无序
			if (nums[mid] < nums[end] || nums[mid] < nums[start]) {
				if (target > nums[mid] && target <= nums[end]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
				// 左边被排序或右边无序
			} else if (nums[mid] > nums[start] || nums[mid] > nums[end]) {
				if (target < nums[mid] && target >= nums[start]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
				// nums[start] == nums[mid] == nums[end], then shifting
			} else {
				end--;
			}
		}
		return false;
	}
}

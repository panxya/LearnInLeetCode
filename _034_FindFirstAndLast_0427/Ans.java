package _034_FindFirstAndLast_0427;

public class Ans {
	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};
		int target=7; 
		int res[] =  searchRange(nums,target);
//		System.out.println(res[0]);
//		System.out.println(res[1]);
		for(int n :res) {
			System.out.println(n);
		}
	}

	 private static int extremeInsertionIndex(int[] nums, int target, boolean left) {
	        int lo = 0;
	        int hi = nums.length;

	        while (lo < hi) {
	            int mid = (lo + hi) / 2;
	            if (nums[mid] > target || (left && target == nums[mid])) {
	                hi = mid;
	            } else {
	                lo = mid+1;
	            }
	        }

	        return lo;
	    }

	    public static int[] searchRange(int[] nums, int target) {
	        int[] targetRange = {-1, -1};

	        int leftIdx = extremeInsertionIndex(nums, target, true);

	        // assert that `leftIdx` is within the array bounds and that `target`
	        // is actually in `nums`.
	        if (leftIdx == nums.length || nums[leftIdx] != target) {
	            return targetRange;
	        }

	        targetRange[0] = leftIdx;
	        targetRange[1] = extremeInsertionIndex(nums, target, false)-1;

	        return targetRange;
	    }
}

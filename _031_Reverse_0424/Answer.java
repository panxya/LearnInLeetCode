package _031_Reverse_0424;

public class Answer {
	public static void main(String[] args) {
		
	}
	
	public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        //找到第一个不再递增的位置
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
      
        if (i >= 0) {
            int j = nums.length - 1;
          //找到刚好大于 nums[i]的位置
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
      //如果到了最左边，就直接倒置输出
        reverse(nums, i + 1);
    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

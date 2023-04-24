import java.util.Arrays;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = {3, 3, 2, 4};
		int target = 6;
		int[] result = new int[2];
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = j;
					result[1] = i;
				}
			}
		}
		
		System.out.println(Arrays.toString(result));
	}
}

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(new ProductOfArrayExceptSelf().productExceptSelf(new int[]{1,2,3})));
		System.out.println(Arrays.toString(new ProductOfArrayExceptSelf().productExceptSelf2(new int[]{1,2,3})));
	}
	
	
	//算法超时
	public int[] productExceptSelf(int[] nums) {
		int length = nums.length;
		int [] leftProduct = new int[length];
		int [] rightProduct = new int[length];
		int [] result = new int[length];
		for(int i = 0; i < length; i++) {
			leftProduct[i] = 1;
			rightProduct[i] = 1;
		}
		
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < i; j++) {
				leftProduct[i] = leftProduct[i] * nums[j];
			}
			
			for(int k = length -1; k > i; k--) {
				rightProduct[i] = rightProduct[i] * nums[k];
			}
			
			result[i] = leftProduct[i] * rightProduct[i];
		}
		
		return result;
	}
	
	//最优算法
	public int[] productExceptSelf2(int [] nums) {
		int length = nums.length;
		int [] result = new int [length];
		
		result[0] = 1;
		for(int i = 1; i < length; i++){
			result[i] = nums[i-1] * result[i -1];
		}
		int right = 1;
		for(int i = length -1; i >=0; i--) {
			result[i] *= right;
			right *= nums[i];
		}
		
		return result;
	}

}

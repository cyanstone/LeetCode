package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author CyanStone
 * 计算一个数组某个元素除了自己以外所有元素的乘积
 */
public class ProductExceptItself {
     public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = scanner.nextInt();
		int[] array = new int[cnt];
		for(int i = 0; i < cnt; i++) {
			array[i] = scanner.nextInt();
		}
		product(array);
	}
     
     public static void product(int[] array) {
    	 int length = array.length;
    	 int [] leftProduct = new int[length];
    	 int [] rightProduct = new int[length];
    	 for(int i = 0; i < length; i++) {
    		 leftProduct[i] = 1;
    		 rightProduct[i] = 1;
    	 }
    	 int [] result = new int[length];
    	 for(int i = 0; i < length; i++) {
    		 for(int j = 0; j < i; j++) {
    			 leftProduct[i] = leftProduct[i] * array[j];
    		 }
    		 for(int k = length -1; k > i; k--) {
    			 rightProduct[i] = rightProduct[i] * array[k];
    		 }
    		 
    		 result[i] = leftProduct[i] * rightProduct[i];
    	 }
    	 
    	 System.out.println(Arrays.toString(result));
      }
     
}

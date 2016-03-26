import java.util.Arrays;
import java.util.Scanner;

public class CountingBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(new CountingBits().countBits(new Scanner(System.in).nextInt())));
	}

	public int[] countBits(int num) {
		int[] result = new int[num + 1];
		for(int i = 0; i <= num; i++){
			int count = 0;
			int t = i;
			while(t != 0) {
				t = t & (t-1);
				count++;
			}
			result[i] = count;
		}
		return result;
	}
}

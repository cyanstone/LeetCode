import java.util.Scanner;


public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
			int i = new Scanner(System.in).nextInt();
			System.out.println(new PowerOfTwo().
					isPowerOfTwo(i));
			System.out.println(new PowerOfTwo().
					isPowerOfTwo2(i));
			System.out.println(new PowerOfTwo().
					isPowerOfTwo3(i));
		}
	}
	
	
	/*
	 * 递归，适用于所有判定是否是幂的情况
	 */
	public boolean isPowerOfTwo(int n) {
        if(n == 1 || n == 2)
        	return true;
        int i = 0;
        return powerOfTwo(n, i);
    }
	
	public boolean powerOfTwo(int n, int step) {
		if(n == Math.pow(2, step)){
			return true;
		} else if(n < Math.pow(2, step)) {
			return false;
		} else  {
			return powerOfTwo(n,++step);
		}
	}
	
	
	/*
	 * 由于是判断是否是2的整数幂，在二进制当中，就是判断1的个数是不是只有1个，故两种思路：
	 * 1.移位运算：n & (n-1) == 0.
	 * 		n&(n-1)作用：将n的二进制表示中的最低位为1的改为0，先看一个简单的例子：
	 *			n = 10100(二进制），则(n-1) = 10011 ==》n&(n-1) = 10000
	 *			可以看到原本最低位为1的那位变为0。
	 *
	 * 2.通过移位运算统计二进制里边1的个数，判断个数是否为1.			
	 */
	public boolean isPowerOfTwo2(int n){
		return (n > 0) && ((n & (n-1)) == 0 );
	}
	
	public boolean isPowerOfTwo3(int n) {
		int count = 0;
		while(n > 0){
			count += n & 0x01;
			n >>= 1;
		}
		return count == 1;
	}
}

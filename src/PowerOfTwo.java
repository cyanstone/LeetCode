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
	 * �ݹ飬�����������ж��Ƿ����ݵ����
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
	 * �������ж��Ƿ���2�������ݣ��ڶ����Ƶ��У������ж�1�ĸ����ǲ���ֻ��1����������˼·��
	 * 1.��λ���㣺n & (n-1) == 0.
	 * 		n&(n-1)���ã���n�Ķ����Ʊ�ʾ�е����λΪ1�ĸ�Ϊ0���ȿ�һ���򵥵����ӣ�
	 *			n = 10100(�����ƣ�����(n-1) = 10011 ==��n&(n-1) = 10000
	 *			���Կ���ԭ�����λΪ1����λ��Ϊ0��
	 *
	 * 2.ͨ����λ����ͳ�ƶ��������1�ĸ������жϸ����Ƿ�Ϊ1.			
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

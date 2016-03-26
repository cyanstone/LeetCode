
public class NumberOf1Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new NumberOf1Bits().hammingWeight(11));
	}
	
	public int hammingWeight(int n) {
        int count = 0;
        while( 0 != n){
        	count += n & 0x1;
        	n = n >>> 1;
        }
        return count;
    }
}

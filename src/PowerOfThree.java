import java.util.Scanner;


public class PowerOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new  PowerOfThree().isOfThree(new Scanner(System.in).nextInt()));
		System.out.println(new  PowerOfThree().isOfThree2(new Scanner(System.in).nextInt()));
	}
	
	public boolean isOfThree(int n) {
		int i = 1;
		if(n == 1 || n == 3) return true;
		if(n < 3) return false;
		while(true) {
			if(n ==  Math.pow(3, i))
				return true;
			else if(n <  Math.pow(3, i))
				return false;
			else if(n >  Math.pow(3, i))
				i++;
		}
    }
	
	/*
	 * ตÝน้
	 */
	
	public boolean isOfThree2(int n){
		int step = 0;
		return isPowThree(n,step);
	}
	public boolean isPowThree(int n,int step) {
		if(n ==  Math.pow(3, step))
			return true;
		else if(n <  Math.pow(3, step))
			return false;
		else 
			return isPowThree(n,++step);
	}
}

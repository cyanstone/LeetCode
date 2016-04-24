package Algorithm;

import java.util.Scanner;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
		System.out.println(stringToInt(scanner.next()));
	}
	}
	
	public static int stringToInt(String s) {
		if(s == null || s.length() == 0) {
			return Integer.MIN_VALUE;
		}
		
		int result = 0;
		int i = 0;
		boolean isNegative = false;
		if(s.charAt(0) == '-') {
			isNegative = true;
			i++;
		} else if(s.charAt(0) == '+') {
			i++;
		}
		for(; i < s.length(); i++) {
			if(s.charAt(i) < '0' || s.charAt(i) > '9') {
				return Integer.MIN_VALUE;
			}
			result = result * 10 + s.charAt(i) - '0';
			}
		if(isNegative) result = -result;
		return result;
	}

}

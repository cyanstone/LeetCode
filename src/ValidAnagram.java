import java.util.Arrays;
import java.util.Scanner;


public class ValidAnagram {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		ValidAnagram va = new ValidAnagram();
		System.out.println(va.isAnagram(s,t));
	}
	
	 public boolean isAnagram(String s, String t) {
	        if(s == null && t == null) return true;
	        if(s.length() != t.length()) {
	        	return false;
	        }else {
		        	if(s.equals(t)) {
		        	    return true;
		        	} else {
			        	int[] sHash = new int[128];
			        	int[] tHash = new int[128];
			        	for(int i = 0; i < s.length(); i++){
			        		sHash[s.charAt(i)]++;
			        		tHash[t.charAt(i)]++;
			        	}
			        	return Arrays.equals(sHash, tHash);
		        }  
	    }
	 }
}

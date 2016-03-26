package Algorithm;
import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 0, n = 0;
		Scanner scanner = new Scanner(System.in);
		m = scanner.nextInt();
		n = scanner.nextInt();
		int [] a = new int[n+m];
		int [] b = new int[n];
		for(int i = 0; i < m; i++) {
			a[i] = scanner.nextInt();
		}
		for(int i = 0 ; i < n; i++) {
			b[i] = scanner.nextInt();
		}
		merge(a,m,b,n);
		System.out.println(Arrays.toString(a));
	}
	
	public static void merge(int[] a, int m, int[] b, int n) {
		int j = m -1, k = n -1;
		for(int i = m+n-1; i >=0; i--) {
			if(j >= 0 && k >=0) {
				if(a[j] > b[k]) {
					a[i] = a[j];
					j--;
				} else {
					a[i] = b[k];
					k--;
				}
			} else {
				if(j < 0) {
					a[i] = b[k];
					k--;
				} else {
					a[i] = a[j];
					j--;
				}
			}
		}
	}
}

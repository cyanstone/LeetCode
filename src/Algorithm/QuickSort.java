package Algorithm;
import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt = in.nextInt();
		int [] array = new int[cnt];
		for(int i = 0; i < cnt; i++) {
			array[i] = in.nextInt();
		}
		
		//Quick_Sort(array,0,cnt-1);
		System.out.println(Arrays.toString(array));
		System.out.println("---------------------------------------------------");
		Quick_Sort2(array,0,cnt -1);
		System.out.println(Arrays.toString(array));
	}
	
	public static  void  Quick_Sort(int[] array,int begin,int end) {
		if(array == null || array.length <=1 || begin >= end ) return;
		int low = begin,high = end,mark = array[begin];
		while(low < high) {
			while(low < high && array[high] >= mark) {
				high--;
			}
			int temp = array[high];
			array[high] = array[low];
			array[low] = temp;
			
			while(low < high && array[low] <= mark) {
				low++;
			}
			
			temp = array[low];
			array[low] = array[high];
			array[high] = temp;
		}
		
		Quick_Sort(array,begin,high-1);
		Quick_Sort(array,low + 1,end);
	}
	
	public static void Quick_Sort2(int[] array,int begin,int end) {
		if(array == null || array.length <=1 || begin >= end) return;
		int low = begin,high = end,mark = array[begin];
		while(low < high) {
			while(low < high && array[high] >= mark) {
				high--;
			}
			array[low] = array[high];
			
			while(low < high && array[low] <= mark) {
				low++;
			}
			array[high] = array[low];
		}
		array[low] = mark;
		
		Quick_Sort2(array,begin,high -1);
		Quick_Sort2(array,low + 1,end);
	}
}

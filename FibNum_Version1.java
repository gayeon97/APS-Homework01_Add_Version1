//import java.util.ArrayList;
import java.util.Scanner;
public class FibNum_Version1 {
	
	public static int[] memo;

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int size = scnr.nextInt();
		scnr.close();
		memo = new int[size];
		
		System.out.println(fibNum(size));
	}
	
	public static int fibNum(int n) {
		
		if (memo[n-1] != 0) {
			return memo[n-1];
		}
		
		if (n<3) {
			memo[n-1] = 1;
			return memo[n-1];
		}
		
		return  fibNum(n-1)+fibNum(n-2);
	}
}

import java.util.Scanner;
public class FibNum_Version2 {
	
	public static long[] memo;

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int size = scnr.nextInt();
		scnr.close();
		memo = new long[size];

		System.out.println(fibNum(size));
	}
	
	public static long fibNum(int n) {
		if (n == 1) return 0;
		memo[1] = 1;
		for (int i = 2; i < n; i ++) {
			memo[i] = memo[i-1] + memo[i-2];
		}
		return memo[n-1];
	}
}

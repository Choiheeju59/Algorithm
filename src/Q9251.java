import java.util.*;

public class Q9251 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int row = s1.length();
		int column = s2.length();

		int dp[][] = new int[row + 1][column + 1];

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}

		System.out.println(dp[row][column]);
		
// 		표 보기
//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= column; j++) {
//				System.out.print(dp[i][j]+" ");
//			}
//			System.out.println();
//		}

	}
}
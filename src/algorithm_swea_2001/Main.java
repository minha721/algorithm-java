package algorithm_swea_2001;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test = 1; test <= T; test++) {
			int N = scan.nextInt();
			int M = scan.nextInt();
			
			int arr[][] = new int[N][N];
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					arr[i][j] = scan.nextInt();
				}
			}
			
			int ans = 0;
			
			for(int i = 0; i < N-M+1; i++) {
				for(int j = 0; j < N-M+1; j++) {
					int sum = 0;
					
					for(int k = i; k < i+M; k++) {
						for(int l = j; l < j+M; l++) {
							sum += arr[k][l];
						}
					}
					
					ans = Math.max(ans, sum);
				}
			}
			
			System.out.printf("#%d %d\n", test, ans);
		}
	}

}

package algorithm_swea_1979;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i = 1; i <= T; i++) {
			
			int N = scan.nextInt();
			int K = scan.nextInt();
			int ans = 0;
			
			int[][] arr = new int[N][N];
			
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < N; k++) {
					arr[j][k] = scan.nextInt();
				}
			}
			
			for(int j = 0; j < N; j++) {
				int rcnt = 0;
				
				for(int k = 0; k < N; k++) {
					if(arr[j][k]==0) {
						if(rcnt == K) ans++;
						rcnt = 0;
					} else {
						rcnt += 1;
					}
				}
				
				if(rcnt==K) ans++;
			}
			
			for(int j = 0; j < N; j++) {
				int ccnt = 0;
				
				for(int k = 0; k < N; k++) {
					if(arr[k][j]==0) {
						if(ccnt == K) ans++;
						ccnt = 0;
					} else {
						ccnt += 1;
					}
				}
				
				if(ccnt==K) ans++;
			}
			
			System.out.printf("#%d %d\n", i, ans);
		}
	}

}

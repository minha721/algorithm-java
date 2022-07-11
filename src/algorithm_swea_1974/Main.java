package algorithm_swea_1974;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test = 1; test <= T; test++) {
			int ans = 1;
			int arr[][] = new int[9][9];
			
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					arr[i][j] = scan.nextInt();
				}
			}
			
			for(int i=0; i<9; i++) {
				int rsum = 0;
				int csum = 0;
				for(int j=0; j<9; j++) {
					rsum += arr[i][j];
					csum += arr[j][i];
				}
				if(rsum!=45 || csum!=45) {
					ans = 0;
				}
			}
			
			if(ans == 0) {
				System.out.printf("#%d %d\n", test, ans);
				continue;
			}
			
			for(int i=0; i<9; i+=3) {
				for(int j=0; j<9; j+=3) {
					int sum = 0;
					
					for(int x=i; x<i+3; x++) {
						for(int y=i; y<i+3; y++) {
							sum += arr[x][y];
						}
					}
					if(sum!=45) {
						ans = 0;
						break;
					}
				}
				if(ans == 0) break;
			}
			System.out.printf("#%d %d\n", test, ans);
		}
	}

}

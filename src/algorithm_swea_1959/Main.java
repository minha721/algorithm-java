package algorithm_swea_1959;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test = 1; test <= T; test++) {
			
			int N = scan.nextInt();
			int M = scan.nextInt();

			int[] arrN = new int[N];
			int[] arrM = new int[M];
			
			for(int i = 0; i < N; i++) {
				arrN[i] = scan.nextInt();
			}
			
			for(int i = 0; i < M; i++) {
				arrM[i] = scan.nextInt();
			}

			int result = -999999;
			int shortNM = Math.min(N, M);

			if(shortNM == arrN.length) {
				for(int i = 0; i <= arrM.length - arrN.length; i++) {
					int sum = 0;
					for(int j = 0; j < shortNM; j++) {
						sum += (arrN[j] * arrM[i + j]);
					}
					result = Math.max(sum, result);
				}
			} else if(shortNM == arrM.length) {
			    for(int i = 0; i <= arrN.length - arrM.length; i++) {
			    	int sum = 0;
			    	for(int j = 0; j < shortNM; j++) {
			    		sum += (arrM[j] * arrN[i + j]);
			    	}
			    	result = Math.max(sum, result);
			    }
			}
			
			System.out.printf("#%d %d\n", test, result);
		}
	}

}

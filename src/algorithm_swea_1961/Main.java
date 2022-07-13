package algorithm_swea_1961;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int test = 1; test <= T; test++) {
			
			int N = scan.nextInt();
			
			int[][] arr = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = scan.nextInt();
				}
			}
			
			int[][] rot_90 = turn(arr);
			int[][] rot_180 = turn(rot_90);
			int[][] rot_270 = turn(rot_180);
			
			System.out.printf("#%d\n", test);
			
			for(int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(rot_90[i][j]);
				}
				System.out.print(" ");
				
				for (int j = 0; j < N; j++) {
					System.out.print(rot_180[i][j]);
				}
				System.out.print(" ");
				
				for (int j = 0; j < N; j++) {
					System.out.print(rot_270[i][j]);
				}
				System.out.println();
			}
		}
	}
	
	public static int[][] turn(int[][] arr) {
		int len = arr.length;
		
		int[][] rotation = new int[len][len];
		
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				rotation[i][j] = arr[len-j-1][i];
			}
		}
		
		
		return rotation;
	}

}

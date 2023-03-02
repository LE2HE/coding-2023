package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class P2470_2 {
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[] A;
    public static void main(String[] args) throws IOException {
        // input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        A = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for (int i=1;i<=N;i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        // print
        pro();
    }

    static void pro() {
		// A 에 대해 이분 탐색을 할 예정이니까, 정렬을 미리 하기
		Arrays.sort(A, 1,  N+1);
	
		int best_sum = Integer.MAX_VALUE;
		int v1 = 0, v2 = 0, L = 1, R = N;

		while (L < R) { // L == R 인 상황이라면 용액이 한 개 뿐인 것이므로, L < R 까지만 반복
			int sum = A[L] + A[R];
            if (Math.abs(sum) < best_sum) {
                best_sum = Math.abs(sum);
                v1 = A[L];
                v2 = A[R];
            }
            if (sum > 0) {
                R--;
            } else {
                L++;
            }
		}
	
		sb.append(v1).append(' ').append(v2);
		System.out.println(sb);
    }
}

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2470 {
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

    static int lower_bound(int[] A, int L, int R, int X) {
		// A[L...R] 에서 X 이상의 수 중 제일 왼쪽 인덱스를 return 하는 함수
		// 그런게 없다면 R+1을 리턴
        int result = R + 1;
        while (L <= R) {
            int mid = (L+R)/2;
            if (A[mid] >= X) {
                result = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return result;
    }

    static void pro() {
		// A에 대해 이분 탐색을 할 예정이므로, 정렬
		Arrays.sort(A, 1, N+1);
		
		int best_sum = Integer.MAX_VALUE;
		int v1 = 0, v2 = 0;
		for (int left=1;left<=N-1;left++) {
				// A[left] 용액을 사용
				// -A[left]와 가장 가까운 용액을 자신의 오른쪽 구간에서 찾기
				int result = lower_bound(A, left+1, N, -A[left]);
				// A[result-1] 와 A[result] 중에 A[left]와 섞었을 때의 정보를 정답에 갱신
                if (left+1 <= result-1 && result-1<=N && Math.abs(A[result-1] + A[left]) < best_sum) {
                    best_sum = Math.abs(A[left] + A[result-1]);
                    v1 = A[left];
                    v2 = A[result-1];
                }
                if (left+1 <= result && result<=N && Math.abs(A[result] + A[left]) < best_sum) {
                    best_sum = Math.abs(A[left] + A[result]);
                    v1 = A[left];
                    v2 = A[result];
                }

        }
		sb.append(v1).append(' ').append(v2);
		System.out.println(sb.toString());
    }
}

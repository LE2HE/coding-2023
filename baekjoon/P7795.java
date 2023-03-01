package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P7795 {
    static int T;
    static int N, M;
    static int[] A, B;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        T = Integer.parseInt(st.nextToken());
        for (int i=0;i<T;i++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            A = new int[N+1];
            B = new int[M+1];
            st = new StringTokenizer(br.readLine());
            for (int j=1;j<=N;j++) {
                A[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int j=1;j<=M;j++) {
                B[j] = Integer.parseInt(st.nextToken());
            }
            pro();
        }
    }
    
    static int lower_bound(int[] A, int L, int R, int X) {
		// A[L...R] 에서 X 미만의 수(X 보다 작은 수) 중 제일 오른쪽 인덱스를 return 하는 함수
		// 그런게 없다면 L-1을 리턴
        int result = L - 1;
        while (L <= R) {
            int mid = (L + R) / 2;
            if (A[mid] < X) {
                result = mid;
                L = mid + 1;
            } else if (A[mid] >= X) {
                R = mid - 1;
            }
        }
        return result;
    }

    static void pro() {
		// B 배열에 대해 이분탐색을 할 예정이므로, 정렬
        Arrays.sort(B);

		int ans = 0;
		for (int i=1;i<=N;i++) {
				// A[i] 를 선택했을 때, B 에서는 A[i] 보다 작은 게 몇 개나 있는 지 count 하기
				ans += lower_bound(B, 1, M, A[i]);
		}
	    System.out.println(ans);
    }

}
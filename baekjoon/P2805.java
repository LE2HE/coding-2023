package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2805 {
    static int N, M;
    static int[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for (int i=1;i<=N;i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        pro();
    }
    
    static boolean determination(int H) {
		// H 높이로 나무들을 잘랐을 때, H 만큼을 얻을 수 있으면 true, 없으면 false를 return 하는 함수
        long sum = 0;
        for (int i=1;i<=N;i++) {
            if (A[i] > H) {
                sum += A[i] - H;
            }
        }
        return sum >= M;
    }

    static void pro() {
		long L = 0, R = 2000000000, ans = 0;
		// [L ... R] 범위 안에 정답이 존재함
		// 이분 탐색과 determination 문제를 이용해서 answer를 빠르게 구하기
		while (L <= R) {
            long mid = (L+R)/2;
            if (determination((int) mid)) {
                ans = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        System.out.println(ans);
    }
}

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253 {
    static int N;
    static int[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        A = new int[N+1];
        for (int i=1;i<=N;i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        pro();
    }

    // target_idx 번째 원소가 서로 다른 두 수의 합으로 표현이 되는가?
    static boolean func(int target_idx) {
        int L = 1, R = N;
        int target = A[target_idx];
        while (L < R) {
            if (L == target_idx) L++;
            else if (R == target_idx) R--;
            else {
                if (A[L] + A[R] == target) return true;
                if (A[L] + A[R] > target) R--;
                else L++;
            }
        }
        return false;
    }
    
    static void pro() {
        // 최소, 최대를 빠르게 얻기 위한 정렬
        Arrays.sort(A, 1, N+1);
        int ans = 0;
        for (int i=1;i<=N;i++) {
            // i 번째 원소가 서로 다른 두 수의 합으로 표현이 되는가?
            if (func(i)) ans++;
        }
        System.out.println(ans);
    }

}

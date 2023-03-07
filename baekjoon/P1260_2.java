package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class P1260_2 {
    static int N, M, V;
    static boolean[] visit;
    static ArrayList<Integer>[] adj;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        // input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        adj = new ArrayList[N+1];
        for (int i=1;i<=N;i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i=1;i<=M;i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            adj[x].add(y);
            adj[y].add(x);
        }
        for (int i=1;i<=N;i++) {
            Collections.sort(adj[i]);
        }
        pro();
    }
    
    // x 를 갈 수 있다는 걸 알고 방문한 상태
    static void dfs(int x) {
        visit[x] = true;
        sb.append(x).append(' ');
        for (int y : adj[x]) {
            if (visit[y]) continue;
            dfs(y);
        }
    }

    static void bfs(int x) {
        Queue<Integer> que = new LinkedList<>();
        
        que.add(x);
        visit[x] = true;

        while (!que.isEmpty()) {
            x = que.poll();
            sb.append(x).append(' ');
            for (int y : adj[x]) {
                if (visit[y]) continue;
                que.add(y);
                visit[y] = true;
            }
        }
    }

    static void pro() {
        // 모든 x에 대해서 adj[x] 정렬
        visit = new boolean[N+1];

        // DFS, BFS 결과 구하기
        dfs(V);
        sb.append('\n');
        for(int i=1;i<=N;i++) visit[i] = false;
        bfs(V);

        System.out.println(sb);
    }

}

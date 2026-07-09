// Last updated: 09/07/2026, 10:05:54
import java.util.*;

class Solution {
    static class state{
        int node;
        int cnt;
        long dist;
        state (int node, int cnt, long dist){
            this.node = node;
            this.cnt = cnt;
            this.dist = dist;
        }
    }
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        List<int []>[] g = new ArrayList[n];
        for(int i =0; i<n; i++){
            g[i] = new ArrayList<>();
        }

        for(int[] e : edges){
            g[e[0]].add(new int[]{e[1],e[2]});
        }
        long INF = Long.MAX_VALUE/4;
        long[][] dist = new long[n][k+ 1];

        for(int i =0;i<n;i++){
            Arrays.fill(dist[i],INF);
            
        }
        dist[0][1]=0;
        PriorityQueue<state> pq = 
            new PriorityQueue<>((a,b) ->
        Long.compare(a.dist, b.dist));

        pq.offer(new state(0,1,0));
        while(!pq.isEmpty()){
            state cur =pq.poll();
        if(cur.dist  != dist[cur.node][cur.cnt]){
            continue;
        }
        if(cur.node == n-1){
            return (int) cur.dist;
        }
        for(int[] edge : g[cur.node]){
            int nxt = edge[0];
            int w = edge[1];
            int newCnt;

            if(labels.charAt(nxt)== labels.charAt(cur.node)){
                newCnt = cur.cnt +  1;
                
            }else{
                newCnt = 1;
            }
            if(newCnt >k){
                continue;
            }
            long nd = cur.dist+ w;

            if(nd<dist[nxt][newCnt]){
                dist[nxt][newCnt] = nd;
                pq.offer(new state(nxt,newCnt,nd));
            }
        }
    }

    return -1;
        
    }
}
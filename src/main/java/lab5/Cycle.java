package lab5;

import java.util.List;

public class Cycle {
    public boolean isCycle(int[][] degrees) {
        boolean[] used = new boolean[degrees.length];
        dfs(0, used,degrees);
return true;

    }





    public static void dfs(int pos, boolean[] used, int[][] graph) {
        used[pos] = true;
        System.out.println(pos);
        for (int next : graph[pos]){
            if (!used[next]){
                dfs(next, used, graph);
            }
        }
    }
}

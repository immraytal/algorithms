package lab6;

import static java.lang.Math.min;

public class lab6 {

    static int INF = Integer.MAX_VALUE / 2; // "Бесконечность"
    static int vNum = 4; // количество вершин
    static int[][] graph = {{0, 4, 4, 5},
                            {8, 0, 8, INF},
                            {INF, 2, 0, 4},
                            {2, INF, 2, 0}}; // матрица смежности

    /* Алгоритм Флойда-Уоршелла за O(V^3) */
    public static void main(String[] args) {
         int[][] dist = new int [vNum][vNum]; // dist[i][j] = минимальное_расстояние(i, j)
         for (int i = 0; i < vNum; i++) System.arraycopy(graph[i], 0, dist[i], 0, vNum);
         for (int k = 0; k < vNum; k++){
             for (int i = 0; i < vNum; i++)


                 for (int j = 0; j < vNum; j++) {
                     dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j]);


                 }

                 System.out.println();
                 for (int ik = 0; ik < 4; ik++) {
                     for (int jk = 0; jk < 4; jk++) {
                         System.out.printf(dist[ik][jk] + " ");
                     }
                     System.out.println();
                 }
                 System.out.println();
             }
     }
}

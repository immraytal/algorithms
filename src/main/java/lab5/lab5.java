package lab5;

public class lab5 {
    public static void main(String[] args) {
        int[][] d = {{0, 1, 1, 1},
                     {1, 0, 1, 0},
                     {1, 1, 0, 1},
                     {1, 0, 1, 0}};

        int[][] bipartite = {{0, 1, 0, 0},
                             {1, 0, 1, 1},
                             {0, 1, 0, 0},
                             {0, 1, 0, 0}};
        doubleDegree dd = new doubleDegree();
       int[] result =  dd.getAnswer(d);
        for (int res :
             result) {
            System.out.print(res + " ");
        }
        biparti bp = new biparti();
        System.out.println("\nBP? = " + bp.isBipartite(bipartite));
    }


}

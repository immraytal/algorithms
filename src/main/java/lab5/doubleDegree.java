package lab5;

public class doubleDegree {

    public int[] getAnswer(int[][] degrees) {
        int[] dd = new int [degrees.length];
        for (int d:dd) {
            d = 0;
        }
        int[] deg = getDegrees(degrees);
        for (int i=0; i<dd.length; i++) {
            for (int j=0; j<dd.length;j++){
                if (degrees[i][j]!=0) {
                    dd[i]+= deg[j];
                }
            }
        }
        return dd;
    }
    public int[] getDegrees(int[][] degrees) {
        int[] dd = new int [degrees.length];
        for (int d:dd) {
            d = 0;
        }
        for(int i=0; i <degrees.length; i++) {
            for (int j =0;j<degrees.length; j++) {
                dd[i]+= degrees[i][j];
            }
        }
        return dd;
    }
}


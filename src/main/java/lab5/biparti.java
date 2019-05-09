package lab5;

import java.util.ArrayList;
import java.util.List;

public class biparti {

    public boolean isBipartite(int[][] degrees){

        vertex[][] vertices = new vertex[degrees.length][degrees[0].length];



        for (int i =0; i< degrees.length; i++) {
            for (int j=0; j< degrees.length; j++) {
                vertices[i][j] = new vertex(degrees[i][j]);
            }
        }

        vertices[0] = painting(vertices[0], 1);

        for (int i =0; i< degrees.length; i++) {
            for (int j=0; j< degrees.length; j++) {
                if(vertices[i][j].value!=0) {
                    if (vertices[j][i].color!=0 && vertices[j][i].color==vertices[i][j].color) {
                        return false;
                    }
                    vertices[j]=painting(vertices[j], vertices[i][j].color*-1);
                }
            }
        }

        return true;
    }
    public vertex[] painting(vertex[]vertices, int value){
        for(int i=0; i<vertices.length; i++) {vertices[i].color=value;}
        return vertices;
    }
}
class vertex {
    public int value;
    public int color=0;
    public vertex(int value) {this.value =value;}
}
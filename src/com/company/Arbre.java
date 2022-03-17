package com.company;
import java.awt.*;
public class Arbre {
    private int [][] sapin;
    private Color decoration;
    public Arbre(int n1, Color c){
        int nc = 2*n1-1;
        decoration = c;
        sapin = new int[n1][nc];
        int milieu = sapin[0].length/2;
        for (int j = 0; j < n1; j++)
            for (int i = -j; i <= j;i++)
                sapin[j][milieu+1]=(int) (5*Math.random()+1);
    }
    public void dessine(Graphics g){
        Color vert = Color.green;
        for (int i = 0; i<sapin.length;i++){
            for (int j =0; j < sapin[0].length; j++){
                switch (sapin[i][j]){
                    case 1 : new Triangle(i,j,g, decoration);
                    break;
                    case 2: vert = vert.brighter();
                          new Triangle(i,j,g,vert);
                          break;
                    case 3: vert = vert.darker();
                          new Triangle(i,j,g,vert);
                          break;
                    case 4: vert = vert.brighter();
                          new Triangle(i,j,g,vert);
                          break;
                    case 5: vert = vert.darker();
                          new Triangle(i,j,g,vert);
                          break;

                }
            }
        }
    }

}

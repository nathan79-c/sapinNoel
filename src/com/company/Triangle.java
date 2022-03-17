package com.company;

import java.awt.*;

public class Triangle {
   private int pX =Fenetre.LG/2-50;
   private int pY = Fenetre.HT/2-50;
   private  int [] xPoints ={0,10,-10};
   private int [] ypoints = {-10,10,10};
    int nPoints = 3;

    public Triangle(int lig, int cool, Graphics g, Color c){
        for (int i =0; i < nPoints;i++){
            xPoints[i]=xPoints[i]+(5*cool)+pX;
            ypoints[i] = ypoints[i]+(15*lig) +pY;
        }
        g.setColor(c);
        g.fillPolygon(xPoints,ypoints,nPoints);
    }
}

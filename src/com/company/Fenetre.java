package com.company;
import java.awt.*;

public class Fenetre {
    public final static int HT=300;
    public final static int LG=300;
    public static void main(String[]args){
        Frame F = new Frame();
        F.setTitle("Un Triangle");
        F.setSize(LG,HT);
        F.setBackground(Color.BLUE);
        F.add(new Dessin());
        F.setVisible(true);
    }
}

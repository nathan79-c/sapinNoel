package com.company;
import java.awt.*;

public class Dessin extends Canvas{
    private Color couleur = Color.green;
    public final static Color couleurFond = Color.white;
    private Arbre A ;
    public Dessin(){
        setBackground(couleurFond);
        setForeground(couleur);
        setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        A = new Arbre(8,Color.yellow);
    }
    public void paint (Graphics g){
        A.dessine(g);
    }
}

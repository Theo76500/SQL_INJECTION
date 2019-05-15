package BOUTON;

import BDD.BDD;
import FENETRE.FenetreREQUETE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BoutonREQUETE extends JButton implements MouseListener {
    private String name;

    public BoutonREQUETE(String str)
    {
        super(str);
        this.name = str;
        this.addMouseListener(this);
    }

    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
        g2d.setColor(Color.red);
        g2d.drawString(this.name, this.getWidth() / 2 - (this.getWidth()/ 2 /4), (this.getHeight() / 2) + 5);
    }

    public void mouseClicked(MouseEvent event)
    {
        FenetreREQUETE fenetreREQUETE = new FenetreREQUETE();
    }

    //Méthode appelée lors du survol de la souris
    public void mouseEntered(MouseEvent event) {}

    //Méthode appelée lorsque la souris sort de la zone du bouton
    public void mouseExited(MouseEvent event) { }

    //Méthode appelée lorsque l'on presse le bouton gauche de la souris
    public void mousePressed(MouseEvent event) { }

    //Méthode appelée lorsque l'on relâche le clic de souris
    public void mouseReleased(MouseEvent event) { }
}

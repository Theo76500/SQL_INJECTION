package BOUTON;

import BDD.BDD;
import FENETRE.FenetreINSERT;
import FENETRE.FenetreREQUETE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BoutonINSERTinjection extends JButton implements MouseListener
{
    private String name;

    public BoutonINSERTinjection(String str)
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

    //Méthode appelée lors du clic de souris
    public void mouseClicked(MouseEvent event)
    {
        String table = FenetreINSERT.textField.getText();
        String colonne = FenetreINSERT.textField2.getText();
        String valeur = FenetreINSERT.textField3.getText();
        System.out.println("Injection...");
        String personne = "INSERT INTO "+table+" ("+colonne+") VALUES ( "+valeur+" ) ";
        BDD.InjectionDansBase(personne);

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

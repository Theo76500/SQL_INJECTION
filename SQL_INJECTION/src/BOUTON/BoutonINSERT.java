package BOUTON;

import FENETRE.FenetreINSERT;
import FENETRE.FenetreREQUETE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BoutonINSERT extends JButton implements MouseListener {
    private String name;

    public BoutonINSERT(String str)
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

    @Override
    public void mouseClicked(MouseEvent e) {
        FenetreINSERT fenetreINSERT = new FenetreINSERT();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

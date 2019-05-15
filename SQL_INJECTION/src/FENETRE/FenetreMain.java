package FENETRE;

import BOUTON.*;

import javax.swing.*;
import java.awt.*;

public class FenetreMain extends JFrame{
    BoutonINSERT boutonINSERT = new BoutonINSERT("INSERT INTO");
    BoutonDELETE boutonDELETE = new BoutonDELETE("DELETE");
    BoutonDROP boutonDROP = new BoutonDROP("DROP TABLE");
    BoutonREQUETE boutonREQUETE = new BoutonREQUETE("REQUETE");

    public FenetreMain(){
        this.setTitle("Injection SQL");
        this.setSize(450, 350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setBackground(Color.DARK_GRAY);

        this.setLayout(new GridLayout(2,2));
        this.getContentPane().add(boutonINSERT);
        this.getContentPane().add(boutonDELETE);
        this.getContentPane().add(boutonDROP);
        this.getContentPane().add(boutonREQUETE);



        this.setVisible(true);
    }
}
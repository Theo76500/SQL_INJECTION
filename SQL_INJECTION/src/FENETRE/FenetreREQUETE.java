package FENETRE;

import BOUTON.BoutonREQUETEinjection;

import javax.swing.*;
import java.awt.*;

public class FenetreREQUETE extends JFrame
{
    BoutonREQUETEinjection bouton = new BoutonREQUETEinjection("Injecter");
    public static JTextField textField = new JTextField();
    JLabel jLabel = new JLabel("Entrez votre requête SQL :");

    public FenetreREQUETE(){
        this.setTitle("Injection SQL : REQUETE");
        this.setSize(450, 350);
        this.setLocationRelativeTo(null);
        this.setBackground(Color.DARK_GRAY);

        this.setLayout(new GridLayout(3,1));
        this.add(jLabel);
        this.add(textField);
        this.add(bouton);

        this.setVisible(true);
    }
}

package FENETRE;

import BOUTON.BoutonDELETEinjection;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.jar.JarEntry;

public class FenetreDELETE extends JFrame
{
    BoutonDELETEinjection bouton = new BoutonDELETEinjection("Injecter");
    public static JTextField textField = new JTextField();
    JLabel jLabel = new JLabel("Entrez le nom de la table");

    public FenetreDELETE()
    {
        this.setTitle("Injection SQL : DELETE");
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

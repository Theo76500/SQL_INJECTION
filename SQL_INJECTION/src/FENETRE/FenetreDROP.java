package FENETRE;

import BOUTON.BoutonDROPinjection;

import javax.swing.*;
import java.awt.*;

public class FenetreDROP extends JFrame
{
    BoutonDROPinjection bouton = new BoutonDROPinjection("Injecter");
    public static JTextField textField = new JTextField();
    public static JTextField textField2 = new JTextField();
    JLabel jLabel = new JLabel("TABLE ou DATABASE");
    JLabel jLabel2 = new JLabel("Nom de la table/database :");

    public FenetreDROP()
    {
        this.setTitle("Injection SQL : DROP");
        this.setSize(450, 350);
        this.setLocationRelativeTo(null);
        this.setBackground(Color.DARK_GRAY);

        this.setLayout(new GridLayout(3,2));
        this.add(jLabel);
        this.add(jLabel2);
        this.add(textField);
        this.add(textField2);
        this.add(bouton);

        this.setVisible(true);
    }

}

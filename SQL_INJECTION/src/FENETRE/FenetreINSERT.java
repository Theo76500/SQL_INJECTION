package FENETRE;

import BOUTON.BoutonINSERTinjection;

import javax.swing.*;
import java.awt.*;

public class FenetreINSERT extends JFrame
{
    BoutonINSERTinjection boutonINJECT = new BoutonINSERTinjection("Injecter");
    public static JTextField textField = new JTextField();
    public static JTextField textField2 = new JTextField();
    public static JTextField textField3 = new JTextField();
    JLabel jLabel = new JLabel("TABLE :");
    JLabel jLabel2 = new JLabel("COLONNE :");
    JLabel jLabel3 = new JLabel("VALEUR (Mettre les \") :");


    public FenetreINSERT(){
        this.setTitle("Injection SQL : INSERT INTO");
        this.setSize(450, 350);
        this.setLocationRelativeTo(null);
        this.setBackground(Color.DARK_GRAY);

        this.setLayout(new GridLayout(3,3));
        this.add(jLabel);
        this.add(jLabel2);
        this.add(jLabel3);

        this.add(textField);
        this.add(textField2);
        this.add(textField3);

        this.add(boutonINJECT);



        this.setVisible(true);
    }
}

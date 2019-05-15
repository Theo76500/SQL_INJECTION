package BDD;

import javax.swing.*;
import java.sql.*;

public class BDD
{
    public static void InjectionDansBase(String personne)
    {

        String URL = "jdbc:mariadb://localhost:3307/java";
        String login = "root";
        String password ="";
        Connection cn = null;
        Statement st = null;
        JOptionPane jop1 = new JOptionPane();
        JOptionPane jop2 = new JOptionPane();


        try
        {
            Class.forName("org.mariadb.jdbc.Driver");
            cn = DriverManager.getConnection(URL, login, password);
            st = cn.createStatement();
            //String sql = "INSERT INTO personne (nom) VALUES ('"+personne+"')";
            String sql = personne;
            st.executeUpdate(sql);
            ImageIcon img = new ImageIcon("images/valide.png");
            jop2.showMessageDialog(null, "L'exécution s'est bien déroulée", "Information", JOptionPane.INFORMATION_MESSAGE, img);


        } catch (SQLException e) {
            e.printStackTrace();
            ImageIcon img = new ImageIcon("images/erreur.png");
            jop1.showMessageDialog(null, "Erreur lors de l'exécution (voir console)", "Erreur", JOptionPane.ERROR_MESSAGE, img);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            ImageIcon img = new ImageIcon("images/erreur.png");
            jop1.showMessageDialog(null, "Erreur lors de l'exécution (voir console)", "Erreur", JOptionPane.ERROR_MESSAGE, img);
        } finally {
            try {
                cn.close();
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
                ImageIcon img = new ImageIcon("images/erreur.png");
                jop1.showMessageDialog(null, "Erreur lors de l'exécution (voir console)", "Erreur", JOptionPane.ERROR_MESSAGE, img);
            }
        }
    }
}

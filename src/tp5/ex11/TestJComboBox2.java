package tp5.ex11;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class TestJComboBox2 extends JFrame{
    // frame
    static JFrame f;
    // label
    static JLabel l, l1, l3, l4;
    // boite combo
    static JComboBox cb1, cb2;
    // classe main
    public static void main(String[] args){
        f = new JFrame("frame");
        TestJComboBox2 s = new TestJComboBox2();
        String ville[]={"Casablanca", "Marrakech", "Kenitra", "Rabat", "Tanger"};
        String genre[]={ "Homme", "Femme"};
// creer boite combo
        cb1 = new JComboBox(ville);
        cb2 = new JComboBox(genre);

// définir Rabat et homme comme éléments sélectionnés
// en utilisant setSelectedIndex
        cb1.setSelectedIndex(3);
        cb2.setSelectedIndex(0);
// ajouter ItemListener
        //cb1.addItemListener(s);
        //cb2.addItemListener(s);
        cb1.addItemListener((e)->{
            String[] c ={"black",""};
            l1.setText( cb1.getSelectedItem() +  "sélectionné" );
        });
        cb2.addItemListener((e)->{
            l4.setText(cb2.getSelectedItem() + " sélectionné");
        });
//définir la boite combo comme editable
        cb1.setEditable(true);
// creer labels
        l = new JLabel("Sélectionnez votre ville ");
        l1 = new JLabel("Rabat sélectionné");
        l3 = new JLabel("Sélectionnez votre sexe ");
        l4 = new JLabel("Homme sélectionné");
// définir la couleur du texte
        l.setForeground(Color.red);
        l1.setForeground(Color.blue);
        l3.setForeground(Color.red);
        l4.setForeground(Color.blue);
// creer un nouveau panel
        JPanel p = new JPanel();
        p.add(l);
        p.add(cb1);
        p.add(l1);
        p.add(l3);
        p.add(cb2);
        p.add(l4);
// définir un layout pour le panel
// p.setLayout(new FlowLayout());
// ajouter le panel au frame
        f.add(p);
        f.setSize(500, 400);
        f.setVisible(true);
    }
   /* public void itemStateChanged(ItemEvent e)
    {
// si l'état de la boite combo 1 est modifiéM;,
        if (e.getSource() == cb1) {
            l1.setText(cb1.getSelectedItem() + " sélectionné");
        }
// si l'état de la boite combo 2 est modifié
        else
            l4.setText(cb2.getSelectedItem() + " sélectionné");
    }*/
}
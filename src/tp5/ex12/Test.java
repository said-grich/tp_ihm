package tp5.ex12;

import java.awt.*; import java.awt.event.*; import javax.swing.*;
class FenCombo extends JFrame{
    public FenCombo(){
        setTitle("Essais boite combinee"); setSize (300, 200) ;
        Container contenu = getContentPane() ;
        contenu.setLayout(new FlowLayout()) ;
        combo = new JComboBox(couleurs);
        combo.setEditable(true);
        contenu.add(combo);
        combo.addActionListener((e)->{
            System.out.print("action combo : ") ;
            Object valeur = combo.getSelectedItem() ;
            System.out.println((String) valeur);
        });
      /*  combo.addItemListener((e)->{
            System.out.print("item combo : ") ;
            Object valeur = combo.getSelectedItem() ;
            System.out.println((String) valeur);
        });*/
    }
/*  public void actionPerformed(ActionEvent e){
        System.out.print("action combo : ") ;
        Object valeur = combo.getSelectedItem() ;
        System.out.println((String) valeur);
    }
    public void itemStateChanged(ItemEvent e){
        System.out.print("item combo : ") ;
        Object valeur = combo.getSelectedItem() ;
        System.out.println((String) valeur);
    }*/
    private String[] couleurs = {"rouge", "bleu", "gris", "vert","jaune",
            "noir" };
    private JComboBox combo;
}
public class Test{
    public static void main (String args[]){
        FenCombo fen = new FenCombo();
        fen.setVisible(true);
    }
}


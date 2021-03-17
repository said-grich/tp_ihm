package tp5.ex7;
import java.awt.*; import java.awt.event.*;
import java.util.Objects;
import javax.swing.*;
import javax.swing.event.* ; // utile pour ListSelectionListener
class FenList1 extends JFrame /*implements ListSelectionListener*/{
    public FenList1(){
        setTitle("Essais boite de liste"); setSize (480, 360) ;
        Container contenu = getContentPane();
        liste = new JList(couleurs) ;
        liste.setBounds(150,10,100,30);
        JLabel selectedValue=new JLabel();
        selectedValue.setBounds(120,200,300,30);
        contenu.add(selectedValue);
        contenu.add(liste);
        liste.addListSelectionListener((e)->{
            if(!e.getValueIsAdjusting()){
                Object valeurs = liste.getSelectedValue();
                    selectedValue.setText("le couleur sélectionné est :"+(String) valeurs);
            }
        }) ;
    }
  /*  public void valueChanged(ListSelectionEvent e){
        if (!e.getValueIsAdjusting()){//(1)

            Object[] valeurs = liste.getSelectedValues();
            for(var i = 0 ; i<valeurs.length ; i++)
                System.out.println((String) valeurs[i]);}}
                */
    private String[] couleurs = {"rouge", "bleu", "gris", "vert", "jaune",
            "noir" } ;
    private JList liste;
}
public class TestJList1{
    public static void main(String args[]){
        FenList1 fen = new FenList1();
        fen.setVisible(true);
    }
}
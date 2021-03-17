package tp5.ex9;

import java.awt.*; import javax.swing.*;
class FenScroll extends JFrame{
    public FenScroll(){
        setTitle("Exemple JScrollPane");
        setSize(300, 110);
        Container contenu = getContentPane();
        contenu.setLayout(new FlowLayout() ) ;
        String[] couleurs ={"rouge", "bleu", "gris", "vert", "jaune", "noir",
                "red", "blue", "gray", "green", "yellow", "black"};
        JList liste = new JList(couleurs) ;
        JScrollPane defil = new JScrollPane(liste);
        contenu.add(defil);
    }
}
public class TestJScrollPane{
    public static void main(String args[]){
        FenScroll fen = new FenScroll() ;
        fen.setVisible(true);
    }
}


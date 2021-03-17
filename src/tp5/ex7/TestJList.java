package tp5.ex7;
import java.awt.* ;
import javax.swing.* ;
class FenList extends JFrame{
    public FenList(){
        setTitle("Exemple JList") ;
        setSize(300, 200) ;
        Container contenu = getContentPane() ;
        contenu.setLayout(new FlowLayout()) ;
        String[] couleurs = {"rouge", "bleu", "gris", "vert", "jaune",
                "noir" } ;
        JList liste = new JList(couleurs);
        contenu.add(liste);
    }
}
public class TestJList{
    public static void main(String args[]){
        FenList fen = new FenList() ;
        fen.setVisible(true) ;
    }
}


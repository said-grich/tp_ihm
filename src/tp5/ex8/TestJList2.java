package tp5.ex8;

import java.awt.* ;
import java.util.List;
import javax.swing.* ;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
class FenListe extends JFrame{
    public FenListe(){
        setTitle("Exemple JList 2") ;
        setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Container contenu = getContentPane() ;
        contenu.setLayout(new FlowLayout()) ;
//créer le modèle et ajouter des éléments
        DefaultListModel<String> listeModele = new DefaultListModel<>();
        listeModele.addElement("Rabat");
        listeModele.addElement("Salé");
        listeModele.addElement("Casablanca");
        listeModele.addElement("Kénitra");
        listeModele.addElement("Marrakech");
        listeModele.addElement("Tanger");
        listeModele.addElement("Tétouan");
        listeModele.addElement("Fès");
//créer la liste
        listeVille = new JList<>(listeModele);
        listeVille.addListSelectionListener((e)-> {
                if (!e.getValueIsAdjusting()) {
                    final List<String> selectedValuesList=listeVille.getSelectedValuesList();
                    System.out.println(selectedValuesList);
                }
            }
        );
        add(new JScrollPane(listeVille));//ajout de panneau de defilement
        contenu.add(listeVille);
    }
    private JList<String> listeVille;
}
public class TestJList2{
    public static void main(String args[]){
        FenListe f = new FenListe() ;
        f.setVisible(true) ;
    }
}
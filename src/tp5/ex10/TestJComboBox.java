package tp5.ex10;
import javax.swing.*;
public class TestJComboBox {
    JFrame f;
    TestJComboBox(){
        f = new JFrame("Exemple boite combo");
        String lang[] = { "Python","Java", "Scala", "R", "Ruby"};
        JComboBox c = new JComboBox(lang);
        c.setBounds(40,40,90,20);
        f.add(c);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]){
        new TestJComboBox();
    }
}

package tp5.ex10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestJComboBox1 {
    JFrame f;
    TestJComboBox1(){
        f=new JFrame("Exemple boite combo avec ActionListener");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);
        JButton b=new JButton("Afficher");
        b.setBounds(200,100,150,20);
        String lang[]={"Java","Python","Scala","R","Ruby"};
        final JComboBox cb=new JComboBox(lang);
        cb.setBounds(50, 100,90,20);
        f.add(cb); f.add(label); f.add(b);
        f.setLayout(null);
        f.setSize(450,350);
        f.setVisible(true);
        b.addActionListener(/*new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String data = "Langage de programmation sélectionné: "
                        + cb.getItemAt(cb.getSelectedIndex());
                label.setText(data);}*/
                (e)-> {
                    String data = "Langage de programmation sélectionné: "
                            + cb.getItemAt(cb.getSelectedIndex());
                    label.setText(data);
                }
        );
    }
    public static void main(String[] args) {
        new TestJComboBox1();
    }
}
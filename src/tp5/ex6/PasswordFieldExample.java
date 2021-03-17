package tp5.ex6;
import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.event.*;
import java.util.regex.Pattern;

public class PasswordFieldExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Exemple: mot de passe");

        final JLabel label = new JLabel();
        label.setBounds(20, 170, 400, 50);
        final JPasswordField value = new JPasswordField();
        value.setBounds(100, 75, 100, 30);
        JLabel l1 = new JLabel("Utilisateur:");
        l1.setBounds(20, 20, 180, 30);
        JLabel l2 = new JLabel("Mot de passe:");
        l2.setBounds(20, 75, 80, 30);
        JButton b = new JButton("S'authentifier");
        b.setBounds(100, 150, 120, 30);
        final JTextField text = new JTextField();
        text.setBounds(100, 20, 100, 30);
        JTextField email= new JTextField();
        email.setBounds(100,110,230,30);
        JLabel eLabel= new JLabel("Email: ");
        eLabel.setBounds(20,110,180,30);
        f.add(value);
        f.add(email);
        f.add(eLabel);
        f.add(l1);
        f.add(label);
        f.add(l2);
        f.add(b);
        f.add(text);
        f.setSize(600, 300);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener((e) -> {
          //  Pattern.matches("[/^([\\w-\\.]+)@((?:[\\w]+\\.)+)([a-zA-Z]{2,4})/]",email.getText());
            String data = "Nom utilisateur " + text.getText();
            data += ", Mot de passe: "
                    + new String(value.getPassword())+"  Email: "+email.getText();
            label.setText(data);

        });
        /*
        label.addAncestorListener((e)->{
            label.setText();
        });
    */
    }
}
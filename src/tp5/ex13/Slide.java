package tp5.ex13;

import java.awt.BorderLayout; import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class Slide extends JFrame{
    private JLabel label1 = new JLabel("Java Swing : JSlider",
            JLabel.CENTER);
    private JLabel label = new JLabel("Valeur actuelle : 30");
    public Slide(){
        this.setSize(250, 150);
        this.setTitle("Java Swing: JSlider");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JSlider slide = new JSlider(); slide.setMaximum(100);
        slide.setMinimum(0);
        slide.setValue(30);
        slide.setPaintTicks(true); slide.setPaintLabels(true);
        slide.addChangeListener(

                e->{
                        label.setText("Valeur actuelle : " +
                                ((JSlider)e.getSource()).getValue());
                }
                /*new ChangeListener(){
                                    public void stateChanged(ChangeEvent event){
                                        label.setText("Valeur actuelle : " +
                                                ((JSlider)event.getSource()).getValue());
                                    }
                                }*/
        );
        this.getContentPane().add(label1, BorderLayout.NORTH);
        this.getContentPane().add(slide, BorderLayout.CENTER);
        this.getContentPane().add(label, BorderLayout.SOUTH);
    }
    public static void main(String[] args){
        Slide slide = new Slide();
        slide.setVisible(true);
    }
}
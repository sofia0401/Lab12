package Task1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    public Main(){
        setTitle("Planets");
        JButton[] btns = new JButton[8];
        JTextArea info = new JTextArea();
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,100,600,400);

        Planet[] planets = Planet.values();
        for(int i=0;i<8;++i) {
            btns[i] = new JButton(planets[i].getName());
            btns[i].setBounds(10, i*40, 100, 40);
            add(btns[i]);
        }

        info.setBounds(150,50,400,100);
        add(info);
        info.setEditable(false);
        for (int i=0;i<8;++i) {
            int Index = i;
            btns[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String s = String.format("%s\n\nweight = %.0f kg\nradius = %.1f km\ngravity = %.3f m/s^2",
                            planets[Index].getName(), planets[Index].getWeight(),
                            planets[Index].getRadius(), planets[Index].getGravity());
                    info.setText(s);
                }
            });
        }
    }

    public static void main(String[] args) {

        Main m=new Main();
        m.setVisible(true);
    }
}


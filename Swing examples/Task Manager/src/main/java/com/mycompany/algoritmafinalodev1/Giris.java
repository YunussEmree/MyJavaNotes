package com.mycompany.algoritmafinalodev1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Giris extends JFrame {

    private JButton jbtngirisyap;
    private JTextField jtxtkullaniciadi;
    private JTextField jtxtsifre;
    private JLabel jlblkullaniciadi;
    private JLabel jlblsifre;
    private JPanel jpnlgiris;

    public Giris(){
        setSize(400,400);
        setVisible(true);
        add(jpnlgiris);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        jbtngirisyap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jtxtkullaniciadi.getText().equals("root") && jtxtsifre.getText().equals("12345")){
                    Liste liste = new Liste();
                    liste.setVisible(true);
                    dispose();
                }
                else {
                    System.out.println("Giriş başarısız tekrar deneyiniz!");
                    jtxtkullaniciadi.setText("");
                    jtxtsifre.setText("");
                }
            }
        });
    }
}

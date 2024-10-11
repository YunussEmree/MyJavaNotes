package com.mycompany.algoritmafinalodev1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import static com.mycompany.algoritmafinalodev1.Liste.connection;
import static javax.swing.JOptionPane.showMessageDialog;

public class Gorevekle extends JFrame {

    PreparedStatement statement;
    ResultSet resultSet;
    private JPanel JPanel1;
    private JTextField jtxtgorevadi;
    private JTextField jtxtonem;
    private JTextField jtxtzorluk;
    private JButton görevEkleButton;
    private JButton vazgeçButton;

    static int[] fib = {0,1,1,2,3,5,8,13,21,34,55,89,144};

    static boolean fibmi(int[] fib , int sayi){
        for (int fib1: fib ) {
            if(fib1 == sayi ) return true;
        }
        return false;
    }

    public Gorevekle(){
        add(JPanel1);
        setSize(700,700);
        setVisible(true);
        setTitle("Görev Ekle");
        vazgeçButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Liste liste = new Liste();

            }
        });
        görevEkleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(fibmi(fib, Integer.parseInt(jtxtzorluk.getText()))) {
                    dbHelper dbHelper = new dbHelper();
                    try {
                        String sql = "INSERT INTO gorevler (gorevAdi,onem,zorluk_bilgisi) values(?,?,?)";
                        statement = connection.prepareStatement(sql);

                        statement.setString(1,jtxtgorevadi.getText());
                        statement.setString(2,jtxtonem.getText());
                        statement.setInt(3, Integer.parseInt(jtxtzorluk.getText()));

                        statement.executeUpdate();

                        dispose();
                        Liste liste = new Liste();



                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                } else {
                    showMessageDialog(null, "Lütfen zorluk seviyesini fibonnacci sayısı olarak giriniz.");
                }


            }
        });
    }





}

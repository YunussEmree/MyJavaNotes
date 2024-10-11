package com.mycompany.algoritmafinalodev1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.mycompany.algoritmafinalodev1.Gorevekle.fib;
import static com.mycompany.algoritmafinalodev1.Gorevekle.fibmi;
import static com.mycompany.algoritmafinalodev1.Liste.duzenleid;
import static javax.swing.JOptionPane.showMessageDialog;

public class Duzenle extends JFrame {
    private JTextField jtxtgorevadi;
    private JTextField jtxtonem;
    private JTextField jtxtzorlukbilgisi;
    private JButton güncelleButton;
    private JLabel jlblzorlukbilgisi;
    private JLabel jlblonem;
    private JLabel jlblgorevadi;
    private JPanel jPanel1;
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    public Duzenle() {

        String gorevadi = null;
        String onem = null;
        int zorluk_bilgisi = 0;

        setVisible(true);
        setSize(700,700);
        add(jPanel1);


        dbHelper dbhelper = new dbHelper();

        try {
            connection = dbhelper.getConnection();
            String sql = "Select gorevAdi,onem,zorluk_bilgisi FROM gorevler WHERE id =?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, duzenleid);
            System.out.println(duzenleid);
            resultSet = preparedStatement.executeQuery();


            while (resultSet.next()) {

                gorevadi = resultSet.getString("gorevAdi");
                onem = resultSet.getString("onem");
                zorluk_bilgisi = Integer.parseInt(resultSet.getString("zorluk_bilgisi"));
            }
            jtxtgorevadi.setText(gorevadi);
            jtxtonem.setText(onem);
            jtxtzorlukbilgisi.setText(String.valueOf(zorluk_bilgisi));
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }


        güncelleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String yenigorevadi = jtxtgorevadi.getText();
                String yenionem = jtxtonem.getText();
                int yenizorlukbilgisi = Integer.parseInt(jtxtzorlukbilgisi.getText());
                if(fibmi(fib, (yenizorlukbilgisi))) {
                    try {
                        preparedStatement=connection.prepareStatement("UPDATE gorevler SET gorevAdi = ?, onem = ?, zorluk_bilgisi = ?  WHERE id= ?");
                        preparedStatement.setString(1,yenigorevadi);
                        preparedStatement.setString(2,yenionem);
                        preparedStatement.setString(3, String.valueOf(yenizorlukbilgisi));
                        preparedStatement.setString(4,duzenleid);
                        preparedStatement.executeUpdate();
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    dispose();
                    Liste liste = new Liste();
                } else {
                    showMessageDialog(null, "Lütfen zorluk seviyesini fibonnacci sayısı olarak giriniz.");
                }
                }




        });
    }
}

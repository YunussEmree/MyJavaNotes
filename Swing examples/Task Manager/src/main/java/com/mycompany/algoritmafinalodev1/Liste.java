package com.mycompany.algoritmafinalodev1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Liste extends JFrame {
    private JPanel jPanel1;
    private JTable table1;
    private JButton görevSilButton;
    private JButton görevEkleButton;
    private JButton görevBitirildiButton;
    private JTable table2;
    private JButton görevDüzenleButton;

    static String duzenleid;

    ResultSet resultSet;
    static Connection connection;
    Statement statement;
    PreparedStatement preparedStatement;

    public Liste(){
        setSize(700,700);
        setVisible(true);
        add(jPanel1);

        dbHelper dbHelper = new dbHelper();
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("Select id,gorevAdi,onem,zorluk_bilgisi FROM gorevler WHERE bitti = 0 ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        table1.setModel(DbUtils.resultSetToTableModel(resultSet));


        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("Select id,gorevAdi,onem,zorluk_bilgisi FROM gorevler WHERE bitti = 1");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        table2.setModel(DbUtils.resultSetToTableModel(resultSet));
        görevEkleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Gorevekle gorevekle = new Gorevekle();
                dispose();
            }
        });
        görevSilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sutun= 0;
                int satir = table1.getSelectedRow();
                String id= table1.getModel().getValueAt(satir, sutun).toString();
                try {
                    preparedStatement=connection.prepareStatement("DELETE FROM gorevler WHERE id= ?");
                    preparedStatement.setString(1,id);
                    preparedStatement.executeUpdate();

                    dispose();
                    Liste liste = new Liste();



            } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        görevBitirildiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sutun= 0;
                int satir = table1.getSelectedRow();
                String id= table1.getModel().getValueAt(satir, sutun).toString();


                try {
                    preparedStatement=connection.prepareStatement("UPDATE gorevler SET bitti=1 WHERE id= ?");
                    preparedStatement.setString(1,id);
                    preparedStatement.executeUpdate();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }

                dispose();
                Liste liste = new Liste();

            }
        });
        görevDüzenleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int sutun= 0;
                if(table1.getSelectedRow() != -1) {

                    int satir = table1.getSelectedRow();
                    duzenleid= table1.getModel().getValueAt(satir, sutun).toString();
                }
                if(table2.getSelectedRow() != -1) {

                    int satir = table2.getSelectedRow();
                    duzenleid= table2.getModel().getValueAt(satir, sutun).toString();
                }


                Duzenle duzenle = new Duzenle();
                dispose();
            }
        });
    }
}

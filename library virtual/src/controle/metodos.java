package Controle;

import java.awt.Color;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Vitor
 */
public class Metodos {

    static PreparedStatement ps;
    static Connection con = Conexao.conectar();
    static ResultSet rs;

    public static void MouseEntered(JButton b) {
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
    }

    public static void MouseExited(JButton b) {
        b.setBackground(new Color(204, 204, 204));
        b.setForeground(Color.BLACK);
    }

    public static void carregaCB(JComboBox cb, String sql, String campoRetornado) {

        try {
            Connection con = Conexao.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            cb.removeAllItems();
            cb.addItem(" ");
            while (rs.next()) {
                cb.addItem(rs.getString(campoRetornado));
            }
            Conexao.desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO CARREGAR COMBOBOX.\n\nERRO: " + ex.getMessage(),
                    "CARREGAR COMBOBOX", JOptionPane.ERROR_MESSAGE);
        }
    }
}

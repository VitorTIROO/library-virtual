package Controle;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Vitor
 */
public class Conexao {

    public static Connection CON;
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/lb";

    public static void main(String[] args) {
        conectar();
        desconectar();
    }

    public static Connection conectar() {

        try {

            Class.forName(DRIVER);
            CON = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("CONECTADO COM SUCESSO!!!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO FAZER A CONEXÃO COM O BANCO DE DADOS!!!\n\nERRO: " + ex.getMessage(),
                    "CONEXÃO COM BANCO DE DADOS", JOptionPane.ERROR_MESSAGE);

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO FAZER A CONEXÃO COM O BANCO DE DADOS!!!\n\nERRO: " + ex.getMessage(),
                    "CONEXÃO COM BANCO DE DADOS", JOptionPane.ERROR_MESSAGE);
        }
        return CON;
    }

    public static void desconectar() {
        try {
                CON.close();
            System.out.println("DESCONECTADO COM SUCESSO!!!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO FAZER A DESCONEXÃO COM O BANCO DE DADOS!!!\n\nERRO: " + ex.getMessage(),
                    "CONEXÃO COM BANCO DE DADOS", JOptionPane.ERROR_MESSAGE);
        }
    }
}

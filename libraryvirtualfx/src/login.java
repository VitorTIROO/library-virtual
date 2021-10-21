import Controle.Conexao;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Vitor
 */
public class login implements Initializable {
    
    @FXML
    private TextField tfuser;
    @FXML
    private Label lDica;
    @FXML
    private Button bEntrar;
    @FXML
    private Button bSair;
    @FXML
    private Button bVisitante;
    @FXML
    private PasswordField pfsenha;
    
    private int CONT = 0, perfil;
    private String usuario;
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection con = Conexao.conectar();
    @FXML
    private ImageView ivUser;
    @FXML
    private ImageView ivSenha;
    Image certo = new Image("/Imagens/certo.png");
    Image errado = new Image("/Imagens/errado.png");
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    @FXML
    public void entrar(ActionEvent event) {
        entrar();
    }
    
    @FXML
    public void bVisitanteActionEvent(ActionEvent event) {
        //new JFPrincipal(usuario, 0).setVisible(true);
        //dispose();
    }
    
    @FXML
    public void sair(ActionEvent event) {
        Conexao.desconectar();
        System.exit(0);
    }
    
    @FXML
    private void tfUserKeyReleased(KeyEvent event) {
//        tfuser.setText(tfuser.getText().toUpperCase());
//        tfuser.setText(tfuser.getText());
    }
    
    void entrar() {
        
        if (tfuser.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Digite o usuário.", "Login", JOptionPane.INFORMATION_MESSAGE);
        } else if (pfsenha.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Digite a senha.", "Login", JOptionPane.INFORMATION_MESSAGE);
        } else {
            
            try {
                
                String sql = "select * from usuario where login = '" + tfuser.getText() + "' and senha = '" + pfsenha.getText() + "'";
                
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                
                if (rs.next()) {
                    usuario = rs.getString("nome");
                    perfil = rs.getInt("perfil");
                    JOptionPane.showMessageDialog(null, "LOGIN FEITO COM SUCESSO!!!");
                    ivSenha.setImage(certo);
                    ivUser.setImage(certo);
                    //new JFPrincipal(usuario, perfil).setVisible(true);
                    //dispose();
                    //Conexao.desconectar();

                } else {
                    
                    String di = "select * from usuario where login = '" + tfuser.getText() + "'";
                    
                    ps = con.prepareStatement(di);
                    rs = ps.executeQuery();
                    
                    if (rs.next()) {
                        
                        lDica.setText(rs.getString("dica"));
                        ivUser.setImage(certo);
                        
                        ivSenha.setImage(errado);
                        JOptionPane.showMessageDialog(null, "SENHA INCORRETA.", "LOGIN", JOptionPane.INFORMATION_MESSAGE);
                        pfsenha.requestFocus();
                        pfsenha.setText("");
                        
                    } else {
                        ivUser.setImage(errado);
                        JOptionPane.showMessageDialog(null, "USUÁRIO NÃO EXISTE!!!", "LOGIN", JOptionPane.INFORMATION_MESSAGE);;
                    }
                    CONT = CONT + 1;
                    if (CONT == 3) {
                        System.exit(0);
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERRO AO ENTRAR NO SISTEMA\n\nERRO: " + ex.getMessage(), "LOGIN", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }
    
}

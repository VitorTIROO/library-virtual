

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Vitor
 */
public class main extends Application {
    
    @Override
    public void start(Stage stage) {
        
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("login.fxml"));
            stage.setTitle("LIBRARY VIRTUAL - LOGIN");
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.show();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO INICIAR A APLICAÇÃO: " + ex.getMessage(), "LOGIN", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author rodolfo
 */
public class TelaLoginController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private Button btnEsqueciASenha;

    @FXML
    private Button btnAcessar;

    @FXML
    private TextField edtiLogin;

    @FXML
    private PasswordField editSenha;

    @FXML
    void verificarLogin(ActionEvent event) throws IOException {
        System.out.println("Login: " + edtiLogin.getText() + "  Senha: " + editSenha.getText());
        maitrerant.MaitreRant.instance.iniciaTelaPrincipal();
    }

    @FXML
    void actionEsqueciASenha(ActionEvent event) {
        System.out.println("Esqueci a senha Login: " + edtiLogin.getText() + "  Senha: " + editSenha.getText());
    }

}

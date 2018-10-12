/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maitrerant;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


import controle.*;

/**
 *
 * @author rodolfo
 */
public class MaitreRant extends Application {
    
    private static Stage stage;//uma janela
    
    public static MaitreRant instance;

  
    
    @Override
    public void start(Stage stage) throws IOException {
        instance = this;
        iniciaTelaLogin(stage);
    }   
    
    public static void main(String[] args) {
       // stage = new Stage();
        launch(args);
        
    }
    
    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        MaitreRant.stage = stage;
    }
    
    private void iniciaTelaLogin(Stage stage) throws IOException{
        
        //Carrega o arquivo FXML
        Parent root = FXMLLoader.load(getClass().getResource("/view/TelaLogin.fxml"));
        
        //Coloca o FXML em uma cena
        Scene scene = new Scene(root);
        
        stage.setTitle("Login");
        
        //Coloca a cena em uma janela
        stage.setScene(scene);
        
        //Abrea a janela
        stage.show();
        
        setStage(stage);
    
    }
    
    public void iniciaTelaPrincipal() throws IOException{
        
        //Carrega o arquivo FXML
        Parent root = FXMLLoader.load(getClass().getResource("/view/TelaInicialGerente.fxml"));
        
        //Coloca o FXML em uma cena
        Scene scene = new Scene(root);
        
        stage.setTitle("Gerente");
        
        //Coloca a cena em uma janela
        stage.setScene(scene);
        
        stage.setX(0);
        stage.setY(0);
        
        //Abrea a janela
        stage.show();
        
        setStage(stage);
    
    }
    
}

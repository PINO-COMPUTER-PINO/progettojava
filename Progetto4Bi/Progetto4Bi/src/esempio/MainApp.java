/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempio;


import esempio.model.Rubrica;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author vihandu.galhena
 */
public class MainApp extends Application
{
    private Stage primaryStage;
    private Rubrica rubrica;
    private MainController mainController;

    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Esempio struttura base");

        inizializza();
        
    }
    
     public static void main(String[] args) 
    {
        launch(args);
    }

    private void inizializza() 
    {
        
        try 
        {
            
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("mainGui.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            
            
            
            
            //inizializzazione del model
            rubrica=new Rubrica();
            mainController=loader.getController();
            mainController.setMainApp(this);
            
            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        
    }

    public Rubrica getRubrica() {
        return rubrica;
    }

    void aggiungiPersona(String nome, String cognome) {
        //To change body of generated methods, choose Tools | Templates.
        rubrica.aggiungiPersona(nome, cognome);
    }
    
    
}

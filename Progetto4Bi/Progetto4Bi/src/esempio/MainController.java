/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempio;


import javafx.fxml.FXML;
import javafx.scene.control.*;

/**
 *
 * @author vihandu.galhena
 */
public class MainController 
{
    @FXML   TextField txtCognome;
    @FXML   TextField txtNome;
    @FXML   Button btnScambia;
    @FXML   TextArea listaNomi;
    
    private MainApp mainApp;
    
    
    
    @FXML
    private void initialize()
    {
        
        
    }
    
    @FXML
    private void scambiaTesto()
    {
        String tmp=txtCognome.getText();
        txtCognome.setText(txtNome.getText());
        txtNome.setText(tmp);
    }
    
    @FXML
    private void attivaDisattiva()
    {
        btnScambia.setDisable(!btnScambia.isDisable());
    }
    
    @FXML
    private void aggiunigiALista()
    {
        String nomeCognome=txtCognome.getText()+" "+txtNome.getText()+"\n";
        listaNomi.appendText(nomeCognome);
        mainApp.aggiungiPersona(txtNome.getText(),txtCognome.getText());
        
    }

    public void setMainApp(MainApp mainApp) {
         //To change body of generated methods, choose Tools | Templates.
         this.mainApp=mainApp;
    }
}

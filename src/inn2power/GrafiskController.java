/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inn2power;

import be.Company;
import dal.CompanyDAO;
import inn2power.GUI.Model.CompanyModel;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TitledPane;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Daniels PC
 */
public class GrafiskController implements Initializable
{

    @FXML
    private ListView<Company> listCompanies;
    private CompanyModel companyModel;
    
   



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        
        
            
            companyModel = new CompanyModel();
            listCompanies.setItems(companyModel.getAllCompanies());
            
       
        
    }    

    
}

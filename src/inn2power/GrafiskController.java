/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inn2power;

import be.Company;
import dal.CompanyDAO;
import inn2power.BLL.ContainsSearch;
import inn2power.BLL.IWordSearcher;
import inn2power.GUI.Model.CompanyModel;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
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
    @FXML
    private TextField txtQuery;
    @FXML
    private RadioButton radioSME;
    
   
    public GrafiskController()
    {
        CompanyModel model = new CompanyModel();
        
    }


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        
        
            
            companyModel = new CompanyModel();
            listCompanies.setItems(companyModel.getAllCompanies());
            
       
        
    }    

    @FXML
    void handleSearch(ActionEvent event)
    {   
        
        
        String query = txtQuery.getText().trim();
        List<String> searchResult = null;
        IWordSearcher searchStrategy;
        boolean isCaseSensitive = radioSME.isSelected();
        searchStrategy = new ContainsSearch(query, isCaseSensitive);
        //searchResult = new ContainsSearch.search(searchStrategy);
        
    
        
    }
}

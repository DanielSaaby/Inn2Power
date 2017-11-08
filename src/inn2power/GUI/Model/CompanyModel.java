/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inn2power.GUI.Model;

import be.Company;
import dal.CompanyDAO;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Daniels PC
 */
public class CompanyModel
{
    private final ObservableList<Company> companies;
    private CompanyDAO companyDAO;
    

    public CompanyModel()
    {
        this.companies = FXCollections.observableArrayList();
        try
        {
            companyDAO = new CompanyDAO();
            List<Company> cs = companyDAO.getAllCompanies();
            companies.addAll(cs);
        } catch (IOException ex)
        {
            Logger.getLogger(CompanyModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ObservableList<Company> getAllCompanies()
    {
        return companies;
    }
    
}

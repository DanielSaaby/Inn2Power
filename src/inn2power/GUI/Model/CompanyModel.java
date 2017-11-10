/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inn2power.GUI.Model;

import be.Company;
import dal.CompanyDAO;
import inn2power.BLL.CompanySearcher;
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
    private CompanySearcher companySearcher;

    public CompanyModel()
    {

        this.companies = FXCollections.observableArrayList();
        try
        {
            companySearcher = new CompanySearcher();
            companyDAO = new CompanyDAO();
            List<Company> cs = companyDAO.getAllCompanies();
            companies.addAll(cs);
        } 
        
        catch (IOException ex)
        {
            Logger.getLogger(CompanyModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public ObservableList<Company> getAllCompanies()
    {
        return companies;
    }

    public void search(String searchText)
    {
        //Now I will do some BLL logic here:
        List<Company> allCompanies = companyDAO.getAllCompanies();
        List<Company> searchResults = companySearcher.searchByCompanyName(allCompanies, searchText);
        companies.clear();
        companies.addAll(searchResults);
    }
    
}

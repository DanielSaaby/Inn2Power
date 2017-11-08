/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inn2power.GUI.Model;

import be.Company;
import dal.CompanyDAO;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Daniels PC
 */
public class CompanyModel
{
    private final ObservableList<Company> companies;
    public CompanyDAO company;
    

    public CompanyModel()
    {
        this.companies = FXCollections.emptyObservableList();
        companies.addAll(companies);
    }

    public ObservableList<Company> getAllCompanies()
    {
        return companies;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inn2power.GUI;

import be.Company;
import dal.CompanyDAO;
import inn2power.DAL.MyCompanyDAO;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Daniels PC
 */
public class Inn2Power extends Application
{
    
    @Override
    public void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("view/Grafisk.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        File file = new File("companies.csv");
        
        MyCompanyDAO myCompanyDAO = new MyCompanyDAO();
        
        List<Company> allCompanies = myCompanyDAO.readCompaniesFromCSV(file);
        
        System.out.println("Companies in CSV: " + allCompanies.size());
        
        File saveFile = new File("Companies.ser");
        
        myCompanyDAO.writeCompaniesToSer(saveFile,allCompanies);
        
        List<Company> savedCompanies = myCompanyDAO.readCompaniesFromSer(saveFile);
        
        System.out.println("Saved companies count: " + savedCompanies.size());
        
        CompanyDAO companyDAO = new CompanyDAO();
        
        List<Company> allCompaniesEmpty = companyDAO.getAllCompanies();
        
        
        
        launch(args);
    }
    
}

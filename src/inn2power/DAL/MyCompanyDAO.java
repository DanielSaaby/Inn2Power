/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inn2power.DAL;

import be.Company;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniels PC
 */
public class MyCompanyDAO implements ICompanyDAO
{

    
    @Override
    public List<Company> readCompaniesFromCSV(File file) throws IOException
    {
        List<Company> companies = new ArrayList<>();
        
        for (String line : Files.readAllLines(file.toPath(), StandardCharsets.ISO_8859_1))
        {
            try
            {
            String[] splitLine = line.split(",");
            
            int id = Integer.parseInt(splitLine[0]);
            String name = splitLine[1];
            String country = splitLine[2];
            String address= splitLine[3];
            String website = splitLine[4];
            String supplyChainCategority = "Hest";
            String buisnessRole = "Consultant";
            double lat = Double.parseDouble(splitLine[5]);
            double lng = Double.parseDouble(splitLine[6]);
            int isSME = Integer.parseInt(splitLine[7]);
            
            
            Company c = new Company(id, name, country, address, website, supplyChainCategority, buisnessRole, lat, lng, isSME);
            
            companies.add(c);
            }
            catch (NumberFormatException nfe)
            {
                System.out.println("Exception: " + nfe);
            }
        }
        
        return companies;
    }

    @Override
    public List<Company> readCompaniesFromSer(File file) throws IOException
    {
        List<Company> companies = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file)))
        {
            companies = (List<Company>) ois.readObject();
        }
        catch (ClassNotFoundException ex)
        {
            //Do nothing;
        } 
        return companies;
    }

   
        
    
    

    @Override
    public void writeCompaniesToSer(File file, List<Company> companies) throws IOException
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file)))
        {
            
            oos.writeObject(companies);
            
            
        }
    }

   
}

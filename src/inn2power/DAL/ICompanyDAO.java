/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inn2power.DAL;

import be.Company;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Daniels PC
 */
public interface ICompanyDAO
{
    public List<Company> readCompaniesFromCSV(File file) throws IOException;    

    public List<Company> readCompaniesFromSer(File file) throws IOException;

    public void writeCompaniesToSer(File file, List<Company> companies) throws IOException;


}

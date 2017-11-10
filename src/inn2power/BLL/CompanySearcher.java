/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inn2power.BLL;

import be.Company;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniels PC
 */
public class CompanySearcher
{
    public List<Company> searchByCompanyName(List<Company> companies, String query)
    {
       List<Company> searchResult = new ArrayList<Company>();
       
        for (Company company : companies)
        {
            if(company.getName().toLowerCase().contains(query.toLowerCase()))
            {
                searchResult.add(company);
            }
        }
        return searchResult;
        
    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inn2power.BLL;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import dal.CompanyDAO;

/**
 *
 * @author Daniels PC
 */
public class ContainsSearch extends QuerySearchTemplate

       
{
    private CompanyDAO companyDAO;
  
  
    public ContainsSearch(String query, boolean caseSensitive)
             
    {
        super(query, caseSensitive);
    }

    @Override
    public boolean compare(String word)
    {
        if(caseSensitive)
        {
            return word.contains(query);
        }
        else
        {
            return word.toLowerCase().contains(query.toLowerCase());
        }
    }
    public List<String> search(IWordSearcher comparer) throws FileNotFoundException
    {
        List<String> allWords = getAllWords();
        List<String> result = new ArrayList<>();
        for (String word : allWords)
        {
            if(comparer.compare(word))
            {
                result.add(word);
            }
        }
        return result;
    }

    public List<String> getAllWords() throws FileNotFoundException
    {
        List<String> allWords = companyDAO.getAllCountries();
        return allWords;
    }

   

   
    
}

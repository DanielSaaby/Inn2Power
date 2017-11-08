/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inn2power.BLL;

/**
 *
 * @author Daniels PC
 */
public abstract class QuerySearchTemplate implements IWordSearcher
{
    protected final String query;
    protected final boolean caseSensitive;
    
    public QuerySearchTemplate(String query, boolean caseSensitive)
    {
        this.query = query;
        this.caseSensitive = caseSensitive;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inn2power.DAL;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;

/**
 *
 * @author Daniels PC
 */
public class DataBaseConnector
{
    private SQLServerDataSource dataSource;
    
    public DataBaseConnector()
    {
        dataSource = new SQLServerDataSource();
        dataSource.setServerName("EASV-DB2");
        dataSource.setPortNumber(1433);
        dataSource.setDatabaseName("Inn2Power_Daniel");
        dataSource.setUser("CS2017A_5");
        dataSource.setPassword("CS2017A_5");
        
    }
    
    public Connection getConnection() throws SQLServerException
    {
        return dataSource.getConnection();
    }
    
}

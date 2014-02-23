package in.darkstars.dao;

import in.darkstars.exception.DataSourceException;
import in.darkstars.helper.Constant;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * @author dis-card
 * 
 */
public class ConnectionFactory {

	private static Context ctx = null;
	private static DataSource ds = null;

	public static Connection getConnection() throws SQLException, DataSourceException {
		
		Connection con = null;
		
		try
		{
			if ( ctx == null )
			{
				synchronized(Context.class)
				{
					if ( ctx == null )
						ctx = new InitialContext();
				}
			}			
			if ( ds == null )
			{
				synchronized (DataSource.class) {
					if (ds == null)
						ds = (DataSource) ctx.lookup(Constant.DATASOURCE);					
				}
			}
			con = ds.getConnection();
			
		}
		catch (NamingException e )
		{
			e.printStackTrace();
			throw new DataSourceException();
		} 
		return con;
	}
}

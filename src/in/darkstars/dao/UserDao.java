package in.darkstars.dao;

import in.darkstars.dto.DataTransferObject;
import in.darkstars.dto.User;
import in.darkstars.exception.DataAccessException;
import in.darkstars.exception.DataSourceException;
import in.darkstars.exception.RecordNotFoundException;
import in.darkstars.helper.Constant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;

/**
 * @author dis-card
 *
 */
public class UserDao implements Dao{
	
	public int save(DataTransferObject dataTransferObject)
	{
		int userId = -1;
		return userId;
		
	}

	public DataTransferObject get(int i) {
		return null;
	}
	
	public void check(DataTransferObject dataTransferObject) throws DataAccessException, DataSourceException, RecordNotFoundException
	{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user = (User)dataTransferObject;
		
		try
		{
			con = ConnectionFactory.getConnection();
			ps = con.prepareStatement(Constant.GETUSERQUERY);
			ps.setString(1,user.getUsername());
			ps.setString(2,user.getPassword());
			rs = ps.executeQuery();
			if ( !rs.next() )
			{
				throw new RecordNotFoundException();
			}
		}
		catch (SQLException e )
		{
			e.printStackTrace();
			throw new DataAccessException();
		}
		finally
		{
			try {
				DbUtils.close(rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				DbUtils.close(ps);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				DbUtils.close(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/* (non-Javadoc)
	 * @see in.darkstars.dao.Dao#get(java.lang.String)
	 */
	public DataTransferObject get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}

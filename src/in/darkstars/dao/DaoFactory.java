package in.darkstars.dao;

import in.darkstars.helper.Constant;

/**
 * @author dis-card
 *
 */
public class DaoFactory {
	
	private static UserDao userDao;
	
	public static Dao getDao(String daoType)
	{
		Dao dao = null;
		if (daoType.equals(Constant.USER))
		{
			if ( userDao == null )
			{
				synchronized(UserDao.class)
				{
					if (userDao == null)
						userDao = new UserDao();
				}
			}
			dao = userDao;
		}
		
		
		
		return dao;
	}
}

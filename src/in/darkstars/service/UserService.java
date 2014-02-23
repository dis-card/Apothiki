package in.darkstars.service;

import in.darkstars.dao.DaoFactory;
import in.darkstars.dao.UserDao;
import in.darkstars.dto.User;
import in.darkstars.exception.DataAccessException;
import in.darkstars.exception.DataSourceException;
import in.darkstars.exception.RecordNotFoundException;
import in.darkstars.exception.UserNotFoundException;
import in.darkstars.helper.Constant;

/**
 * @author dis-card
 *
 */
public class UserService implements Service {
	
	public void authenticate(User user) throws UserNotFoundException, DataAccessException, DataSourceException
	{
		UserDao userDao = (UserDao) DaoFactory.getDao(Constant.USER);
		try {
			userDao.check(user);
		} catch (RecordNotFoundException e) {
			throw new UserNotFoundException();
		}
	}
}

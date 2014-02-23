package in.darkstars.backingbean;

import java.lang.reflect.InvocationTargetException;

import in.darkstars.dto.User;
import in.darkstars.exception.DataAccessException;
import in.darkstars.exception.DataSourceException;
import in.darkstars.exception.UserNotFoundException;
import in.darkstars.helper.Constant;
import in.darkstars.service.ServiceFactory;
import in.darkstars.service.UserService;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

/**
 * @author dis-card
 *
 */
public class LoginBean {
	
	private String username;
	private String password;
	private String errorMsg;
	
	/**
	 * @return the errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}
	/**
	 * @param errorMsg the errorMsg to set
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	private String outcome=Constant.SUCCESS;
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		if (username != null)
			username = username.trim();
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		if (password != null)
			password = password.trim();
		this.password = password;
	}
	
	public String authenticate() throws IllegalAccessException, InvocationTargetException
	{
		User user = new User();
		BeanUtils.copyProperties(user, this);
		UserService userService = (UserService)ServiceFactory.getService(Constant.USER);
		try {
			userService.authenticate(user);
			HttpSession session = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
			session.setAttribute("username", username);
			
		} catch (UserNotFoundException e) {
			outcome=Constant.FAILURE;
			errorMsg = Constant.USERNOTFOUNDEXCEPTIONMESSAGE;
		} catch (DataAccessException e) {
			outcome=Constant.FAILURE;
			errorMsg = Constant.DATAACCESSEXCEPTIONMESSAGE;
		} catch (DataSourceException e) {
			outcome=Constant.FAILURE;
			errorMsg = Constant.DATASOURCEEXCEPTIONMESSAGE;
		}
		return outcome;
	}
	
	public String reset()
	{
		outcome=Constant.FAILURE;
		setUsername(null);
		setPassword(null);
		return outcome;
	}
}

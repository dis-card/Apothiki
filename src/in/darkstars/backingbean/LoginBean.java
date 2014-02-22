package in.darkstars.backingbean;

import in.darkstars.helper.Constant;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 * @author dis-card
 *
 */
public class LoginBean {
	
	private String username;
	private String password;
	
	private String outcome="success";
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
			password.trim();
		this.password = password;
	}
	
	public String authenticate()
	{
		if (getUsername().equals(getPassword()))
		{
			HttpSession session = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
			session.setAttribute("username", username);
			outcome="welcome";
		}
		return outcome;
	}
	
	public String reset()
	{
		outcome=Constant.SUCCESS;
		setUsername(null);
		setPassword(null);
		return outcome;
	}
}

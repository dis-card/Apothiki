package in.darkstars.backingbean;

import in.darkstars.helper.Constant;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 * @author dis-card
 *
 */
public class HomeBean {
	
	
	
	
	public String logout()
	{
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		session.invalidate();
		return Constant.LOGOUT;
	}

}

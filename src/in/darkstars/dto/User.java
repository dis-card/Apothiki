package in.darkstars.dto;

import java.io.Serializable;

/**
 * @author dis-card
 *
 */
public class User implements DataTransferObject,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7294483967719744605L;
	private String username;
	private String password;
	private long id;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
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
		this.password = password;
	}

}

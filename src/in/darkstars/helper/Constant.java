package in.darkstars.helper;


/**
 * @author dis-card
 *
 */
public class Constant {
	
	public static final String URL="http://localhost:8080/Apothiki";
	public static final String SUCCESS="success";
	public static final String DATASOURCE="java:comp/env/libraryManagement";
	public static final String USER="user";
	public static final String DATAACCESSEXCEPTIONMESSAGE = "Problem in connection to the database, please contact the customer care services.";
	public static final String USERNOTFOUNDEXCEPTIONMESSAGE = "User doesn't exist, please check the username and password and try again";
	public static final String GETUSERQUERY = "select username from user where username=? and password=?";
	public static final String DATASOURCEEXCEPTIONMESSAGE = "Problem in initializing the data source, please contact customer care services";
	public static final String FAILURE = "failure";

}

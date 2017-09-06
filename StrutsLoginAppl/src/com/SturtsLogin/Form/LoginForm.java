/**
 * 
 */
package com.SturtsLogin.Form;

import org.apache.struts.action.ActionForm;

/**
 * @author Jevic
 *
 */
public class LoginForm extends ActionForm {
	private String userName;
	private String password;
	public LoginForm() {
		this.userName = null;
		this.password = null;
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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

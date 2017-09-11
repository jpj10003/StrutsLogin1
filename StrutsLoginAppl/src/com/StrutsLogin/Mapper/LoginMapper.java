/**
 * 
 */
package com.StrutsLogin.Mapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.StrutsLogin.Query.LoginQuery;
import com.SturtsLogin.Form.LoginForm;

/**
 * @author Jevic
 *
 */
public class LoginMapper {

	private Connection connection;
	private ResultSet rs;

	public LoginMapper() {
		String url = "jdbc:mysql://localhost:3306/" + "dNBA" + "?autoReconnect=true&useSSL=false";
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = (Connection) DriverManager.getConnection(url, "root", "jevic");

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			((Throwable) e).printStackTrace();
		}
	}

	public String validateUser(LoginForm login, HttpServletRequest request) {
		LoginQuery loginQuery = new LoginQuery();
		
		return loginQuery.validateUser(login, request, connection, rs);
		
	}

}

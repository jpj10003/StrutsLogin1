/**
 * 
 */
package com.StrutsLogin.Query;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.SturtsLogin.Form.LoginForm;


/**
 * @author Jevic
 *
 */
public class LoginQuery {

	public LoginQuery() {

	}

	public String validateUser(LoginForm login, HttpServletRequest request, Connection connection, ResultSet rs) {
		{
			String query = "Select * from tuser where user_name = ?";
			String userCompare = login.getUserName();
			String password = login.getPassword();
			
			try {
				PreparedStatement ps =   connection.prepareStatement(query);
				ps.setString(1, userCompare);
				rs = ps.executeQuery();
				rs.next();
				if (!rs.getString("user_name").equals("null)"))
				{
					if(rs.getString("password").equals(password))
					{
						request.getSession().setAttribute("userName", login.getUserName());
						return "sucess";
					}
					else 
					{
						return "failure";
					}
				}
				else
				{
					return "failure";
				}
			} catch( SQLException e)
			{
				e.printStackTrace();
			}
			return "failure";
		}
	}

}

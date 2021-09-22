package com.sonar.analysis;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementExample {

	public boolean authendicate(javax.servlet.http.HttpServeletRequest request, java.sql.Connection connection) throws SQLException {
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		String query = "Select * from users Where user = '"+ user + "' and pass '"+ pass + "'"; //Unsafe
		// if the special value "foo' OR 1=1 -- '" is passed as either the user or pass, authendication is bypassed
		//Indeed if it is passed as a user , the query becomes
		//Select * From users where user ='foo'" OR 1=1 --' AND pass = '...'
		//As '--' is the comment till end of line syntax in SQL, this is equivalent to :
		//Select * from users where user ="foo" or 1=1
		//which is equivalent to :
		//Select * from users
		
		java.sql.Statement statement = Connection.createStatement();
		java.sql.ResultSet resultSet = statement.executeQuery(query);
		
		return resultSet.next();
		
	}
	
	public boolean authendicate(javax.servlet.http.HttpServletRequest request,java.sql.Connection connection) throws SQLException{
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		String query = "Select * from users where user=? and pass=?"; //safe even if authendicate() method is still vulnerable to brute force attack in this specific case.
		
		java.sql.PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, user); // Will be properly escaped
		statement.setString(2,pass);
		java.sql.ResultSet resultSet = Statement.executeQuery();
		return resultSet.next();
	}
	
}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pojos.User;
import utils.DBUtils;

public class UserDaoImpl implements IUserDao {
	
	private Connection connection;
	private PreparedStatement pst1;

	
	public UserDaoImpl()throws  ClassNotFoundException,SQLException{
		//id | name    | email          | password | reg_amt | reg_date   | role
		this.connection=DBUtils.fetchDBConnection();
		pst1=connection.prepareStatement("SELECT * FROM customers55 WHERE email=? and password=?");
				
		//pst1=connection.prepareStatement("SELECT id=?,name=?,email=?,password=?,reg_amt=?,reg_date=?,role FROM customers55");
		
	}
	
	

	@Override
	public User validateUser(String email, String password) throws Exception {
		pst1.setString(1, email);
		pst1.setString(2,password);
	
		
		try(ResultSet rst=pst1.executeQuery())
		{

			if(rst.next())
			{
				return new User(rst.getInt(1), rst.getString(2), email,password, rst.getDouble(5), rst.getDate(6),
						rst.getString(7));


			}
		}
		
		return null;

		
	

	}
	public void cleanUp()throws SQLException
	{
		if(pst1!=null)
			pst1.close();
		System.out.println("User dao is cleand Up!!!!");
	}



}

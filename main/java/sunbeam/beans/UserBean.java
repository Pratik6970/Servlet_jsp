package sunbeam.beans;

import java.sql.SQLException;

import dao.UserDaoImpl;
import pojos.User;

public class UserBean {
	private String email;
	private String password;
	
	private UserDaoImpl userdao;
	
	private User ValidatedUserDetails;
	
	public UserBean() throws ClassNotFoundException, SQLException
	{
		System.out.println("user bean constructor");
		userdao=new UserDaoImpl();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserDaoImpl getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDaoImpl userdao) {
		this.userdao = userdao;
	}

	public User getValidateDUserdetails() {
		return ValidatedUserDetails;
	}

	public void setValidatedUserdetails(User validateDUserdetails) {
		ValidatedUserDetails = validateDUserdetails;
	}
	
	public String authenticateUser() throws Exception
	{
		System.out.println("email and password are "+email+" "+password);
		ValidatedUserDetails=userdao.validateUser(email, password);
		if(ValidatedUserDetails==null)
		{
			return "Invalid Login details Sorry Please Try Again!!!!!";
		}
		
		else if(ValidatedUserDetails.getRole().equals("customer"))
		{
			return "Welcome To Customer Login!!!!!";
		}
		return"Login successfully congrats !!!!!!!";
	  
		
	}
	
    
}

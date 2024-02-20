package dao;

import pojos.User;

public interface IUserDao {
	
	User validateUser(String email ,String password)throws Exception;

}

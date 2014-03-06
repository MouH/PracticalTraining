package ambow.vsts.dao;

import ambow.vsts.entity.User;

public interface UserDao {
	public   User   login(String  name, String passwd);
	public   void      addUser( User  user);
	public   void      updateUser( User  user);
}

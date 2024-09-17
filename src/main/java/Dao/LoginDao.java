package Dao;

import Models.UserModel;

public interface LoginDao {
	UserModel login(String email,String password);
	UserModel loginEmail(String email);
	void updatePass(String email, String password);
	void updateProfile(UserModel user);
	UserModel getUserById(int id);
}

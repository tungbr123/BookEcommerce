package Service.ServiceImpl;

import Dao.LoginDao;
import Dao.DaoImpl.LoginDaoImpl;
import Models.UserModel;
import Service.LoginService;

public class LoginServiceImpl implements LoginService{
	LoginDao loginDao= new LoginDaoImpl();
	@Override
	public UserModel login(String email, String password) {
		UserModel a= loginDao.login(email,password);
		return a;
	}
	@Override
	public UserModel loginEmail(String email) {
		return loginDao.loginEmail(email);
	}
	@Override
	public void updatePass(String email, String password) {
		loginDao.updatePass(email, password);
		
	}
	@Override
	public void updateProfile(UserModel user) {
		loginDao.updateProfile(user);
		
	}
	@Override
	public UserModel getUserById(int id) {
		// TODO Auto-generated method stub
		return loginDao.getUserById(id);
	}

}

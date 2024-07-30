package Service.ServiceImpl;

import Dao.RegisterDao;
import Dao.DaoImpl.RegisterDaoImpl;
import Service.RegisterService;

public class RegisterServiceImpl implements RegisterService{
	RegisterDao registerDao= new RegisterDaoImpl();
	@Override
	public void register(String firstname, String lastname, String email, String phone, String password) {
		registerDao.register(firstname, lastname, email, phone, password);		
	}
	@Override
	public boolean checkExistEmail(String email) {
		return registerDao.checkExistEmail(email);
	}
	@Override
	public boolean checkExistPhone(String phone) {
		// TODO Auto-generated method stub
		return registerDao.checkExistPhone(phone);
	}
	@Override
	public boolean checkExistCurrentPass(String email, String pass) {
		// TODO Auto-generated method stub
		return registerDao.checkExistCurrentPass(email, pass);
	}

}

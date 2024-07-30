package Dao;

public interface RegisterDao {
	public void register(String firstname, String lastname, String email, String phone, String password);
	public boolean checkExistEmail(String email);
	public boolean checkExistPhone(String phone);
	boolean checkExistCurrentPass(String email, String pass);
}

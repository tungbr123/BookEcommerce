package Models;

import java.io.Serializable;
import java.sql.Date;

public class UserModel implements Serializable{
	private static final long serialVersionUID = -6500665823330706018L;
	private int id;
	private String _firstname;
	private String _lastname;
	private String _slug;
	private String _idcard;
	private String _email;
	private String _phone;
	private boolean _isEmailActive;
	private boolean _isPhoneActive;
	private String _salt;
	private String _hashed_password;
	private String _role;
	private String _addresses;
	private String _avatar;
	private String _cover;
	private float point;
	private int _e_wallet;
	private Date _createdAt;
	private Date _updatedAt;
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserModel(int id, String _firstname, String _lastname, String pass, String _role) {
		this.id=id;
		this._firstname = _firstname;
		this._lastname = _lastname;
		this._hashed_password = pass;
		this._role= _role;
	}
	public UserModel(int id, String _firstname, String _lastname, String _slug, String _idcard, String _email,
			String _phone, boolean _isEmailActive, boolean _isPhoneActive, String _salt, String _hashed_password,
			String _role, String _addresses, String _avatar, String _cover, float point, int _e_wallet, Date _createdAt,
			Date _updatedAt) {
		super();
		this.id = id;
		this._firstname = _firstname;
		this._lastname = _lastname;
		this._slug = _slug;
		this._idcard = _idcard;
		this._email = _email;
		this._phone = _phone;
		this._isEmailActive = _isEmailActive;
		this._isPhoneActive = _isPhoneActive;
		this._salt = _salt;
		this._hashed_password = _hashed_password;
		this._role = _role;
		this._addresses = _addresses;
		this._avatar = _avatar;
		this._cover = _cover;
		this.point = point;
		this._e_wallet = _e_wallet;
		this._createdAt = _createdAt;
		this._updatedAt = _updatedAt;
	}
	public UserModel(int id) {
		super();
		this.id = id;

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String get_firstname() {
		return _firstname;
	}
	public void set_firstname(String _firstname) {
		this._firstname = _firstname;
	}
	public String get_lastname() {
		return _lastname;
	}
	public void set_lastname(String _lastname) {
		this._lastname = _lastname;
	}
	public String get_slug() {
		return _slug;
	}
	public void set_slug(String _slug) {
		this._slug = _slug;
	}
	public String get_idcard() {
		return _idcard;
	}
	public void set_idcard(String _idcard) {
		this._idcard = _idcard;
	}
	public String get_email() {
		return _email;
	}
	public void set_email(String _email) {
		this._email = _email;
	}
	public String get_phone() {
		return _phone;
	}
	public void set_phone(String _phone) {
		this._phone = _phone;
	}
	public boolean is_isEmailActive() {
		return _isEmailActive;
	}
	public void set_isEmailActive(boolean _isEmailActive) {
		this._isEmailActive = _isEmailActive;
	}
	public boolean is_isPhoneActive() {
		return _isPhoneActive;
	}
	public void set_isPhoneActive(boolean _isPhoneActive) {
		this._isPhoneActive = _isPhoneActive;
	}
	public String get_salt() {
		return _salt;
	}
	public void set_salt(String _salt) {
		this._salt = _salt;
	}
	public String get_hashed_password() {
		return _hashed_password;
	}
	public void set_hashed_password(String _hashed_password) {
		this._hashed_password = _hashed_password;
	}
	public String get_role() {
		return _role;
	}
	public void set_role(String _role) {
		this._role = _role;
	}
	public String get_addresses() {
		return _addresses;
	}
	public void set_addresses(String _addresses) {
		this._addresses = _addresses;
	}
	public String get_avatar() {
		return _avatar;
	}
	public void set_avatar(String _avatar) {
		this._avatar = _avatar;
	}
	public String get_cover() {
		return _cover;
	}
	public void set_cover(String _cover) {
		this._cover = _cover;
	}
	public float getPoint() {
		return point;
	}
	public void setPoint(float point) {
		this.point = point;
	}
	public int get_e_wallet() {
		return _e_wallet;
	}
	public void set_e_wallet(int _e_wallet) {
		this._e_wallet = _e_wallet;
	}
	public Date get_createdAt() {
		return _createdAt;
	}
	public void set_createdAt(Date _createdAt) {
		this._createdAt = _createdAt;
	}
	public Date get_updatedAt() {
		return _updatedAt;
	}
	public void set_updatedAt(Date _updatedAt) {
		this._updatedAt = _updatedAt;
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", _firstname=" + _firstname + ", _lastname=" + _lastname + ", _slug=" + _slug
				+ ", _idcard=" + _idcard + ", _email=" + _email + ", _phone=" + _phone + ", _isEmailActive="
				+ _isEmailActive + ", _isPhoneActive=" + _isPhoneActive + ", _salt=" + _salt + ", _hashed_password="
				+ _hashed_password + ", _role=" + _role + ", _addresses=" + _addresses + ", _avatar=" + _avatar
				+ ", _cover=" + _cover + ", point=" + point + ", _e_wallet=" + _e_wallet + ", _createdAt=" + _createdAt
				+ ", _updatedAt=" + _updatedAt + "]";
	}
	
}

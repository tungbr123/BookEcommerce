package Models;

import java.io.Serializable;
import java.sql.Date;

public class OrderModel implements Serializable{
	private static final long serialVersionUID = -6500665823330706018L;
	private int id;
	private UserModel _userId;
	private StoreModel _storeId;
	private String _address;
	private String _phone;
	private String _status;
	private boolean _isPaidBefore;
	private Date _createdAt;
	private Date _updatedAt;
	
	
	public OrderModel(int id, UserModel _userId, StoreModel _storeId, String _address, String _phone, String _status,
			boolean _isPaidBefore, Date _createdAt, Date _updatedAt) {
		super();
		this.id = id;
		this._userId = _userId;
		this._storeId = _storeId;
		this._address = _address;
		this._phone = _phone;
		this._status = _status;
		this._isPaidBefore = _isPaidBefore;
		this._createdAt = _createdAt;
		this._updatedAt = _updatedAt;
	}
	@Override
	public String toString() {
		return "OrderModel [id=" + id + ", _userId=" + _userId + ", _storeId=" + _storeId + ", _address=" + _address
				+ ", _phone=" + _phone + ", _status=" + _status + ", _isPaidBefore=" + _isPaidBefore + ", _createdAt="
				+ _createdAt + ", _updatedAt=" + _updatedAt + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UserModel get_userId() {
		return _userId;
	}
	public void set_userId(UserModel _userId) {
		this._userId = _userId;
	}
	public StoreModel get_storeId() {
		return _storeId;
	}
	public void set_storeId(StoreModel _storeId) {
		this._storeId = _storeId;
	}
	public String get_address() {
		return _address;
	}
	public void set_address(String _address) {
		this._address = _address;
	}
	public String get_phone() {
		return _phone;
	}
	public void set_phone(String _phone) {
		this._phone = _phone;
	}
	public String get_status() {
		return _status;
	}
	public void set_status(String _status) {
		this._status = _status;
	}
	public boolean is_isPaidBefore() {
		return _isPaidBefore;
	}
	public void set_isPaidBefore(boolean _isPaidBefore) {
		this._isPaidBefore = _isPaidBefore;
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
	public OrderModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

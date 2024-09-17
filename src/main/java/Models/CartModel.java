package Models;

import java.io.Serializable;
import java.util.Date;

import Dao.CartDao;
import Dao.DaoImpl.CartDaoImpl;

public class CartModel implements Serializable{
	private static final long serialVersionUID = -6500665823330706018L;

	
	private int id;
	private UserModel _userId;
	private StoreModel	_storeId;
	private Date _createAt;
	private Date _updatedAt;
	public CartModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartModel(int id) {
		this.id=id;
	}

	public CartModel(int id, UserModel _userId, StoreModel _storeId, Date _createAt, Date _updatedAt) {
		super();
		this.id = id;
		this._userId = _userId;
		this._storeId = _storeId;
		this._createAt = _createAt;
		this._updatedAt = _updatedAt;
	}

	@Override
	public String toString() {
		return "CartModel [id=" + id + ", _userId=" + _userId + ", _storeId=" + _storeId + ", _createAt=" + _createAt
				+ ", _updatedAt=" + _updatedAt + "]";
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
	public Date get_createAt() {
		return _createAt;
	}
	public void set_createAt(Date _createAt) {
		this._createAt = _createAt;
	}
	public Date get_updatedAt() {
		return _updatedAt;
	}
	public void set_updatedAt(Date _updatedAt) {
		this._updatedAt = _updatedAt;
	}
}

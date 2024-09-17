package Models;

import java.io.Serializable;
import java.util.Date;

public class StoreModel implements Serializable{
	private static final long serialVersionUID = -6500665823330706018L;

	private int _id;
	private String _name;
	private String _bio;
	private String _slug;
	private int _ownerId;
	private int _staffIds;
	private boolean _isActive;
	private boolean _isOpen;
	private String _avatar;
	private String _cover;
	private String _featured_images;
	private int _commissionId;
	private int _point;
	private float _rating;
	private int _e_wallet;
	private Date _createAt;
	private Date _updatedAt;
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public String get_bio() {
		return _bio;
	}
	public void set_bio(String _bio) {
		this._bio = _bio;
	}
	public String get_slug() {
		return _slug;
	}
	public void set_slug(String _slug) {
		this._slug = _slug;
	}
	public int get_ownerId() {
		return _ownerId;
	}
	public void set_ownerId(int _ownerId) {
		this._ownerId = _ownerId;
	}
	public int get_staffIds() {
		return _staffIds;
	}
	public void set_staffIds(int _staffIds) {
		this._staffIds = _staffIds;
	}
	public boolean is_isActive() {
		return _isActive;
	}
	public void set_isActive(boolean _isActive) {
		this._isActive = _isActive;
	}
	public boolean is_isOpen() {
		return _isOpen;
	}
	public void set_isOpen(boolean _isOpen) {
		this._isOpen = _isOpen;
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
	public String get_featured_images() {
		return _featured_images;
	}
	public void set_featured_images(String _featured_images) {
		this._featured_images = _featured_images;
	}
	public int get_commissionId() {
		return _commissionId;
	}
	public void set_commissionId(int _commissionId) {
		this._commissionId = _commissionId;
	}
	public int get_point() {
		return _point;
	}
	public void set_point(int _point) {
		this._point = _point;
	}
	public float get_rating() {
		return _rating;
	}
	public void set_rating(float _rating) {
		this._rating = _rating;
	}
	public int get_e_wallet() {
		return _e_wallet;
	}
	public void set_e_wallet(int _e_wallet) {
		this._e_wallet = _e_wallet;
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
	@Override
	public String toString() {
		return "StoreModel [_id=" + _id + ", _name=" + _name + ", _bio=" + _bio + ", _slug=" + _slug + ", _ownerId="
				+ _ownerId + ", _staffIds=" + _staffIds + ", _isActive=" + _isActive + ", _isOpen=" + _isOpen
				+ ", _avatar=" + _avatar + ", _cover=" + _cover + ", _featured_images=" + _featured_images
				+ ", _commissionId=" + _commissionId + ", _point=" + _point + ", _rating=" + _rating + ", _e_wallet="
				+ _e_wallet + ", _createAt=" + _createAt + ", _updatedAt=" + _updatedAt + "]";
	}
	public StoreModel(int _id, String _name, String i, String _slug, int _ownerId, int _staffIds, boolean _isActive,
			boolean _isOpen, String _avatar, String _cover, String _featured_images, int _commissionId, int _point,
			float _rating, int _e_wallet, Date _createAt, Date _updatedAt) {
		super();
		this._id = _id;
		this._name = _name;
		this._bio = i;
		this._slug = _slug;
		this._ownerId = _ownerId;
		this._staffIds = _staffIds;
		this._isActive = _isActive;
		this._isOpen = _isOpen;
		this._avatar = _avatar;
		this._cover = _cover;
		this._featured_images = _featured_images;
		this._commissionId = _commissionId;
		this._point = _point;
		this._rating = _rating;
		this._e_wallet = _e_wallet;
		this._createAt = _createAt;
		this._updatedAt = _updatedAt;
	}
	public StoreModel(int _id) {
		super();
		this._id = _id;

	}
	public StoreModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

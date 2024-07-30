package Models;

import java.io.Serializable;
import java.util.Date;

public class ProductModel implements Serializable{
	private static final long serialVersionUID = -6500665823330706018L;
	private int id;
	private String _name;
	private String _slug;
	private String _description;
	private int _price;
	private int _promotionalPrice;
	private int _quantity;
	private int _sold;
	private boolean _isActive;
	private boolean _isSelling;
	private String _listImages;
	private int _categoryId;
	private int _styleValueIds;
	private int _storeId;
	private float _rating;
	private Date _createAt;
	private Date _updatedAt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public String get_slug() {
		return _slug;
	}
	public void set_slug(String _slug) {
		this._slug = _slug;
	}
	public String get_description() {
		return _description;
	}
	public void set_description(String _description) {
		this._description = _description;
	}
	public int get_price() {
		return _price;
	}
	public void set_price(int _price) {
		this._price = _price;
	}
	public int get_promotionalPrice() {
		return _promotionalPrice;
	}
	public void set_promotionalPrice(int _promotionalPrice) {
		this._promotionalPrice = _promotionalPrice;
	}
	public int get_quanity() {
		return _quantity;
	}
	public void set_quanity(int _quanity) {
		this._quantity = _quanity;
	}
	public int get_sold() {
		return _sold;
	}
	public void set_sold(int _sold) {
		this._sold = _sold;
	}
	public boolean is_isActive() {
		return _isActive;
	}
	public void set_isActive(boolean _isActive) {
		this._isActive = _isActive;
	}
	public boolean is_isSelling() {
		return _isSelling;
	}
	public void set_isSelling(boolean _isSelling) {
		this._isSelling = _isSelling;
	}
	public String get_listImages() {
		return _listImages;
	}
	public void set_listImages(String _listImages) {
		this._listImages = _listImages;
	}
	public int get_categoryId() {
		return _categoryId;
	}
	public void set_categoryId(int _categoryId) {
		this._categoryId = _categoryId;
	}
	public int get_styleValueIds() {
		return _styleValueIds;
	}
	public void set_styleValueIds(int _styleValueIds) {
		this._styleValueIds = _styleValueIds;
	}
	public int get_storeId() {
		return _storeId;
	}
	public void set_storeId(int _storeId) {
		this._storeId = _storeId;
	}
	public float get_rating() {
		return _rating;
	}
	public void set_rating(float _rating) {
		this._rating = _rating;
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
	public ProductModel(int id, String _name, String _slug, String _description, int _price, int _promotionalPrice,
			int _quanity, int _sold, boolean _isActive, boolean _isSelling, String string, int _categoryId,
			int _styleValueIds, int _storeId, float _rating, Date _createAt, Date _updatedAt) {
		super();
		this.id = id;
		this._name = _name;
		this._slug = _slug;
		this._description = _description;
		this._price = _price;
		this._promotionalPrice = _promotionalPrice;
		this._quantity = _quanity;
		this._sold = _sold;
		this._isActive = _isActive;
		this._isSelling = _isSelling;
		this._listImages = string;
		this._categoryId = _categoryId;
		this._styleValueIds = _styleValueIds;
		this._storeId = _storeId;
		this._rating = _rating;
		this._createAt = _createAt;
		this._updatedAt = _updatedAt;
	}
	public ProductModel(int id) {
		super();
		this.id = id;

	}
	public ProductModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProductModel [id=" + id + ", _name=" + _name + ", _slug=" + _slug + ", _description=" + _description
				+ ", _price=" + _price + ", _promotionalPrice=" + _promotionalPrice + ", _quantity=" + _quantity
				+ ", _sold=" + _sold + ", _isActive=" + _isActive + ", _isSelling=" + _isSelling + ", _listImages="
				+ _listImages + ", _categoryId=" + _categoryId + ", _styleValueIds=" + _styleValueIds + ", _storeId="
				+ _storeId + ", _rating=" + _rating + ", _createAt=" + _createAt + ", _updatedAt=" + _updatedAt + "]";
	}
	

	
	
}

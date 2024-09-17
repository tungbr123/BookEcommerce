package Models;

import java.io.Serializable;
import java.sql.Date;

public class CategoryModel implements Serializable{
	private static final long serialVersionUID = -6500665823330706018L;
	private int id;
	private String _name;
	private String _slug;
	private int _categoryId;
	private String _image;
	private boolean _isDeleted;
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
	public int get_categoryId() {
		return _categoryId;
	}
	public void set_categoryId(int _categoryId) {
		this._categoryId = _categoryId;
	}
	public String get_image() {
		return _image;
	}
	public void set_image(String _image) {
		this._image = _image;
	}
	public boolean is_isDeleted() {
		return _isDeleted;
	}
	public void set_isDeleted(boolean _isDeleted) {
		this._isDeleted = _isDeleted;
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
	public CategoryModel(int id, String _name, String _slug, int _categoryId, String _image, boolean _isDeleted,
			Date _createAt, Date _updatedAt) {
		super();
		this.id = id;
		this._name = _name;
		this._slug = _slug;
		this._categoryId = _categoryId;
		this._image = _image;
		this._isDeleted = _isDeleted;
		this._createAt = _createAt;
		this._updatedAt = _updatedAt;
	}
	public CategoryModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

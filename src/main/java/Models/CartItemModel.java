package Models;

import java.io.Serializable;
import java.util.Date;

public class CartItemModel implements Serializable{
	private static final long serialVersionUID = -6500665823330706018L;
	private int id;
	private CartModel _cartId;
	private ProductModel _productId;
	private int _count;
	private Date _createAt;
	private Date _updatedAt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CartItemModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartItemModel(int id, CartModel _cartId, ProductModel _productId, int _count, Date _createAt,
			Date _updatedAt) {
		super();
		this.id = id;
		this._cartId = _cartId;
		this._productId = _productId;
		this._count = _count;
		this._createAt = _createAt;
		this._updatedAt = _updatedAt;
	}
	@Override
	public String toString() {
		return "CartItemModel [id=" + id + ", _cartId=" + _cartId + ", _productId=" + _productId + ", _count=" + _count
				+ ", _createAt=" + _createAt + ", _updatedAt=" + _updatedAt + "]";
	}
	public CartModel get_cartId() {
		return _cartId;
	}
	public void set_cartId(CartModel _cartId) {
		this._cartId = _cartId;
	}
	public ProductModel get_productId() {
		return _productId;
	}
	public void set_productId(ProductModel _productId) {
		this._productId = _productId;
	}
	public int get_count() {
		return _count;
	}
	public void set_count(int _count) {
		this._count = _count;
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

package Models;

import java.io.Serializable;
import java.sql.Date;

public class OrderItemModel implements Serializable{
	private static final long serialVersionUID = -6500665823330706018L;
	private int id;
	private OrderModel _orderId;
	private ProductModel _productId;
	private int count;
	private Date _createdAt;
	private Date _updatedAt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public OrderModel get_orderId() {
		return _orderId;
	}
	public void set_orderId(OrderModel _orderId) {
		this._orderId = _orderId;
	}
	public ProductModel get_productId() {
		return _productId;
	}
	public void set_productId(ProductModel _productId) {
		this._productId = _productId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
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
		return "OrderItemModel [id=" + id + ", _orderId=" + _orderId + ", _productId=" + _productId + ", count=" + count
				+ ", _createdAt=" + _createdAt + ", _updatedAt=" + _updatedAt + "]";
	}
	public OrderItemModel(int id, OrderModel _orderId, ProductModel _productId, int count, Date _createdAt,
			Date _updatedAt) {
		super();
		this.id = id;
		this._orderId = _orderId;
		this._productId = _productId;
		this.count = count;
		this._createdAt = _createdAt;
		this._updatedAt = _updatedAt;
	}
	public OrderItemModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	
	
}

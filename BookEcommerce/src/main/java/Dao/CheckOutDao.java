package Dao;

import Models.OrderItemModel;
import Models.OrderModel;

public interface CheckOutDao {
	void addToOrderItem(OrderItemModel orderItem, int orderID);
	void addToOrder(OrderModel order);
	OrderModel getLastOrder();
}

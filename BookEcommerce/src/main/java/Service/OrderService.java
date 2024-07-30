package Service;

import Models.OrderItemModel;
import Models.OrderModel;

public interface OrderService {
	void addToOrder(OrderModel order);

	void addToOrderItem(OrderItemModel orderItem, int orderID);

	OrderModel getLastOrder();
}

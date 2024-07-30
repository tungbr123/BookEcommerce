package Service.ServiceImpl;

import Dao.DaoImpl.CheckOutDaoImpl;
import Models.OrderItemModel;
import Models.OrderModel;
import Service.OrderService;
import Dao.CheckOutDao;

public class OrderServiceImpl implements OrderService{
	CheckOutDao CheckOutDao = new CheckOutDaoImpl();
	public void addToOrder(OrderModel order)
	{
		CheckOutDao.addToOrder(order);
	}
	@Override
	public void addToOrderItem(OrderItemModel orderItem, int orderID)
	{
		CheckOutDao.addToOrderItem(orderItem, orderID);
	}
	@Override
	public OrderModel getLastOrder()
	{
		return CheckOutDao.getLastOrder();
	}
}

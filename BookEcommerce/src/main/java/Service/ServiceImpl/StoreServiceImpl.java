package Service.ServiceImpl;

import Dao.StoreDao;
import Dao.DaoImpl.StoreDaoImpl;
import Models.StoreModel;
import Service.StoreService;

public class StoreServiceImpl implements StoreService{
	StoreDao storeDao= new StoreDaoImpl();

	@Override
	public StoreModel getStoreById(int id) {
		// TODO Auto-generated method stub
		return storeDao.getStoreById(id);
	}
}

package productManage.dao.tms.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import productManage.dao.BaseDao;
import productManage.dao.tms.TechniqueInventoryDAO;
import productManage.model.tms.TechniqueInventory;
@Repository
public class TechniqueInventoryDAOImpl implements TechniqueInventoryDAO {
	@Autowired
	private BaseDao basedao;
	@Override
	public void save(TechniqueInventory tInventory) {
		// TODO Auto-generated method stub
		basedao.save(tInventory);
	}

}

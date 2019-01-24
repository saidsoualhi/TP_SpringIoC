package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.IDao;

//repository annotation use for classes of "metier"
@Service
public class MetierImpl implements IMetier {

	@Autowired
	private IDao dao;

	@Override
	public double calcule() {
		double temp = dao.getTemperature();
		double result = temp*20;
		return result;
	}
	public IDao getDao() {
		return dao;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}

}

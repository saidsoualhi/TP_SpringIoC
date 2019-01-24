package metier;

import dao.IDao;

public class MetierImpl implements IMetier {

	
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

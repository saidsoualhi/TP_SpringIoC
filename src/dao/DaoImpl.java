package dao;

import org.springframework.stereotype.Repository;

// repository annotation use for classes of "dao"
@Repository
public class DaoImpl implements IDao {
	/*
	 * connect to Database to get temperature
	 */
	@Override
	public double getTemperature() {
		double data = 24;
		return data;
	}
	
}

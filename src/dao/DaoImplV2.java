package dao;

public class DaoImplV2 implements IDao {

	@Override
	public double getTemperature() {
		/*
		 *  Dans cette version, je me connecte � un web service
		 *  pour r�cup�rer la temp�rature
		 */
		double data = 32;
		return data;
	}
	
}

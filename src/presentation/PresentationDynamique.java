package presentation;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.IDao;
import metier.IMetier;

public class PresentationDynamique {

	public static void main(String[] args) {
		//cette presentation basée sur un fichier appelé config.txt
		try {
			//Partie 1 : (Instanciation Dynamique)
			Scanner scanner = new Scanner(new File("config.txt"));
			String daoClassName =scanner.nextLine();
			//System.out.println(daoClassName);
			Class cDao = Class.forName(daoClassName);
			IDao dao = (IDao)cDao.newInstance();
			//System.out.println(dao.getTemperateur());
			
			String metierClassName = scanner.nextLine();
			Class cMetier = Class.forName(metierClassName);
			IMetier metier = (IMetier) cMetier.newInstance();
			
			//Partie 2 :
			Method m = cMetier.getMethod("setDao", IDao.class);
			m.invoke(metier, dao);
			
			System.out.println(metier.calcule());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

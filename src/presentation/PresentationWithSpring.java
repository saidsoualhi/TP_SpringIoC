package presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.IMetier;

public class PresentationWithSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		IMetier metier = (IMetier) ctx.getBean("metierImpl");
		System.out.println(metier.calcule());
		
	}

}

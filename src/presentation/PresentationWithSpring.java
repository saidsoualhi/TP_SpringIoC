package presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.IMetier;

public class PresentationWithSpring {

	public static void main(String[] args) {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		ApplicationContext springCtx = new AnnotationConfigApplicationContext("dao","metier");
		
		IMetier metier = springCtx.getBean(IMetier.class);
		System.out.println(metier.calcule());
		
	}

}

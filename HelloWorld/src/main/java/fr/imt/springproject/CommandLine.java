package fr.imt.springproject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 
 * @author georges
 *
 *soit créer une nouvelle classe qui implémente CommandLineRunner, la méthode run (même corps de méthode), et qui aura une annotation @Component (au-dessus du nom de la classe).
 */
@Component
public class CommandLine implements CommandLineRunner {
	HelloWorld hw=new HelloWorld();
	
	@Autowired
	private BusinessService bs;
	
	@Override
	public void run(String... args) throws Exception {
		// Appel de la méthode toString de la classe HelloWorld:
		//System.out.println(hw);
		// Appel de la methode printHelloWord qui fait directement un println
		//hw.printHelloWorld();
		// tentative d'appel de la classe BusinessSErvice
		HelloWorld hw = bs.getHelloWorld();
		System.out.println(hw);
	}
}

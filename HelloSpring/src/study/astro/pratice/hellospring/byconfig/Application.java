package study.astro.pratice.hellospring.byconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
		MessagePrinter printer = context.getBean("messagePrinter",MessagePrinter.class);
		printer.printMessage();
	}
}
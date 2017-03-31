package study.astro.pratice.hellospring.byannotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class Application {

  public static void main(String[] args) {
      ApplicationContext context = 
          new AnnotationConfigApplicationContext(AppConfig.class);
      MessagePrinter printer = context.getBean(MessagePrinter.class);
      printer.printMessage();
  }
}
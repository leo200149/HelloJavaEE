package study.astro.pratice.hellospring.byannotation;

public class MessageServiceImpl implements MessageService{
	
	@Override
    public String getMessage() {
      return "Hello World!";
    }
}


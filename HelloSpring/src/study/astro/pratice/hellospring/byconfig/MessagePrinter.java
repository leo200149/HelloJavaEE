package study.astro.pratice.hellospring.byconfig;

public class MessagePrinter {

    private MessageService service;

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }

	public MessageService getService() {
		return service;
	}

	public void setService(MessageService service) {
		this.service = service;
	}
	
}
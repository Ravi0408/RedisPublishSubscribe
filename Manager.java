package chatroom;
import chatroom.PublisherChannel;
import java.util.Scanner;

public class Manager {
	Scanner scanner=new Scanner(System.in);
	public void initializePublisher(String channel) {
		Thread sender= new Thread(new PublisherChannel(channel));
		System.out.println("publisher Started"+ channel);
		sender.start();
		
	}
	public void initializeSubscriber(String channel) {
		Thread receiver=new Thread(new SubscriberChannel(channel));
		System.out.println("SubScriber Started" + channel);
		receiver.start();
	}

}

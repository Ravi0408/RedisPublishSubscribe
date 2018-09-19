package chatroom;

import java.util.Scanner;

import redis.clients.jedis.Jedis;

public class PublisherChannel implements Runnable{
	String channel;
	Scanner scanner=new Scanner(System.in);
	Jedis jedis = new Jedis("localhost");
	public PublisherChannel(String channel) {
		super();
		this.channel = channel;
		
	}

	@Override
	public void run() {
		String output;
		while(true) {
		output = scanner.nextLine();
		jedis.publish(channel,output);
		}
		
	}

}

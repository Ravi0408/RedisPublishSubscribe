package chatroom;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import redis.clients.jedis.Jedis;

public class MainSystem {
	public static void main(String[] args) throws IOException {
		Jedis jedis=new Jedis("localhost");
		Manager manager=new Manager();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Press 0 for publisher 1 for subscriber");
		int choice=scanner.nextInt();
		if(choice==0) {
			System.out.println("enter channel Name:");
			String channel=scanner.nextLine();
			manager.initializePublisher(channel);
			
		}
		else {
			System.out.println("enter channel Name:");
			String channel=scanner.nextLine();
			manager.initializeSubscriber(channel);
			
		}
		
		
	}

}

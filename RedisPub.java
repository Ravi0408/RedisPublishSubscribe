package chatroom;

import redis.clients.jedis.Jedis;

import java.util.Scanner;

public class RedisPub implements Runnable {
    public static void main(String  args[]){
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server sucessfully"); 
        //check whether server is running or not 
        System.out.println("Server is running: "+jedis.ping());
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the channel name:");
        String channel=scanner.nextLine();
        System.out.println("Starting publisher for channel "+ channel);

        while (true){
            System.out.println("Enter the string to Publish:");
            String msg = scanner.nextLine();
            jedis.publish(channel,msg);

        }
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
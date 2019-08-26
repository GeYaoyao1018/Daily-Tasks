import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;


public class Demo1_Send {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
          String str = "what are you ÅªÉ¶ÄØ?";
          DatagramSocket socket = new DatagramSocket();
          DatagramPacket packet = 
        		  new DatagramPacket(str.getBytes(),str.getBytes().length,InetAddress.getByName("127.0.0.1"),6666);
	        socket.send(packet);
	        socket.close();
	}

}

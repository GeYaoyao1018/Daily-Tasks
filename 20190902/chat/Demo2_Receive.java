import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;


public class Demo2_Receive {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(6666);
		DatagramPacket packet = 
				new DatagramPacket(new byte[1024],1024);
		socket.receive(packet);
		byte[] arr = packet.getData();
	}

}

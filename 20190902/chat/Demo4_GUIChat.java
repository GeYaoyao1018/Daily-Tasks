import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import javax.swing.border.Border;


public class Demo4_GUIChat  extends Frame{

	private TextField tf;
	private Button send;
	private Button log;
	private Button clear;
	private Button shake;
	private TextArea viewText;
	private TextArea sendText;
	private DatagramSocket socket;
	private BufferedWriter bw;

	/**
	 * @param args
	 * GUI聊天
	 */
	public Demo4_GUIChat()   {
		init();
		southPanel();
	centerPannel();
	event();
		
	}

	private void event() {
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					socket.close();
					bw.close();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				System.exit(0);
			}
		});
		send.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					send();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		log.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					logFile();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}

		});
		clear.addActionListener(new ActionListener()   {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				viewText.setText("");
			}
		});
	}
	private void logFile() throws IOException {
		bw.flush();
		FileInputStream fis = new FileInputStream("config.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();   //在内存中创建缓冲区
		int len;
		byte[] arr = new byte[8192];
		while ((len = fis.read(arr)) !=  -1)  {
			baos.write(arr,0,len);
		}
		String str = baos.toString();
		viewText.setText(str);
		fis.close();
	}
	private void send() throws IOException {
		String message = sendText.getText();
		String ip = tf.getText();
		
		DatagramPacket packet = 
				new DatagramPacket(message.getBytes(), message.getBytes().length,InetAddress.getByName(ip),9999);
		socket.send(packet);
		String time = getCurrentTime();
		String str = time + "我对:"  +ip + "说\r\n" + message + "\r\n\r\n";         //alt+shift+l  抽取局部变量
		viewText.append(str);                                                                                      //将信息写到数据库
		bw.write(str);
	
		sendText.setText("");
		
		
	}

	private String getCurrentTime() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
			return sdf.format(d);
	}

	private void centerPannel() {
		Panel center = new Panel();
		viewText = new TextArea();
		sendText = new TextArea(5,1);
		center.setLayout(new BorderLayout());
		center.add(sendText,BorderLayout.SOUTH);
		center.add(viewText,BorderLayout.CENTER);
		viewText.setEditable(false);
		viewText.setBackground(Color.WHITE);
		sendText.setFont(new Font("xxx",Font.PLAIN,15));
		viewText.setFont(new Font("xxx",Font.PLAIN,15));
		
		
		this.add(center,BorderLayout.CENTER);
	}

	private void southPanel() {
		Panel south = new Panel();
		tf = new TextField(20);
		tf.setText("127.0.0.1");
		send = new Button("发送");
		log = new Button("记录");
		clear = new Button("清屏");
		shake = new Button("震动");
		south.add(tf);
		south.add(send);
		south.add(log);
		south.add(clear);
		south.add(shake);
		this.add(south,BorderLayout.SOUTH);	
	}

	private void init() {
		this.setLocation(500, 50);
		this.setSize(400,600);
		new Receive().start();
		try {
			bw= new BufferedWriter(new FileWriter("config.txt",true));                 //需在尾部追加
			socket = new DatagramSocket();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		this.setVisible(true);
	}
	
	private class Receive extends Thread {
		public void run()   {
			try {
				DatagramSocket socket = new DatagramSocket(9999);
				DatagramPacket packet = new DatagramPacket(new byte[8192], 8192);
				socket.receive(packet);
				byte[] arr = packet.getData();
				int len = packet.getLength();
				String message = new String(arr,0,len);
				String time = getCurrentTime();
				String ip = packet.getAddress().getHostAddress();
				
				String str = time + "" + ip + "对我说:\r\n" +message + "\r\n\r\n";
				viewText.append(str);
				bw.write(str);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		new Demo4_GUIChat();

	}

}

package com.heima.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo1_Client {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1",12345);
		InputStream is = socket.getInputStream();                                      //获取哭护短输入流
		OutputStream os = socket.getOutputStream();                             //获取客户端的输出流
		byte[] arr = new byte[1024];
		int len = is.read(arr);                                                                           //读取服务器端打过来的数据
		System.out.println(new String(arr,0,len));                                 //将数据转换成字符串并打印
		
		os.write("学习挖掘机哪家强".getBytes());                                           //客户端跟服务器端写数据

	}

}

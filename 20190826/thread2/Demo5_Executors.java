package com.heima.thread2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo5_Executors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2);//�����̳߳�
		pool.submit(new MyRunnable());        //���̷߳��ڳ����ﲢִ��
		pool.submit(new MyRunnable());
		
		pool.shutdown();                                  //�ر��̳߳�
		

	}

}

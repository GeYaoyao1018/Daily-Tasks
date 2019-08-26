package com.heima.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo1_Frame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Frame f = new Frame("我的第一个窗口");
		f.setSize(400,600);
		f.setLocation(500, 50);
		Button b1 = new Button("按钮1");
		f.add(b1);
		f.setLayout(new FlowLayout());
		f.addWindowListener(new WindowAdapter()   {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		b1.addMouseListener(new MouseAdapter() {
			/*@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}*/
			@Override
			public void mouseReleased(MouseEvent e) {
				
			System.exit(0);
			}
		});
	
		f.setVisible(true);

	}

}

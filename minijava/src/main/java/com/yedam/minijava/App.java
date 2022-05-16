package com.yedam.minijava;

import java.awt.EventQueue;

public class App {

	public static void main(String[] args) throws Exception {

		EventQueue.invokeLater(new Runnable() {
			public void run() {

				Main frame = new Main();
				frame.setVisible(true);

			}

		});

	}

}

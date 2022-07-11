package controller;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.StockFrame;

public class StockController {
	
	private StockFrame iFrame;
	
	public void execute() {
		//TODO Frmae create edilmeli. listenerlar set edilmeli. frame setVisible(true) yapılmalı.
		
		iFrame = new StockFrame();
		
		setListeners();
	}

	private void setListeners() {
		iFrame.getBtn_Save().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				kaydet();
			}
		});
	}
	
	
	public void kaydet() {
		//fill model - > model e ui daki bilgiler set edilmelidir.
		iFrame.getModel().save();
	}
	
	public void sil() {
		
	}
	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StockFrame window = new StockFrame();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	

}

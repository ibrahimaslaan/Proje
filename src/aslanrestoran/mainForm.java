/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aslanrestoran;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainForm {

	public  JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainForm window = new mainForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LUTFEN YAPMAK \u0130STED\u0130\u011E\u0130N\u0130Z \u0130\u015ELEM\u0130 SE\u00C7\u0130N\u0130Z");
		lblNewLabel.setFont(new Font("Trajan Pro", Font.PLAIN, 33));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 53, 882, 121);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 53, 882, 121);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(63, 232, 762, 587);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnKayıt = new JButton("M\u00DC\u015ETER\u0130 KAYIT");
		btnKayıt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				musteriForm sc = new musteriForm();
				sc.frame.setVisible(true);
			}
		});
		btnKayıt.setFont(new Font("Trajan Pro", Font.PLAIN, 22));
		btnKayıt.setBounds(60, 149, 287, 68);
		panel_1.add(btnKayıt);
		
		JButton btnSiparis = new JButton("S\u0130PAR\u0130\u015E KAYIT");
		btnSiparis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				siparisKayıtForm sc = new siparisKayıtForm();
                                
				sc.frame.setVisible(true);
			}
		});
		btnSiparis.setFont(new Font("Trajan Pro", Font.PLAIN, 22));
		btnSiparis.setBounds(410, 149, 287, 68);
		panel_1.add(btnSiparis);
		
		JButton btnSil = new JButton("M\u00DC\u015ETER\u0130 \u0130\u015Flem");
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				musteriIslemForm sc = new musteriIslemForm();
				sc.frame.setVisible(true);
			}
		});
		btnSil.setFont(new Font("Trajan Pro", Font.PLAIN, 22));
		btnSil.setBounds(60, 288, 287, 68);
		panel_1.add(btnSil);
		
		JButton btnSparisler = new JButton("S\u0130PAR\u0130\u015E G\u00F6r\u00FCnt\u00FCle");
		btnSparisler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				siparisForm sc = new siparisForm();
				sc.frame.setVisible(true);
				
			}
		});
		btnSparisler.setFont(new Font("Trajan Pro", Font.PLAIN, 22));
		btnSparisler.setBounds(410, 288, 287, 68);
		panel_1.add(btnSparisler);
		
		JButton btnYemekler = new JButton("YEMEKLER");
		btnYemekler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				yemekForm sc = new yemekForm();
				sc.frame.setVisible(true);
			}
		});
		btnYemekler.setFont(new Font("Trajan Pro", Font.PLAIN, 22));
		btnYemekler.setBounds(247, 414, 287, 68);
		panel_1.add(btnYemekler);
		
	}
}

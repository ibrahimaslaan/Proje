/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aslanrestoran;


import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;


import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginPage {

	public JFrame frame;
	private JTextField yetkId;
	private JPasswordField yetkPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginPage window = new loginPage();
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
	public loginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JPanel topPanel = new JPanel();
		topPanel.setBounds(0, 0, 794, 151);
		topPanel.setBackground(new Color(106, 90, 205));
		frame.getContentPane().add(topPanel);
		topPanel.setLayout(null);
		
		JLabel label1 = new JLabel("ASLAN RESTORAN'A");
		label1.setForeground(Color.ORANGE);
		label1.setBackground(Color.WHITE);
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Trajan Pro", Font.PLAIN, 50));
		label1.setBounds(20, 0, 782, 67);
		topPanel.add(label1);
		
		JLabel label2 = new JLabel("HO\u015E GELD\u0130N\u0130Z");
		label2.setForeground(Color.ORANGE);
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setFont(new Font("Trajan Pro", Font.PLAIN, 68));
		label2.setBounds(20, 63, 758, 88);
		topPanel.add(label2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 153, 255));
		panel.setBounds(0, 151, 794, 614);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblRight = new JLabel("YETK\u0130L\u0130 G\u0130R\u0130\u015E\u0130");
		lblRight.setForeground(new Color(255, 255, 255));
		lblRight.setHorizontalAlignment(SwingConstants.CENTER);
		lblRight.setFont(new Font("Trajan Pro", Font.PLAIN, 40));
		lblRight.setBounds(0, 13, 794, 75);
		panel.add(lblRight);
		
		JPanel sprt2 = new JPanel();
		sprt2.setBackground(new Color(204, 255, 204));
		sprt2.setBounds(0, 83, 794, 10);
		panel.add(sprt2);
		
		yetkId = new JTextField();
		yetkId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		yetkId.setColumns(10);
		yetkId.setBounds(275, 189, 264, 54);
		panel.add(yetkId);
		
		JLabel idRight = new JLabel("Kullan\u0131c\u0131 ad\u0131 ");
		idRight.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		idRight.setBounds(275, 160, 177, 29);
		panel.add(idRight);
		
		yetkPass = new JPasswordField();
		yetkPass.setFont(new Font("Tahoma", Font.PLAIN, 18));
		yetkPass.setBounds(275, 295, 264, 54);
		panel.add(yetkPass);
		
		JLabel passRight = new JLabel("Kullan\u0131c\u0131 \u015E\u0130FRE");
		passRight.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		passRight.setBounds(275, 268, 264, 29);
		panel.add(passRight);
		
		JButton btnRight = new JButton("G\u0130R\u0130\u015E YAP");
		btnRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(yetkId.getText().equals("admin")&&yetkPass.getText().equals("pass")) {
				mainForm sc = new mainForm();
                                    sc.frame.setVisible(true);
                                    frame.setVisible(false);
                        }

                        
			else{
				JOptionPane sc = new JOptionPane();
				sc.showMessageDialog(frame, "Kullanıcı Adı ya da Şifre Hatalı","Hata",JOptionPane.ERROR_MESSAGE);
			}
			}
		});
		btnRight.setFont(new Font("Trajan Pro", Font.PLAIN, 23));
		btnRight.setBackground(new Color(102, 255, 102));
		btnRight.setBounds(317, 409, 188, 54);
		panel.add(btnRight);
	}
}

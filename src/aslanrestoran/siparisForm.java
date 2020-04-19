/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aslanrestoran;


import java.awt.EventQueue;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class siparisForm {

	public JFrame frame;
	private JTable table;
	DefaultTableModel model = new DefaultTableModel();
	
	Object [] kolomlar = {"Siparis_id","Siparis_tarih","Siparis_yemekler","Siparis_adres","Siparis_kisi"};
	Object [] satirlar = new Object[5];
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					siparisForm window = new siparisForm();
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
	public siparisForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 900);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 115, 825, 328);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBounds(91, 439, 370, 303);
		model.setColumnIdentifiers(kolomlar);
		scrollPane.setViewportView(table);
		String sorgu = " siparisler";
		ResultSet myRs=veritabanı.yap(sorgu);
		try {
			
			while(myRs.next()) {
				satirlar[0]=myRs.getString("idSiparis");
				satirlar[1]=myRs.getString("siparis_tarih");
				satirlar[2]=myRs.getString("siparis_yemekler");
				satirlar[3]=myRs.getString("siparis_adres");
				satirlar[4]=myRs.getString("siparis_kisi");
				model.addRow(satirlar);
			}
		}	
		catch(SQLException e1) {
			e1.printStackTrace();
		}
		
		table.setModel(model);
		
		JLabel lblNewLabel = new JLabel("SİPARİŞLER");
		lblNewLabel.setBounds(162, 13, 536, 89);
		lblNewLabel.setFont(new Font("Trajan Pro", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
	}

}

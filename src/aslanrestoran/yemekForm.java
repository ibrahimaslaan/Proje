/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aslanrestoran;



import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

public class yemekForm {

	public JFrame frame;
	private JTable table;
	DefaultTableModel model = new DefaultTableModel();
	
	Object [] kolomlar = {"Yemek_id","Yemek_Ad","Yemek_Fiyat","Yemek_İçindekiler","Yemek_adet"};
	Object [] satirlar = new Object[5];
	private JTextField txtid;
	private JTextField txtad;
	private JTextField txtfiyat;
	private JTextField txticindekiler;
	private JTextField txtadet;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					yemekForm window = new yemekForm();
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
	public yemekForm() {
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
		String sorgu = " yemekler";
		ResultSet myRs=veritabanı.yap(sorgu);
		try {
			
			while(myRs.next()) {
				satirlar[0]=myRs.getString("idyemekler");
				satirlar[1]=myRs.getString("yemek_ad");
				satirlar[2]=myRs.getString("yemek_fiyat");
				satirlar[3]=myRs.getString("yemek_icindekiler");
				satirlar[4]=myRs.getString("yemek_adet");
				model.addRow(satirlar);
			}
		}	
		catch(SQLException e1) {
			e1.printStackTrace();
		}
		
		table.setModel(model);
		
		JLabel lblNewLabel = new JLabel("YEMEKLER");
		lblNewLabel.setBounds(162, 13, 536, 89);
		lblNewLabel.setFont(new Font("Trajan Pro", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		txtid = new JTextField();
		txtid.setBounds(216, 565, 189, 43);
		frame.getContentPane().add(txtid);
		txtid.setColumns(10);
		
		txtad = new JTextField();
		txtad.setBounds(216, 650, 189, 43);
		txtad.setColumns(10);
		frame.getContentPane().add(txtad);
		
		txtfiyat = new JTextField();
		txtfiyat.setBounds(216, 738, 189, 43);
		txtfiyat.setColumns(10);
		frame.getContentPane().add(txtfiyat);
		
		txticindekiler = new JTextField();
		txticindekiler.setBounds(481, 565, 189, 43);
		txticindekiler.setColumns(10);
		frame.getContentPane().add(txticindekiler);
		
		txtadet = new JTextField();
		txtadet.setBounds(481, 650, 189, 43);
		txtadet.setColumns(10);
		frame.getContentPane().add(txtadet);
		
		JLabel lblid = new JLabel("Yemek _\u0130d");
		lblid.setBounds(216, 539, 189, 26);
		lblid.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		frame.getContentPane().add(lblid);
		
		JLabel lblıcındekiler = new JLabel("Yemek _\u0130\u00E7indekiler");
		lblıcındekiler.setBounds(481, 544, 189, 26);
		lblıcındekiler.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		frame.getContentPane().add(lblıcındekiler);
		
		JLabel lblAdet = new JLabel("Yemek _Adet");
		lblAdet.setBounds(481, 621, 189, 26);
		lblAdet.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		frame.getContentPane().add(lblAdet);
		
		JLabel lblAd = new JLabel("Yemek _Ad\u0131");
		lblAd.setBounds(216, 621, 189, 26);
		lblAd.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		frame.getContentPane().add(lblAd);
		
		JLabel lblFiyat = new JLabel("Yemek _Fiyat");
		lblFiyat.setBounds(216, 706, 189, 26);
		lblFiyat.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		frame.getContentPane().add(lblFiyat);
		
		JButton btnEkle = new JButton("Yemek Ekle");
		btnEkle.setBounds(481, 730, 189, 51);
		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id,ad,fiyat,icidekiler,adet,sql_sorgu;
				id=txtid.getText();
				ad=txtad.getText();
				fiyat=txtfiyat.getText();
				icidekiler=txticindekiler.getText();
				adet=txtadet.getText();
				sql_sorgu="INSERT INTO yemekler (idyemekler,yemek_ad,yemek_fiyat,yemek_icindekiler,yemek_adet) VALUES ("+
						id+",'"+ad+"',"+fiyat+",'"+icidekiler+"',"+adet+")";
				
				veritabanı.ekle(sql_sorgu);	
			}
		});
		btnEkle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(btnEkle);
		
		JButton btnListele = new JButton("L\u0130STELE");
		btnListele.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet myRs=veritabanı.yap(sorgu);
				model.setRowCount(0);
				try {
					
					while(myRs.next()) {
						satirlar[0]=myRs.getString("idyemekler");
						satirlar[1]=myRs.getString("yemek_ad");
						satirlar[2]=myRs.getString("yemek_fiyat");
						satirlar[3]=myRs.getString("yemek_icindekiler");
						satirlar[4]=myRs.getString("yemek_adet");
						model.addRow(satirlar);
					}
				}	
				catch(SQLException e1) {
					e1.printStackTrace();
				}
				
				table.setModel(model);
				
			}
		});
		btnListele.setBounds(342, 456, 189, 51);
		btnListele.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(btnListele);
	}
}

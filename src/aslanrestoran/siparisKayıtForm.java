/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aslanrestoran;


import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class siparisKayıtForm {

	public JFrame frame;
	private JTable table;
	private JTextField txtid;
	private JLabel lbliD;
	private JLabel lblTarih;
	private JTextField txtTarih;
	private JLabel lblYemekler;
	private JTextField txtYemek;
	private JLabel lblMusteri;
	private JTextField txtMusteri;
	
	DefaultTableModel model = new DefaultTableModel();
	
	Object [] kolomlar = {"Yemek_id","Yemek_Ad","Yemek_Fiyat","Yemek_İçindekiler","Yemek_adet"};
	Object [] satirlar = new Object[5];
	private JTextField txtymkid;
	private JTextField txtad;
	private JTextField txtfiyat;
	private JTextField txticindekiler;
	private JTextField txtadet;
	
	
	DefaultTableModel model1 = new DefaultTableModel();
	private JTable table1;
	Object [] kolomlar1 = {"Müşteri_id","Müşteri_Ad","Müşteri_Soyad","Müşteri_TelNo","Müşteri_Yas","Müşteri_Kayıt_Tarihi","Müşteri_Adres"};
	Object [] satirlar2 = new Object[7];
	private JTextField txtiD;
	private JLabel lblMusteriD;
	private JTextField txtTel;
	private JLabel lblMusteriTel;
	private JTextField txtAdres;
	private JLabel lblMusteriAdres;
	private JTextField txtAd;
	private JLabel lblMteriAd;
	private JTextField txtYas;
	private JLabel lblMusteriYas;
	private JTextField txtTarihs;
	private JLabel lblMusteriTarih;
	private JTextField txtSoyad;
	private JLabel lblMusteriSoyad;
	private JButton btnEkle;
	private JButton btnListele;
	private JButton btnSiparis;
	private JLabel lblAdres;
	private JTextField txtAdress;
	private JLabel lblSipariIsim;
	private JTextField txtisim;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					siparisKayıtForm window = new siparisKayıtForm();
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
	public siparisKayıtForm() {
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
		scrollPane.setBounds(31, 24, 375, 336);
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
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(415, 23, 439, 336);
		frame.getContentPane().add(scrollPane1);
		
		table1 = new JTable();
		table1.setBounds(91, 439, 370, 303);
		model1.setColumnIdentifiers(kolomlar1);
		scrollPane1.setViewportView(table1);
		String sorgu1 = " musteri";
		ResultSet myRs1=veritabanı.yap(sorgu1);
		try {
			
			while(myRs1.next()) {
				satirlar2[0]=myRs1.getString("idmusteri");
				satirlar2[1]=myRs1.getString("musteri_ad");
				satirlar2[2]=myRs1.getString("musteri_soyad");
				satirlar2[3]=myRs1.getString("musteri_telNo");
				satirlar2[4]=myRs1.getString("musteri_yas");
				satirlar2[5]=myRs1.getString("musteri_kayıtTarih");
				satirlar2[6]=myRs1.getString("musteri_adres");
				model1.addRow(satirlar2);
			}
		}	
		catch(SQLException e1) {
			e1.printStackTrace();
		}
		
		table1.setModel(model1);
		
		
		
		txtid = new JTextField();
		txtid.setBounds(50, 426, 191, 39);
		frame.getContentPane().add(txtid);
		txtid.setColumns(10);
		
		lbliD = new JLabel("S\u0130PAR\u0130\u015E \u0130D");
		lbliD.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		lbliD.setBounds(51, 397, 190, 29);
		frame.getContentPane().add(lbliD);
		
		lblTarih = new JLabel("S\u0130PAR\u0130\u015E TAR\u0130H");
		lblTarih.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		lblTarih.setBounds(51, 529, 190, 29);
		frame.getContentPane().add(lblTarih);
		
		txtTarih = new JTextField();
		txtTarih.setColumns(10);
		txtTarih.setBounds(50, 558, 191, 39);
		frame.getContentPane().add(txtTarih);
		
		lblYemekler = new JLabel("S\u0130PAR\u0130\u015ELER");
		lblYemekler.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		lblYemekler.setBounds(51, 648, 190, 29);
		frame.getContentPane().add(lblYemekler);
		
		txtYemek = new JTextField();
		txtYemek.setColumns(10);
		txtYemek.setBounds(50, 677, 191, 39);
		frame.getContentPane().add(txtYemek);
		
		lblMusteri = new JLabel("M\u00DC\u015ETER\u0130 \u0130D");
		lblMusteri.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		lblMusteri.setBounds(368, 397, 190, 29);
		frame.getContentPane().add(lblMusteri);
		
		txtMusteri = new JTextField();
		txtMusteri.setColumns(10);
		txtMusteri.setBounds(367, 426, 191, 39);
		frame.getContentPane().add(txtMusteri);
		
		btnSiparis = new JButton("S\u0130PAR\u0130\u015E VER");
		btnSiparis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id,tarih,yemekler,adres,kisi,musteri_id,sql_sorgu;
				id=txtid.getText();
				tarih=txtTarih.getText();
				yemekler=txtYemek.getText();
				adres=txtAdress.getText();
				kisi=txtisim.getText();
				musteri_id=txtMusteri.getText();
				
				sql_sorgu="INSERT INTO siparisler (idSiparis,siparis_tarih,siparis_yemekler,siparis_adres,siparis_kisi,musteri_id) VALUES ("+
						id+",'"+tarih+"','"+yemekler+"','"+adres+"','"+kisi+"',"+musteri_id+")";
				
				veritabanı.ekle(sql_sorgu);	
				
				
			}
		});
		btnSiparis.setBounds(640, 500, 191, 60);
		frame.getContentPane().add(btnSiparis);
		
		lblAdres = new JLabel("S\u0130PAR\u0130\u015E ADRES");
		lblAdres.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		lblAdres.setBounds(369, 529, 190, 29);
		frame.getContentPane().add(lblAdres);
		
		txtAdress = new JTextField();
		txtAdress.setColumns(10);
		txtAdress.setBounds(368, 558, 191, 39);
		frame.getContentPane().add(txtAdress);
		
		lblSipariIsim = new JLabel("S\u0130PAR\u0130\u015E \u0130S\u0130M");
		lblSipariIsim.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		lblSipariIsim.setBounds(369, 648, 190, 29);
		frame.getContentPane().add(lblSipariIsim);
		
		txtisim = new JTextField();
		txtisim.setBounds(368, 677, 191, 39);
		frame.getContentPane().add(txtisim);
		txtisim.setColumns(10);
		btnSiparis.setBounds(640, 500, 191, 60);
		frame.getContentPane().add(btnSiparis);
	}

}

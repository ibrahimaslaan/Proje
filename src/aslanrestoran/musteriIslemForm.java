/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aslanrestoran;


import java.awt.EventQueue;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class musteriIslemForm {

	public JFrame frame;
	private JTable table;
	DefaultTableModel model = new DefaultTableModel();

	Object [] kolomlar = {"Müşteri_id","Müşteri_Ad","Müşteri_Soyad","Müşteri_TelNo","Müşteri_Yas","Müşteri_Kayıt_Tarihi","Müşteri_Adres"};
	Object [] satirlar = new Object[7];
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
	private JTextField txtTarih;
	private JLabel lblMusteriTarih;
	private JTextField txtSoyad;
	private JLabel lblMusteriSoyad;
	private JButton btnListele;
	private JButton btnGuncelle;
	private JButton btnSil;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					musteriIslemForm window = new musteriIslemForm();
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
	public musteriIslemForm() {
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
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		scrollPane.setBounds(29, 115, 825, 328);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBounds(91, 439, 370, 303);
		model.setColumnIdentifiers(kolomlar);
		scrollPane.setViewportView(table);
		String sorgu = " musteri";
		ResultSet myRs=veritabanı.yap(sorgu);
		try {
			
			while(myRs.next()) {
				satirlar[0]=myRs.getString("idmusteri");
				satirlar[1]=myRs.getString("musteri_ad");
				satirlar[2]=myRs.getString("musteri_soyad");
				satirlar[3]=myRs.getString("musteri_telNo");
				satirlar[4]=myRs.getString("musteri_yas");
				satirlar[5]=myRs.getString("musteri_kayıtTarih");
				satirlar[6]=myRs.getString("musteri_adres");
				model.addRow(satirlar);
			}
		}	
		catch(SQLException e1) {
			e1.printStackTrace();
		}
		
		table.setModel(model);
		
		JLabel lblNewLabel = new JLabel("M\u00DC\u015ETER\u0130 \u0130\u015ELEMLER\u0130");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Trajan Pro", Font.PLAIN, 50));
		lblNewLabel.setBounds(12, 13, 858, 94);
		frame.getContentPane().add(lblNewLabel);
		
		txtiD = new JTextField();
		txtiD.setBounds(56, 530, 197, 43);
		frame.getContentPane().add(txtiD);
		txtiD.setColumns(10);
		
		lblMusteriD = new JLabel("M\u00FC\u015Fteri \u0130d");
		lblMusteriD.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		lblMusteriD.setBounds(56, 495, 164, 34);
		frame.getContentPane().add(lblMusteriD);
		
		txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(56, 656, 197, 43);
		frame.getContentPane().add(txtTel);
		
		lblMusteriTel = new JLabel("M\u00FC\u015Fteri Telefon ");
		lblMusteriTel.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		lblMusteriTel.setBounds(56, 621, 197, 34);
		frame.getContentPane().add(lblMusteriTel);
		
		txtAdres = new JTextField();
		txtAdres.setColumns(10);
		txtAdres.setBounds(56, 775, 197, 43);
		frame.getContentPane().add(txtAdres);
		
		lblMusteriAdres = new JLabel("M\u00FC\u015Fteri Adres");
		lblMusteriAdres.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		lblMusteriAdres.setBounds(56, 740, 197, 34);
		frame.getContentPane().add(lblMusteriAdres);
		
		txtAd = new JTextField();
		txtAd.setColumns(10);
		txtAd.setBounds(331, 530, 197, 43);
		frame.getContentPane().add(txtAd);
		
		lblMteriAd = new JLabel("M\u00FC\u015Fteri Ad");
		lblMteriAd.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		lblMteriAd.setBounds(331, 495, 197, 34);
		frame.getContentPane().add(lblMteriAd);
		
		txtYas = new JTextField();
		txtYas.setColumns(10);
		txtYas.setBounds(331, 656, 197, 43);
		frame.getContentPane().add(txtYas);
		
		lblMusteriYas = new JLabel("M\u00FC\u015Fteri Ya\u015F");
		lblMusteriYas.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		lblMusteriYas.setBounds(331, 621, 164, 34);
		frame.getContentPane().add(lblMusteriYas);
		
		txtTarih = new JTextField();
		txtTarih.setColumns(10);
		txtTarih.setBounds(331, 775, 197, 43);
		frame.getContentPane().add(txtTarih);
		
		lblMusteriTarih = new JLabel("Kay\u0131t Tarihi");
		lblMusteriTarih.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		lblMusteriTarih.setBounds(331, 740, 197, 34);
		frame.getContentPane().add(lblMusteriTarih);
		
		txtSoyad = new JTextField();
		txtSoyad.setColumns(10);
		txtSoyad.setBounds(632, 530, 197, 43);
		frame.getContentPane().add(txtSoyad);
		
		lblMusteriSoyad = new JLabel("M\u00FC\u015Fteri Soyad");
		lblMusteriSoyad.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		lblMusteriSoyad.setBounds(632, 495, 197, 34);
		frame.getContentPane().add(lblMusteriSoyad);
		
		btnListele = new JButton("M\u00DC\u015ETER\u0130 L\u0130STELE");
		btnListele.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ResultSet myRs=veritabanı.yap(sorgu);
				model.setRowCount(0);
				try {
					
					while(myRs.next()) {
						satirlar[0]=myRs.getString("idmusteri");
						satirlar[1]=myRs.getString("musteri_ad");
						satirlar[2]=myRs.getString("musteri_soyad");
						satirlar[3]=myRs.getString("musteri_telNo");
						satirlar[4]=myRs.getString("musteri_yas");
						satirlar[5]=myRs.getString("musteri_kayıtTarih");
						satirlar[6]=myRs.getString("musteri_adres");
						model.addRow(satirlar);
					}
				}	
				catch(SQLException e1) {
					e1.printStackTrace();
				}
				
				table.setModel(model);
				
			}
		});
		btnListele.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		btnListele.setBounds(604, 609, 250, 49);
		frame.getContentPane().add(btnListele);
		
		btnGuncelle = new JButton("M\u00DC\u015ETER\u0130 G\u00DCNCELLE");
		btnGuncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id,ad,soyad,telNo,yas,tarih,adres,sql_sorgu;
				id=txtiD.getText();
				ad=txtAd.getText();
				soyad=txtSoyad.getText();
				telNo=txtTel.getText();
				yas=txtYas.getText();
				tarih=txtTarih.getText();
				adres=txtAdres.getText();
				
				sql_sorgu="UPDATE musteri SET idmusteri="+id+","+
						"musteri_ad='"+ad+"',musteri_soyad='"+soyad+
						"',musteri_telNo='"+telNo+"',musteri_yas="+yas+""+",musteri_kayıtTarih='"+tarih+"',musteri_adres='"+adres+"'"+" WHERE idmusteri="+id;
						
				veritabanı.guncelle(sql_sorgu);
				
			
					
			}
		});
		btnGuncelle.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		btnGuncelle.setBounds(604, 696, 250, 49);
		frame.getContentPane().add(btnGuncelle);
		
		btnSil = new JButton("M\u00DC\u015ETER\u0130 S\u0130L");
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id,sql_sorgu;
				id=txtiD.getText();
				
				sql_sorgu="DELETE from musteri where idmusteri="+id;
				veritabanı.sil(sql_sorgu);
			}
		});
		btnSil.setFont(new Font("Trajan Pro", Font.PLAIN, 20));
		btnSil.setBounds(604, 775, 250, 49);
		frame.getContentPane().add(btnSil);
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtiD.setText((String) model.getValueAt(table.getSelectedRow(),0));
				txtAd.setText((String) model.getValueAt(table.getSelectedRow(),1));
				txtSoyad.setText((String) model.getValueAt(table.getSelectedRow(),2));
				txtTel.setText((String) model.getValueAt(table.getSelectedRow(),3));
				txtYas.setText((String) model.getValueAt(table.getSelectedRow(),4));
				txtTarih.setText((String) model.getValueAt(table.getSelectedRow(),5));
				txtAdres.setText((String) model.getValueAt(table.getSelectedRow(),6));
				
			}
		});
	
	}

}

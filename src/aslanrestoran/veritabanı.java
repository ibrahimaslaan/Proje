/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aslanrestoran;




import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.*;;

public class veritabanı {
	
	static Connection myConn;
	static Statement myStat;
	
	static ResultSet yap(String sorgu) {
		ResultSet myRs=null;
		try {
		
			 myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aslanrestoran?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","1234");
			 myStat =(Statement) myConn.createStatement();
			myRs= myStat.executeQuery("SELECT *from"+sorgu);
		}
		catch(Exception e) {
	e.printStackTrace();	
	}
		return myRs;	
}
	
	static void ekle(String sorgu) {
		try {

			myStat.executeUpdate(sorgu);
		}
		catch(Exception e) {
	e.printStackTrace();	
	}
			
}
	static void sil(String sorgu) {
		try {

			myStat.executeUpdate(sorgu);
		}
		catch(Exception e) {
	e.printStackTrace();	
	}
			
}
	static void guncelle(String sorgu) {
		try {

			myStat.executeUpdate(sorgu);
		}
		catch(Exception e) {
	e.printStackTrace();	
	}
			
}
}

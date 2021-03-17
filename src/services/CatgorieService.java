package services;
import bean.cnx;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Categorie;


public class CatgorieService {
	
	
	public List<Categorie> GetCatgeories()
	{
		  List<Categorie> le = new ArrayList<Categorie>(); try {
				
				  Class.forName("com.mysql.jdbc.Driver"); Connection cnx =
				  DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
				  String req = "select * from categories";
				  PreparedStatement st =cnx.prepareStatement(req);
				  
				  ResultSet rs = st.executeQuery();
				  Categorie e=null;
				  while(rs.next()) {
					  e=new Categorie();
				  e.setIdcat(rs.getInt("idc"));
				  e.setLibelle(rs.getString("libelle"));
				  
				  
				  le.add(e); }
				 
		  
		  
		  }
		  
		  catch(Exception ex){ ex.printStackTrace();
		  
		  } return le;
		 
	
	
	
	

	
		 
	
	}


}

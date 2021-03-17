package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.User;
import bean.cnx;

public class UserService {
	
	private Connection connexion;
	
	public UserService()
	{
		connexion=cnx.getconnexion();
	}
	

	public User ParseUser(int id, String username,String email,String password,String phone,String compagny,String adresse)
	{
		User u = new User();
		u.setId(id);
		u.setUsername(username);
		u.setEmail(email);
		u.setPassword(password);
		u.setPhone(phone);
		u.setCompagny(compagny);
		u.setAdresse(adresse);
		return u;
	}
	
	
	public void InsertUser(User u)
	{
	String req= "insert into user values (null,?,?,?,?,?,?)"	;
	try {
		PreparedStatement st = connexion.prepareStatement(req);
		st.setString(1,u.getUsername());
		st.setString(2,u.getEmail());	
		st.setString(3,u.getPassword());
		st.setString(4,u.getPhone());
		st.setString(5,u.getCompagny());
		st.setString(6,u.getAdresse());
		st.executeUpdate();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	public User auth(String username , String password)
	{
		User u = null ; 
		String req = "select * from user where username=? and password=?";
		try {
			PreparedStatement st = connexion.prepareStatement(req);
			st.setString(1, username);
			st.setString(2, password);
			ResultSet rs = st.executeQuery();
			
			if(rs.next())
			{
				u=ParseUser(rs.getInt("id"),rs.getString("username"),rs.getString("password"),
				rs.getString("email"),rs.getString("phone"),rs.getString("compagny")
				,rs.getString("adresse"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u ; 
	}
}

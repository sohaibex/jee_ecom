package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Article;
import bean.cnx;

public class ArticleService {
private Connection cnxx;
public ArticleService()
{
	cnxx=cnx.getconnexion();	
}
	
	public List<Article> getArticle()
	{
		List<Article> la = new ArrayList<Article>();
		String req = "select * from article order by dateajout desc limit 3";
		try {
			PreparedStatement pr = cnxx.prepareStatement(req);
			ResultSet rs = pr.executeQuery();
			Article a ;
			while(rs.next())
			{
				a= new Article();
				a.setIda(rs.getInt("id"));
				a.setLibelleArt(rs.getString("libelle"));
				a.setPrix(rs.getInt("prix"));
				a.setDetails(rs.getString("details"));
				a.setDescription(rs.getString("description"));
				a.setUrl_img(rs.getString("urlimg"));
				a.setCouleur(rs.getString("couleur"));
				a.setIdcat(rs.getInt("idcat"));
				a.setDateAjout(rs.getDate("dateajout"));
				la.add(a);
				
			}
		} catch (Exception e) {
			
		}
	
		return la ;
	}
	
	
	

	public List<Article> getPromotion()
	{
		List<Article> la = new ArrayList<Article>();
		String req = "select * from article where promotion=1 order by dateajout desc limit 3";
		try {
			PreparedStatement pr = cnxx.prepareStatement(req);
			ResultSet rs = pr.executeQuery();
			Article a ;
			while(rs.next())
			{
				a= new Article();
				a.setIda(rs.getInt("id"));
				a.setLibelleArt(rs.getString("libelle"));
				a.setPrix(rs.getInt("prix"));
				a.setDetails(rs.getString("details"));
				a.setDescription(rs.getString("description"));
				a.setUrl_img(rs.getString("urlimg"));
				a.setCouleur(rs.getString("couleur"));
				a.setIdcat(rs.getInt("idcat"));
				a.setDateAjout(rs.getDate("dateajout"));
				la.add(a);
				
			}
		} catch (Exception e) {
			
		}
		System.out.println(la.size());
		return la ;
	}


}

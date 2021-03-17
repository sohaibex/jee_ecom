<%@page import="bean.Categorie"%>
<%@page import="java.util.List"%>
<%@page import="services.CatgorieService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<div class="right_box">
             
             	<div class="title"><span class="title_icon"><img src="images/bullet5.gif" alt="" title="" /></span>Categories</div> 
                
                <ul class="list">
                
                <%
                
                CatgorieService cs = new CatgorieService();
                
               List<Categorie>lc= cs.GetCatgeories();
               
                for(Categorie c :lc)
                {
                	
  
                
                %>
                
                   <li><a href="#"><%=c.getLibelle()%></a></li> 	
               <%}%> 
              
               
                                                        
                </ul>
                
             	<div class="title"><span class="title_icon"><img src="images/bullet6.gif" alt="" title="" /></span>Partners</div> 
                
                <ul class="list">
                <li><a href="#">accesories</a></li>
                <li><a href="#">pets gifts</a></li>
                <li><a href="#">specials</a></li>
                <li><a href="#">hollidays gifts</a></li>
                <li><a href="#">accesories</a></li>
                <li><a href="#">pets gifts</a></li>
                <li><a href="#">specials</a></li>
                <li><a href="#">hollidays gifts</a></li>
                <li><a href="#">accesories</a></li>                              
                </ul>      
             
             </div>         
             
        
        </div><!--end of right content-->
        
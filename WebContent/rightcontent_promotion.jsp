<%@page import="bean.Article"%>
<%@page import="java.util.List"%>
<%@page import="services.ArticleService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
         
             <div class="right_box">
             
              <%
           ArticleService as = new ArticleService();
           List<Article>la = as.getPromotion();
           for(Article a :la)
           {
           %>
             	<div class="title"><span class="title_icon"><img src="images/bullet4.gif" alt="" title="" /></span>Promotions</div> 
                    <div class="new_prod_box">
                    <a href="details.jsp?id=<%=a.getIda()%>"><%=a.getLibelleArt()%></a>
                        
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                        <a href="details.html"><img src="images/<%=a.getUrl_img() %>" alt="" title="" class="thumb" border="0" /></a>
                        </div>           
                    </div>
                       <%} %>    
                 
             </div>
             
             
             
             
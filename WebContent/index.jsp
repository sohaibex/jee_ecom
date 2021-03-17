<%@page import="services.ArticleService"%>
<%@page import="bean.Article"%>
<%@page import="bean.Categorie"%>
<%@page import="java.util.List"%>
<%@page import="services.CatgorieService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<title>Pet Shop</title>
<link rel="stylesheet" type="text/css" href="style.css" />

</head>
<body>

<div id="wrap">

	<jsp:include page="header.jsp" />
       
       
       <div class="center_content">
       	<div class="left_content">
        	
            <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>Featured pets</div>
        
        	<div class="feat_prod_box">
            
            	<div class="prod_img"><a href="details.html"><img src="images/prod1.gif" alt="" title="" border="0" /></a></div>
                
                <div class="prod_det_box">
                	<div class="box_top"></div>
                    <div class="box_center">
                    <div class="prod_title">Product name</div>
                    <p class="details">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.</p>
                    <a href="details.html" class="more">- more details -</a>
                    <div class="clear"></div>
                    </div>
                    
                    <div class="box_bottom"></div>
                </div>    
            <div class="clear"></div>
            </div>	
            
            
        	<div class="feat_prod_box">
            
            	<div class="prod_img"><a href="details.html"><img src="images/prod2.gif" alt="" title="" border="0" /></a></div>
                
                <div class="prod_det_box">
                	<div class="box_top"></div>
                    <div class="box_center">
                    <div class="prod_title">Product name</div>
                    <p class="details">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.</p>
                    <a href="details.html" class="more">- more details -</a>
                    <div class="clear"></div>
                    </div>
                    
                    <div class="box_bottom"></div>
                </div>    
            <div class="clear"></div>
            </div>      
            
            
            
           <div class="title"><span class="title_icon"><img src="images/bullet2.gif" alt="" title="" /></span>New pets</div> 
           
           <div class="new_products">
           <%
           ArticleService as = new ArticleService();
           List<Article>la = as.getArticle();
           for(Article a :la)
           {
           %>
           
                    <div class="new_prod_box">
                        <a href="details.jsp?id=<%=a.getIda()%>"><%=a.getLibelleArt()%></a>
                        <div class="new_prod_bg">
                        <span class="new_icon"><img src="images/new_icon.gif" alt="" title="" /></span>
                        <a href="details.jsp?id=<%=a.getIda()%>">
                        <img src="images/<%=a.getUrl_img() %>" alt="" title="" class="thumb" border="0" />
                        </a>
                        </div>           
                    </div>
                    
                   <%} %>      
            
            </div> 
          
            
        <div class="clear"></div>
        </div><!--end of left content-->
        
        <jsp:include page="rightcontent.jsp" />
        
        
       
       
       <div class="clear"></div>
       </div><!--end of center content-->
       
              
  	<jsp:include page="footer.jsp" />
    

</div>

</body>
</html>
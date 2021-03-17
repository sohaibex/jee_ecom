<%@ page language="java" contentType="text/jsp; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <div class="header">
       		<div class="logo"><a href="index.jsp"><img src="images/logo.gif" alt="" title="" border="0" /></a></div>            
        <div id="menu">
            <ul>                                                                       
            <li><a href="index.jsp">home</a></li>
            <li class="selected"><a href="about.jsp">about us</a></li>
            <li><a href="categorie.jsp">pets</a></li>
            <li><a href="specials.jsp">specials pets</a></li>
            <%
            if(session.getAttribute("User")==null)
            {
            	%>
            <li><a href="myaccount.jsp">my account</a></li>
            <li><a href="register.jsp">register</a></li>
            
                <%
            }
            
            else
            {
            	%>
            	  <li><a href="logout.jsp">Logout</a></li>
            <%
            } 
            
            %>
            
         
            <li><a href="details.jsp">prices</a></li>
            <li><a href="contact.jsp">contact</a></li>
            </ul>
        </div>     
            
            
       </div> 
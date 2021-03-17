package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import bean.User;
import services.UserService;

/**
 * Servlet implementation class AuthController
 */
@WebServlet("/AuthServlet")
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		UserService us = new UserService();
	User u=	us.auth(request.getParameter("username"), request.getParameter("password"));
	
		if(u==null)
		{
			response.sendRedirect("myaccount.jsp");
		}
		else
		{
	HttpSession session = request.getSession();
	session.setAttribute("User", u);
	Cookie ck = new Cookie("id",u.getId()+"");
	ck.setMaxAge(365*24*60*60);
	response.addCookie(ck);
			response.sendRedirect("index.jsp");
		}
		
		
		
		
	}

}

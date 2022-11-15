package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UsernameServlet
 */
@WebServlet("/UsernameServlet")
public class UsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsernameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		String username = request.getParameter("username");
	
		Cookie usernameCookie = new Cookie("username-cookie", username);
//		Cookie idCookie = new Cookie(username, username)
		
		response.addCookie(usernameCookie);
		
		createAndShowForm(writer);
		
		writer.flush();
		writer.close();
		
	}
	
	private void createAndShowForm(PrintWriter writer) {
		
		writer.write("<a href='cookieinfo'> Purchase products <a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

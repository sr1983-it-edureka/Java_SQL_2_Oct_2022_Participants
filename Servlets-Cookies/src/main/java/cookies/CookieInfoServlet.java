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
//@WebServlet("/UsernameServlet")
public class CookieInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		Cookie[] allCookies = request.getCookies();
		
		boolean loggedInUser = false;
		String username = null;
		
		if (allCookies != null) {

			writer.write("All Cookies != null");
			for (Cookie cookie : allCookies) {
				
				String name = cookie.getName();
				String value = cookie.getValue();
			
				if (name != null && name.equals("username-cookie")) {

					if (value != null && value.length() > 0) {
						
						loggedInUser = true;
						username = value;
					}else {
						loggedInUser = false;
					}
				}else {
					writer.write("FInal Else part");
					loggedInUser = false;
				}
				
					
			}
			
			
		}
		
		
		writer.write("LoggedInuser " + loggedInUser);
		
		if (loggedInUser) {
			// Logged in
			writer.write(
					String.format("Welcome logged in user - %s", username));
		}else {
			writer.write(
					String.format("Please go to our login home"));

		}
		
		writer.flush();
		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

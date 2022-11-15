package date;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DateServlet
 */
//@WebServlet("/DateServlet")
public class DateServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DateServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter writer = 
		response.getWriter();
		
		
		writer.write("<h1>Date Information</h1>");
		
		writer.write("<a href='http://www.google.com'>Go to Google</a>");
		
		
//		String[] languages = Locale.getISOLanguages();
//		for (int i = 0; i < languages.length; i++){
//			
//		    Locale loc = new Locale(languages[i]);
//
//		    Calendar calendar = Calendar.getInstance(loc);
////		    String dateAsString = calendar .toString();
//		    
//			writer.write(loc.getDisplayCountry() + "-" + loc.getDisplayLanguage());
////			writer.write("<br></br>");
//
//		}		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

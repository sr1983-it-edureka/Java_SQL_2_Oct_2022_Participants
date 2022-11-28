package com.edureka.javasql2.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IncludeForwardServlet
 */
@WebServlet("/IncludeForwardServlet")
public class IncludeForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IncludeForwardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

		String type = request.getParameter("type");

		PrintWriter writer  = response.getWriter();

		if (type.equals("include")) {
			

			
			RequestDispatcher rd = request.getRequestDispatcher("include.html");
			

			writer.println("Before Inclusion...");
			
			rd.include(request, response);
			
			writer.println("After Inclusion...");			
			
		}else if (type.equals("forward")) {
			
			RequestDispatcher rd = 
			request.getRequestDispatcher("forwarded-products-manager");

			writer.println("Before Forward...");

			rd.forward(request, response);

			writer.println("After Forward...");
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

package com.edureka.javasql2.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductsManagerServlet
 */
public class ProductsManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ProductsManagerServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		class Product {
			
			String name;
			String description;
			
			public Product(String name, String description) {
				
				this.name = name;
				this.description = description;
			}
		}

		ArrayList<Product> products  = new ArrayList();
		products.add(new Product("Samsung Mobile", "Some infor about Mobile"));
		products.add(new Product("Sony  Bravia", "Some infor about TV"));
		products.add(new Product("Crystals", "Red and Green colored crystals"));
		
		StringBuilder contents = new StringBuilder();
		
		
		String initialContent = 
			"<table>" +
			"<tr>" +
				"<th> Name </th>" +
				"<th> Description</th>" +
			"</tr>";

		contents.append(initialContent);
		
		for (Product productObj : products) {

			String product = 
					
					"<tr>" +
						"<td>" + productObj.name + "</td>" +
						"<td>" + productObj.description + "</td>" +							
					"</tr>";
			
			contents.append(product);
		}

		response.setContentType("text/html");

		PrintWriter writer = response.getWriter();
		
		writer.write(contents.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
